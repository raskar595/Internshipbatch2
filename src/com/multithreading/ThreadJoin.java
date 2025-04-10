package com.multithreading;

public class ThreadJoin extends Thread{
	
	static Thread main;
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
			try {
				main.join();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main=Thread.currentThread();

		ThreadJoin th=new ThreadJoin();
		th.start();
		
		for(int i=1; i<=5; i++) {
			try {
//				th.join();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

}
