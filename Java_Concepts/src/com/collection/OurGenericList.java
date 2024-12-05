package com.collection;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T>{
	private T[] items;
	private int size;
	
	public OurGenericList() {
		size=0;
		items=(T[])new Object[100];
	}
	
	public void add(T item) {
		items[size++]=item;
	}
	
	public T getItemAtIndex(int index) {
		return items[index];
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new OurGenericListIterator(this);
	}
	
	//inner class
	private class OurGenericListIterator implements Iterator<T>{
		
		private OurGenericList<T> list;
		private int index=0;
		
		public OurGenericListIterator( OurGenericList<T> list) {
			this.list=list;
		}

		@Override
		public boolean hasNext() {//tells whether any element leftover in the list
			System.out.println("inside iterator at index "+index);
			return index<list.size;
		}

		@Override
		public T next() {//returns the next element in the list
			// TODO Auto-generated method stub
			return list.items[index++];
		}
		
	}
}
