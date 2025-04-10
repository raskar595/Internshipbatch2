package com.multithreading;

public class DataInconsistency extends Thread{
	
	static TicketBooking tk;
	
	public void run() {
		tk.bookingSeats(6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 tk=new TicketBooking();

		DataInconsistency th=new DataInconsistency();
		th.start();
		
		DataInconsistency th1=new DataInconsistency();
		th1.start();
	}

}
