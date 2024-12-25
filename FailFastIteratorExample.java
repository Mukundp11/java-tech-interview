package com.nit.mukund;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorExample {

	public static void main(String[] args) {

		List<String> l=new ArrayList<>();
		l.add("banana");
		l.add("apple");
		l.add("mango");
		
		System.out.println("list of fruits:"+l);
		Iterator<String> iterator = l.iterator();
		
		
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println("current fruits:"+fruit);
			l.remove(fruit);
			if(fruit.equals("apple")) {
				l.remove(fruit);
			}
			
		}
		
	}

}
