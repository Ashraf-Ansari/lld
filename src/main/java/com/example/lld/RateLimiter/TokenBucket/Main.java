package com.example.lld.RateLimiter.TokenBucket;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
        TokenRefiller obj = new TokenRefiller();
        ScheduledFuture<?> scheduledFuture = pool.scheduleAtFixedRate(obj, 0, 10, TimeUnit.SECONDS);
        System.out.println("print last line");
        for(int i=0;i<10;i++){
            for(String key:obj.obj.keySet()){
                Integer value = obj.obj.get(key);
                value = Math.max(0,value-2);
                obj.obj.put(key,value);
            }
            System.out.println("print after thread"+obj.obj);
            Thread.sleep(7000);
        }
    }
}
