package com.array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();//3
		
		int arr[][]=new int[n][n];
		
		for(int i=0; i<n; i++) {//i=0,1    <3
			for(int j=0; j<n; j++) {//j=0   <3
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}

	}

}
