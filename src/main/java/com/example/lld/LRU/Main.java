package com.example.lld.LRU;

public class Main {

    public static void main(String[] args) {
        Cache cache = new Cache(4);
        System.out.println(cache.getCacheMemory());
        cache.set(1,"Ashraf");
        cache.set(2,"Afzal");
        cache.set(3,"Arshad");
        cache.set(4,"Sana");
        cache.set(5,"papa");
        cache.set(3,"ammi");
        System.out.println(cache.getCacheMemory());
        System.out.println(cache.get(5));
        System.out.println(cache.getCacheMemory());
    }
}
