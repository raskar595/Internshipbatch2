package com.multithreading;

public class TicketBooking {
	
	int totalTk=10;
	
	public  void bookingSeats(int seats) {
		
		System.out.println("Suraj");
		System.out.println("Om");
		
		synchronized (this) {
			if(totalTk>=seats) {
				System.out.println(seats+" tickets are booked Successfully.");
				totalTk-=seats;
				System.out.println(totalTk+" seats are Available.");
			}
			else {
				System.out.println(seats+" tickets are not Available.");
				System.out.println("But "+totalTk+" seats are Available.");

			}
		}
	}
	
	public static void main(String[] args) {
		
		TicketBooking obj=new TicketBooking();
		obj.bookingSeats(6);//10-6=4
		obj.bookingSeats(6);//4-6=
		
	}

}
