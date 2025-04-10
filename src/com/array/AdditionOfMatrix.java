package com.array;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		int brr[][]=new int[n][n];
		int crr[][]=new int[n][n];
		
		
		//first array
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("arr["+i+"]["+j+"] = ");
				arr[i][j]=sc.nextInt();
			}
		}
		//Second array
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						System.out.print("brr["+i+"]["+j+"] = ");
						brr[i][j]=sc.nextInt();
					}
				}
		
		//addition of Array
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						crr[i][j]=arr[i][j]+brr[i][j];
					}
				}
		
				//output
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						System.out.print(crr[i][j]+" ");
					}
					System.out.println();
				}

	}

}
