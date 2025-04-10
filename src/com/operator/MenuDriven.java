package com.operator;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int flag=1;
		
		while(flag!=0) {
			System.out.println("1.Samosa");
			System.out.println("2.Wada Paw");
			System.out.println("3.Pohe");
			System.out.println("4.Idali");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();//4
			
			switch(choice) {
			
			case 1:{
				System.out.println("You have ordered Samosa");
				break;
			}
			case 2:{
				System.out.println("You have ordered Wada Paw");
				break;
			}
			case 3:{
				System.out.println("You have ordered Pohe");
				break;
			}
			case 4:{
				System.out.println("You have ordered Idali");
				break;
			}
			case 5:{
				flag=0;
				continue;
			}
			default:{
				System.out.println("Invalid Input...!");
			}
			}
			
			System.out.println("Do you want's to continue...yes...or...no");
			String str=sc.next();
			if(str.equals("yes")) {
				
			}
			else {
				flag=0;
			}
		}
		
		System.err.println("Application has been closed...!");

	}

}
