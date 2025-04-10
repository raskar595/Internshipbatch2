package com.patterns;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++) {//i=1,2,3,4    <=4
			for(int j=i; j<=4; j++) {//j=3,4   <=4
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			for(int k=2; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//reverse
		
		for(int i=4; i>=1; i--) {//i=1,2,3,4    <=4
			for(int j=4; j>=i; j--) {//j=3,4   <=4
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--) {
				System.out.print("*");
			}
			for(int k=i; k>=2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
