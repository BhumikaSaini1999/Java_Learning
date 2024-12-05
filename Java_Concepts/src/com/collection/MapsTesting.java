package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapsTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("bhumi",1);
		map.put("nitish",2);
		map.put("naman", 3);
		
		//System.out.println(map.get("bhumika"));
		//System.out.println(map.containsKey("naman"));
		//System.out.println(map.getOrDefault("bhumika", 87));
		
		Map<Integer, List<Integer>> adj = new HashMap<>();
//		if(adj.get(1)==null)
//		   adj.put(1, new ArrayList<>());
//		adj.get(1).add(2);
		
		adj.computeIfAbsent(1, f-> new ArrayList<>()).add(2);
		//System.out.println(adj.get(1));
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		for(Map.Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(String key : map.keySet())
			System.out.println(key+" , "+map.get(key));
		
		NavigableMap<Integer, String> tMap = new TreeMap<>((a,b)->-a.compareTo(b));
		tMap.put(1,"bhumi");//O(logn)
		tMap.put(2,"nitish");
		tMap.put(7,"naman");
		//System.out.println(tMap);
		//System.out.println(tMap.pollFirstEntry());
		//System.out.println(tMap.pollLastEntry());
		
		//7,5,3,2,1
		System.out.println("ceiling: "+tMap.ceilingKey(3));//always search in right
		System.out.println("floor: "+tMap.floorKey(5));//always search in left
		System.out.println(tMap.ceilingEntry(3).getValue());
		
		int ar[] = new int[] {1,2,3,0,1,5,10,7};
		Arrays.sort(ar);
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(4);
		Collections.sort(list, Collections.reverseOrder());
		
	}

}
