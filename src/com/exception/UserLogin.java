package com.exception;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String valEmail="admin@admin.com";
		String valPass="admin@123";
		
		System.out.println("Enter the Email: ");
		String email=sc.next();
		
		System.out.println("Enter the Password: ");
		String pass=sc.next();
		
		if(valEmail.equals(email) &&  valPass.equals(pass)) {
			System.out.println("User login Successfully.");
		}
		else {
			throw  new InvalidCredentialsException("wrong Credentials.");
		}
		
	}

}
