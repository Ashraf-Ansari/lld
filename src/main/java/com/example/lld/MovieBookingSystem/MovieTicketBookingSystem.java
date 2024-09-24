package com.example.lld.MovieBookingSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class MovieTicketBookingSystem {
    Map<Long,User> userMap;
    Map<Long,Movie> movieMap;
    Map<Long,Show> showMap;
    Map<Long,Theater> theaterMap;
    
    public MovieTicketBookingSystem() {
        this.userMap = new HashMap<>();
        this.movieMap = new HashMap<>();
        this.showMap = new HashMap<>();
        this.theaterMap=new HashMap<>();
    }
    
    public void addUser(User user){
        userMap.put(user.getId(), user);
    }
    public void addMovie(Movie movie){
        movieMap.put(movie.getId(), movie);
    }
    public void addShow(Show show){
        showMap.put(show.getId(), show);
    }
    
    public void addTheater(Theater theater) {
        theaterMap.put(theater.getId(),theater);
    }
    
    public Booking bookTickets(List<String> seats,Show show,User user){
        List<Seat> seatsToBook = new ArrayList<>();
        for(Seat seat: show.getSeats()){
            if(seats.contains(seat.getId()) && seat.isFree()){
                seatsToBook.add(seat);
            }
        }
        if(seatsToBook.size()!=seats.size()){
            System.out.println("Some Seats are already booked");
            return null;
        }
        
        for(Seat seat:seatsToBook){
            seat.bookSeat();
        }
        
        Booking booking = new Booking(UUID.randomUUID().toString(),new Date(),user,show);
        booking.setBookedSeats(seatsToBook);
        user.addBooking(booking);
        return booking;
    }
    
    public Payment makePayment(Double amount,Booking booking) {
        
        Payment payment = new Payment(UUID.randomUUID().getLeastSignificantBits(),new Date(),amount,booking);
        return payment;
    }
}
