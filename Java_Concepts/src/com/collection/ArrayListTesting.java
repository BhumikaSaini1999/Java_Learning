package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTesting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(10);
		list.add(61);		
		System.out.println(list);
		
		//update at particular index
		list.set(1, 100);
		
		//you can pass here any collection ex: set, anything that implements Collection interface
		List<Integer> list1 = new ArrayList<>(list);
		list1.add(9);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(7);
		list2.add(3);
		//addAll() method
		list2.addAll(list);
		list2.add(7);
		System.out.println(list2);
		
		//returns index of first occurrence of the element
		System.out.println(list2.indexOf(34));
		System.out.println(list2.lastIndexOf(7));
		
		//sublist() method
		//creates a list from start to endIndex-1
		List<Integer> list3 = list2.subList(1, 4);//follows shallow copy
		list3.set(1, 99); //if we change list3, then underlying list from which its created also changes
		System.out.println(list3);
		System.out.println(list2);
//		for(int x : list)
//			System.out.println(x);
		
		//list to array
		Integer arr[] = list.toArray(new Integer[0]);
		for(int x : arr)
			System.out.print(x+" ");
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(34);
		list4.add(10);
		list4.add(61);
		list4.add(90);
		list4.add(12);
		Object[] arr1 =  list4.toArray();
		for(Object x : arr1)
			System.out.println(x);
	}
}
