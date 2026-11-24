package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
	
	public static void main(String[] args) {
		
		List<Integer> integer = new ArrayList<Integer>();
		
		integer.add(12106);
		integer.add(2313);
		integer.add(8734);
		//integer.remove(2);
		System.out.println("Integers:" + integer);
		System.out.println("----------------------------------");
		
	 Iterator<Integer> iterator = integer.iterator();
	 while(iterator.hasNext()) {
		 Integer num =iterator.next();
		 System.out.println(num);
	 }
	}

}
