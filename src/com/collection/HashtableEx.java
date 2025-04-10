package com.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> list=new Hashtable<Integer, String>();
		
		list.put(101, "Suraj");
		list.put(109, "Abhay");//109%11
		list.put(111, "Omkar");//
		list.put(112, "Vishal");//
		
		System.out.println(list);
		
		for(Map.Entry<Integer, String> data:list.entrySet()) {
			System.out.println(data.getKey()+" -> "+data.getValue());
		}

	}

}
