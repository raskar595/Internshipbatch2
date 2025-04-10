package com.multithreading;

public class MyEarnings extends Thread{
	
	int earning=0;
	
	public void run() {
		synchronized (this) {
			for(int i=1; i<=10; i++) {
				earning+=100;
			}
			notify();
		}		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyEarnings th=new MyEarnings();
		th.start();
		
		synchronized (th) {
			th.wait();
			System.out.println(th.earning);
		}
	}

}
