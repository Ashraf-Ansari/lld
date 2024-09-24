package com.example.lld.MovieBookingSystem;

import java.util.Date;

public class Payment {
    Long id;
    Date paymentDate;
    Double amount;
    Booking booking;
    
    public Payment(Long id, Date paymentDate, Double amount,Booking booking) {
        this.id = id;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.booking=booking;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Date getPaymentDate() {
        return paymentDate;
    }
    
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    
    public Double getAmount() {
        return amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
}
