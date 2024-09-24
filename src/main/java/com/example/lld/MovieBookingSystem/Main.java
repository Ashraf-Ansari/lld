package com.example.lld.MovieBookingSystem;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        MovieTicketBookingSystem ticketBookingSystem = new MovieTicketBookingSystem();
        User user1 = new User(1L,"Ashraf","ashraf@gmail.com");
        User user2 = new User(2L,"Shoyab","shoyab@gmail.com");
        Movie movie1 = new Movie(1L,"KGF3","Action",2);
        Theater theater = new Theater(1L,"Carnival","Asansol");
        Screen screen1 = new Screen(1L,300,theater);
        theater.addScreen(screen1);
        Show show1 = new Show(1L,new Date(),movie1,screen1);
        screen1.addShow(show1);
        
        ticketBookingSystem.addUser(user1);
        ticketBookingSystem.addUser(user2);
        ticketBookingSystem.addMovie(movie1);
        ticketBookingSystem.addTheater(theater);
        ticketBookingSystem.addShow(show1);
        
//        booking ticket
        List<String> seatsBook = Arrays.asList("S1","S2","S3");
        Booking booking = ticketBookingSystem.bookTickets(seatsBook,show1,user1);
        Booking booking2 = ticketBookingSystem.bookTickets(seatsBook,show1,user1);
        if(booking2!=null){
            System.out.println("Booking Successfull. Booking ID: "+booking.getId());
//            make payment
            Payment payment = ticketBookingSystem.makePayment(600.0, booking);
            if(payment!=null){
                System.out.println("Payment successful. Payment ID: " + payment.getId());
            }
            else {
                System.out.println("Payment Failed");
            }
        }
        else {
            System.out.println("Booking Failed");
        }
        
    }
}
