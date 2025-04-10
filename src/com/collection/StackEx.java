package com.collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> list=new Stack<Integer>();
		
		list.push(23);
		list.add(2);
		list.add(null);
		list.add(3);
		list.add(25);
		
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		System.out.println(list.peek());
		
		
		System.out.println(list);

	}

}
