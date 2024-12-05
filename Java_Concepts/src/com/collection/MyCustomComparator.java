package com.collection;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1; //descending
	}

}
