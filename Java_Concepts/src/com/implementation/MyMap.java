package com.implementation;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {

	private List<MapNode<K, V>> bucket;
	private int capacity;//length of bucket
	private int size;//number of entries in map
	private final int INITIAL_CAPACITY=5;//initial length of bucket array
	
	public MyMap() {
		bucket = new ArrayList<>();
		capacity = INITIAL_CAPACITY;
		for(int i=0; i<capacity; i++) {//**imp step
			bucket.add(null);//if you do not add any element to array list , its capacity would be 0. so initialize with default null, for a valid index.
		}
	}
	
	public V get(K key) {
		int bucketIndex = hashFunction(key);
		MapNode<K,V> head = bucket.get(bucketIndex);
		while(head!=null) {
			//as every Generic Type is of type Object, where == it will just do refrence comparsion
			//if lets suppose key is of type Student which is custom class, we can't do == here and also equals() of Object class do refrence comparsion
			//so its important to override equals() for content comparison
//			if(head.key==key)
//				return head.value;
			if(head.key.equals(key))
				return head.value;
			head=head.next;
		}
		return null;
	}
	
	
	//generating a hashcode + doing compression
	private int hashFunction(K key) {
		int hashCode = Math.abs(key.hashCode());
		return hashCode%capacity;
	}

	public void put(K key, V value) {
		int bucketIndex = hashFunction(key);
		MapNode<K,V> head = bucket.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		
		MapNode<K,V> newEntry = new MapNode<K,V>(key,value);
		head = bucket.get(bucketIndex);
		newEntry.next = head;
		bucket.set(bucketIndex, newEntry);//new head 
		
		double loadFactor = 1.0*size/capacity; //(L.F.=number of map entries/total bucket size)
		if(loadFactor>0.75) {
			rehash();
		}
	}
	
	private void rehash() {
		// TODO Auto-generated method stub
		System.out.println("Rehashing buckets");
		
		List<MapNode<K,V>> temp = bucket;
		bucket = new ArrayList<>();
		capacity*=2;
		for(int i=0; i<capacity; i++) {//*imp
			bucket.add(null);
		}
		size=0;
		
		for(int i=0; i<temp.size(); i++) {
			MapNode<K,V> head = temp.get(i);
			while(head!=null) {
				put(head.key, head.value);
				head=head.next;
			}
		}
	}

	public void remove(K key) {
		int bucketIndex = hashFunction(key);
		MapNode<K,V> head = bucket.get(bucketIndex);
		MapNode<K,V> prev = null;
		
		while(head!=null) {
			
			//remove node from Linked List
			if(head.key.equals(key)) {
				if(prev==null) {
					bucket.set(bucketIndex, head.next);
				}else {
					prev.next=head.next;
				}
				head.next=null;
				size--;
				break;
			}
			prev=head;
			head=head.next;
		}
	}

	private class MapNode<K, V> {
		K key;
		V value;
		MapNode<K, V> next;

		public MapNode(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
}
