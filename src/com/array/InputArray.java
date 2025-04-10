package com.array;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int s=sc.nextInt();
		
		int arr[]=new int[s];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"] = ");
			arr[i]=sc.nextInt();
		}//return the sum of all elements from the array.
		
		int res=0;
		
		for(int data:arr) {
			res+=data;
		}

		System.out.println("The addition of all elements from the array: "+res);
	}

}
