package com.function;

import java.util.Scanner;

public class Mathametics {
	
	public void addition(int a,int b) {
		
		int sum=a+b;
		System.out.println("The addition of A & B: "+sum);
	}
	
	public void aoc(int radius) {
		double res=Math.PI*(radius*radius);
		System.out.println("Area of Circle: "+res);
	}
	
	public int square(int a) {
		int res=a*a;
		return res;
	}
	
	public static String myself(String name) {
		return "My name is "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Mathametics obj=new Mathametics();
		
//		System.out.println("Enter the value of A: ");
//		int a=sc.nextInt();
//
//		System.out.println("Enter the value of B: ");
//		int b=sc.nextInt();
//		
//		obj.addition(a, b);
		
		System.out.println(obj.myself("Suraj"));

	}

}
