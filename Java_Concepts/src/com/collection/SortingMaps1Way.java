package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortingMaps1Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Bhumika");
		map.put(5, "Nitin");
		map.put(3, "Sourav");
		map.put(4, "Neeraj");
		map.put(8, "Monika");
		
		List<Map.Entry<Integer,String>> entriesList = new ArrayList<>(map.entrySet());
		Collections.sort(entriesList, (a,b)->a.getKey().compareTo(b.getKey()));
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
	    for (Map.Entry<Integer, String> entry : entriesList) {
	        sortedMap.put(entry.getKey(), entry.getValue());
	    }
	    
	    System.out.println(sortedMap);
	}
}
