package com.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//asList()
		int arr[] = {3,2,7,8,1,5};
		List<int[]> list = Arrays.asList(arr);
		
		List<Integer> list1=Arrays.asList(1,5,6,8,9);
		for(int x : list1)
			System.out.print(x+" ");
		
		//sort()
		Arrays.sort(arr);
		
		//binarySearch() //1,2,3,5,7,8
		System.out.println("\n"+ Arrays.binarySearch(arr,5));
		System.out.println(Arrays.binarySearch(arr, 0, 3, 1));
		
		//fill()
		Arrays.fill(arr, 1);
		for(int x : arr)
			System.out.print(x+" \n");
		
		//stream()
		Arrays.stream(arr).forEach(x->System.out.print(x+" \n"));
		
		//toString()
		System.out.println(Arrays.toString(arr)+"Bhumika");
		
		//deepEquals(Object[] a1, Object[] a2)
		//Two array references are considered deeply equal if both are null, or if they refer to arrays that contain the 
		//same number of elements and all corresponding pairs of elements in the two arrays are deeply equal.
		Integer arr1[] = {3,6,1,2,8};
		Integer arr2[] = {3,6,1,2,8};
		System.out.println(Arrays.equals(arr1, arr2));
		
		//copyOf(originalArray, newLength)
		Integer[] arr3=Arrays.copyOf(arr1, 10);
		Arrays.stream(arr3).forEach(x->System.out.print(x+" "));
		
		//copyOfRange(originalArray, fromIndex, endIndex)
		Integer[] arr4=Arrays.copyOfRange(arr2, 1, 3);//copy from fromIndex to endIndex-1
		System.out.println();
		Arrays.stream(arr4).forEach(x->System.out.print(x+" "));
	}

}
