package com.example.lld.RateLimiter.SlideWindowCounter;

public class SimpleThread extends Thread{

    RedisService redisService;

    public SimpleThread(String name,RedisService redisService){
        super(name);
        this.redisService=redisService;
    }

    public void run() {
        for (int i = 1; i <= 70; i++) {
            System.out.println("Thread Name - " + getName() + " Time - " + i + " " + hit(new UserRequest(getName())));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + getName());
    }


    private String hit(UserRequest userRequest) {
        return redisService.requestHit(userRequest);
    }

}
