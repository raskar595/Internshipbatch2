package com.operator;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the age to check given voter is Eligible for Voting or Not: ");
		int age=sc.nextInt();//17
		//17 >= 18
		if(age>=18) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("Not Eligible for Voting.");
		}
	}

}
