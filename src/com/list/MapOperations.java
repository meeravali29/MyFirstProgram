package com.list;

import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;

public class MapOperations {
	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
//		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
//		Map<String, Integer> map = new TreeMap<String, Integer>();		
		
		map.put("Meera", 7);
		map.put("karishma", 2);
		map.put("Humyra", 3);
		map.put("shaik", 1);
		map.put("vali", 4);
		map.put("Vinay", 5); 
		
		
		System.out.println(map);
		
		
	}
	
	

}
