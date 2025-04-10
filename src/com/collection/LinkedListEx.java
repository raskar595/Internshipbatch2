package com.collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(23);
		list.add(2);
		list.add(8);
		list.add(1);
		list.offerFirst(null);
		list.addFirst(null);
		list.add(2);
		list.addLast(32);
		list.add(9);
		
		System.out.println(list);

	}

}
