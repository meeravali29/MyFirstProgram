package com.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
//import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperation {
	
	public static void main(String[] args) {
		
		Set<Integer> setop = new HashSet<Integer>();
		
		setop.add(null);
		setop.add(122456);
		setop.add(4683);
		setop.add(92834289);
		setop.add(null);
		System.out.println(setop);
		
		
		Set s = new HashSet();
		
		s.add("meera");
		s.add("humyra");
		s.add("Software");
		s.add(7978);
		s.add(null);
		s.add(null);
		
		System.out.println(s);
		System.out.println("====================================");
		
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		
		s1.add(938562);
		s1.add(011);
		s1.add(289734);
		s1.add(876455);
		s1.add(938562);
		
		System.out.println("Printing the Set values"+s1);
		
		Set<Integer> s2 = new TreeSet<Integer>();
		
		s2.add(23456);
		s2.add(87654);
		s2.add(32211);
		s2.add(98870);
		s2.add(23456);
		s2.add(11);
		
		System.out.println(s2);
		
		
		
		
		
	}

}
