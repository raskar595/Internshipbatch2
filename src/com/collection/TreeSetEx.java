package com.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<Integer> li=new ArrayList<Integer>();
		
		
		
		li.add(23);
		li.add(9);
		li.add(2);
		li.add(2);
		
		
		TreeSet<Integer> list=new TreeSet<Integer>(li);
		
		list.add(3);
		list.add(9);
		list.add(32);
		list.add(12);
		list.add(9);
		
		
		System.out.println(list);

	}

}
