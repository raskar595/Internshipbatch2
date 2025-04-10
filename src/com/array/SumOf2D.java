package com.array;

import java.util.Scanner;

public class SumOf2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		
		for(int i=0; i<n; i++) {//i=0    <3
			for(int j=0; j<n; j++) {//j=0,1,2   <3
				System.out.print("arr["+i+"]["+j+"] = ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		int res=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				res+=arr[i][j];
			}
		}
		
		System.out.println("The sum of all elements from Array: "+res);
		
	}

}
