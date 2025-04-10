package com.collection;

import java.util.ArrayDeque;

public class ArrayDequeueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> list=new ArrayDeque<Integer>();
		
		list.add(43);
		list.offer(87);
		list.add(23);
		list.add(2);
		list.add(4);
		list.add(43);
		list.offerFirst(54);
		
		
		System.out.println(list);

	}

}
