package com.example.lld.RateLimiter.SlideWindowCounter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RedisService redisService = new RedisService(5);
        SimpleThread obj = new SimpleThread("Ashraf",redisService);
        SimpleThread obj2 = new SimpleThread("Afzal",redisService);
        obj.start();
        obj2.start();
    }
}
