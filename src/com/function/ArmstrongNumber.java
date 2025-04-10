package com.function;

public class ArmstrongNumber {
	
	public int count(int num) {//12
		
		int cout=0;
		
		while(num!=0) {
			num=num/10;
			cout++;
		}
		
		return cout;
	}
	
	public int pow(int a,int b) {
		
		int res=1;
		
		for(int i=1; i<=b; i++) {
			res*=a;
		}
		return res;
	}
	
	public void armstrong(int n) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArmstrongNumber obj=new ArmstrongNumber();
		
		System.out.println(obj.pow(2, 3));
	}

}
