package com.example.lld.RateLimiter.SlideWindowCounter;

import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

public class UserRequest {
    String userId;

    @CreationTimestamp
    Date date;

    public UserRequest(String userId){
        this.userId=userId;
        this.date=new Date();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
