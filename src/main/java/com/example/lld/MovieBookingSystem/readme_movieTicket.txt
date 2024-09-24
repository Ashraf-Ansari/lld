Seat - ( id , isfree , price )
Theater - id,name,location,screen_list
User - id,name,email,booking_list
Screen - id,capacity,show_list , Theater
show - id,movie,screen,seat_list
movie - id,title,genre,duration,show_list
Booking - id,user,show,bookedseats
payment - id,amount,payment_date,booking