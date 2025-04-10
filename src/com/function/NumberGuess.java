package com.function;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		double val=Math.random()*10;
		int magic=(int)val;
		
//		System.out.println(magic);
		
		System.out.println("Enter the number to try your Luck: ");
		int num=sc.nextInt();
		
		int count=1;
		
		while(magic!=num) {
			System.out.println("Wrong guess try again: ");
			num=sc.nextInt();
			count++;
		}
		
		System.err.println("Congratulations you have Won 100000! At "+count+" Chance.");
		
		
	}

}
