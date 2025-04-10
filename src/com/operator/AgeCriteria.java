package com.operator;

import java.util.Scanner;

public class AgeCriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the age to check Category: ");
		int age=sc.nextInt();
		
		if(age>60 && age<100) {
			System.out.println("Senior Citizen.");
		}
		else if(age>25 && age<=60){
			System.out.println("Employeed Person");
		}
		else if(age>18 && age<=25) {
			System.out.println("College Student");
		}
		else if(age>16 && age<=18){
			System.out.println("Junior Collge Student");
		}
		else if(age>11 && age<16) {
			System.out.println("Z.P.School");
		}
	}

}
