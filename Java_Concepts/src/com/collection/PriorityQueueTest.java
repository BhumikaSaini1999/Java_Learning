package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//Comparator overrides natural sorting order
public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->-a.compareTo(b));
		pq.offer(1);
		pq.offer(2);
		pq.offer(0);
		pq.offer(100);
		
		System.out.println(pq);
		
		List<Integer> top2 = new ArrayList<>();
		int index=0;
		while(!pq.isEmpty()) {
			if(index==2)
				break;
			
			top2.add(pq.poll());
			index++;
		}
		System.out.println(top2);
		System.out.println(pq);
		
		//PriorityQueue
		//get me top 3 students according to maths marks
		List<StudentMarks> sMarks = new ArrayList<>();
		sMarks.add(new StudentMarks(70,80));
		sMarks.add(new StudentMarks(100,35));
		sMarks.add(new StudentMarks(90,90));
		sMarks.add(new StudentMarks(99,45));
		sMarks.add(new StudentMarks(85,56));
		
		PriorityQueue<StudentMarks> spq = new PriorityQueue<>((a,b)->b.getPhysics()-a.getPhysics());
		for(StudentMarks marks : sMarks) {
			spq.add(marks);
		}
		System.out.println(spq);//not printing in the order 
		
		int index1=0;
		List<StudentMarks> top3 = new ArrayList<>();
		while(!spq.isEmpty()) {
			if(index1==3)
				break;
			
			top3.add(spq.poll());
			index1++;
		}
		System.out.println(top3);
		
		
	}

}
