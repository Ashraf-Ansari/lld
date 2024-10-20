package com.example.lld.LRU.DoubleLinkList;

import com.example.lld.LRU.Cache;

public class Main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.set("A","Ashraf");
        cache.set("B","Ashraf");
        cache.set("C","Ashraf");
        cache.set("D","A");
        System.out.println(cache.get("B"));
        cache.set("E","Ashraf");

        System.out.println(cache.cache.keySet());
    }
}
