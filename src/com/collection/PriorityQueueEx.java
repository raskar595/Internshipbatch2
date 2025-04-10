package com.collection;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		
		li.add(7);
		li.add(23);
		li.add(44);
		li.add(0);
		
		PriorityQueue<Integer> list=new PriorityQueue<Integer>(li);
		
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(1);
		
		System.out.println(list);

	}

}
