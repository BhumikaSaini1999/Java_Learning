package com.design.pattern.Strategy.Pattern;


class SortingContext{
	private SortingStrategy strategy;
	
	SortingContext(SortingStrategy strategy){
		this.strategy = strategy;
	}
	
	void sort(int[] arr) {
		strategy.sort(arr);
	}
}

interface SortingStrategy{
	void sort(int[] arr);
}

class BubbleSortStrategy implements  SortingStrategy{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Bubble sort called");
	}
	
}

class MergeSortStrategy implements  SortingStrategy{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Merge sort called");
	}
	
}

class QuickSortStrategy implements  SortingStrategy{

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Quick sort called");
	}
	
}


public class MainSorting {
	
	public static void main(String[] args) {
		int arr[] = {5,8,2,3,4};
		
		SortingContext sortContext = new SortingContext(new BubbleSortStrategy());
		sortContext.sort(arr);
		
		SortingContext sortContext1 = new SortingContext(new QuickSortStrategy());
		sortContext1.sort(arr);

	}
}
