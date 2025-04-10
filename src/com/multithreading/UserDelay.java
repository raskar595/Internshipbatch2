package com.multithreading;

public class UserDelay extends Thread{
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDelay th=new UserDelay();
		th.start();

		UserDelay th1=new UserDelay();
		th1.start();
	}

}
