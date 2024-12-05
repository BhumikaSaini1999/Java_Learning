package com.arraylist;

public class DynamicArray {
	
	private int arr[];
	private int capacity;
	private int size;
	
	DynamicArray(){
		arr = new int[10];
		size = 0; //size defines the current number of elements present inside array
		capacity = 10; //capacity defines total capacity of array
	}
	
	void add(int element) {
		//we have to double the capacity
		if(size==capacity) {
			int newArr[] = new int[2*capacity];
			//copy the elements from old array
			for(int i=0; i<arr.length; i++) {
				newArr[i] = arr[i];
			}
			
			//Now we have to start using the new array for storing the elements
			this.arr = newArr;
			this.capacity*=2;
		}
		//[0,size-1]
		this.arr[size++]=element;
	}
	
	void remove_back() {
		if(size>0) {
			this.arr[size-1]=0;
			size--;
		}
	}
	
	void set(int index, int element) {
		if(index>=0 && index<=size - 1) {
			this.arr[index]=element;
		}
	}
	
	int get(int id) {
		if(id>=0 && id<size) {
			return this.arr[id];
		}
		return -1;
	}
	
	int size() {
		return this.size;
	}
	
	int capacity() {
		return this.capacity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray arr = new DynamicArray();
		for(int i=0; i<50; i++) {
			arr.add(3*i);
			System.out.println("Array size: "+arr.size+" Array Capacity: "+arr.capacity);
		}
	}

}
