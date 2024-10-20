package com.example.lld.RateLimiter.SlideWindowCounter;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class RedisService {
    int rpm;
    Map<String, LinkedList<UserRequest>> userRequestMap;

    RedisService(int rpm){
        this.rpm=rpm;
        this.userRequestMap=new ConcurrentHashMap<>();
    }

    public synchronized String requestHit(UserRequest userRequest){
        if(userRequestMap.containsKey(userRequest.getUserId())){
            if(getElapsedRequest(userRequest)< rpm) {
                LinkedList<UserRequest> temp = userRequestMap.get(userRequest.getUserId());
                temp.add(userRequest);
                userRequestMap.put(userRequest.getUserId(), temp);
            }else {
                return "request Dropped "+userRequest.getUserId();
            }
        }else {
            LinkedList<UserRequest> temp = new LinkedList<>();
            temp.add(userRequest);
            userRequestMap.put(userRequest.getUserId(),temp);
        }
        return "request Hit "+userRequest.getUserId();
    }

    private synchronized int getElapsedRequest(UserRequest userId){
        LinkedList<UserRequest> userRequests = userRequestMap.get(userId.getUserId());
        if(userRequests.size()<rpm)
            return userRequests.size();
        while(true){
            if(userId.getDate().toInstant().getEpochSecond()- userRequests.get(0).getDate().toInstant().getEpochSecond()>60){
                userRequests.removeFirst();
            }else {
                break;
            }
        }
        System.out.println("getElapsedRequest "+userRequests.size());
        return userRequests.size();
    }
}
