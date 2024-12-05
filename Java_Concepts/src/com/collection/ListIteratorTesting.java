package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lk = new LinkedList<>();
		
		lk.add(1);
		lk.add(2);
		lk.add(3);
		
		ListIterator<Integer> listIterator = lk.listIterator();
		System.out.println(listIterator.next());//returns the element then moves to next index
		System.out.println(listIterator.next());
		System.out.println(listIterator.previous());//first move to previous index then return the element
	}

}
