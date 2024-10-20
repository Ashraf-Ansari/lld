package com.example.lld.LRU;

import java.util.*;

public class Cache {

    int size;
    private LinkedList<Integer> cacheMemory;
    private Map<Integer,String> map ;

    Cache(int size){
        cacheMemory = new LinkedList<>();
        this.size=size;
        map = new HashMap<>();
    }

    void set(Integer key,String value){
        if(map.containsKey(key)){
            cacheMemory.remove(key);
        }else {
            if(cacheMemory.size()==size){
                cacheMemory.remove(0);
            }
        }
        cacheMemory.add(key);
        map.put(key,value);
    }

    public String get(Integer key){
        if(map.containsKey(key)){
            String value = map.get(key);
            cacheMemory.remove(key);
            cacheMemory.add(key);
            return value;
        }else {
            return null;
        }
    }

    public List<Integer> getCacheMemory() {
        return cacheMemory;
    }
}
