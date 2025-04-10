package com.multithreading;

public class ThreadEx extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		
		ThreadEx th=new ThreadEx();
		th.start();
		

		ThreadEx th1=new ThreadEx();
		th1.start();


	}

}
