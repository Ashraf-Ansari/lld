package com.example.lld.RateLimiter.TokenBucket;

import java.util.HashMap;
import java.util.Map;

public class TokenRefiller implements Runnable{

    public Map<String,Integer> obj ;

    TokenRefiller(){
        this.obj=new HashMap<>();
        obj.put("A",0);
        obj.put("B",1);
        obj.put("C",5);
    }

    @Override
    public void run() {
        System.out.println("print before ");
        for(String key: obj.keySet()){
            Integer value = obj.get(key);
            System.out.println(String.format("%s %s",key,value));
            value = Math.min(10,value+3);
            obj.put(key,value);
        }
        System.out.println("print after " +obj);
    }
}
