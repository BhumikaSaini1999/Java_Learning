package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Set<Integer> set = new HashSet<>(list);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);
		set.remove(3);
		
		//set.clear();
		//System.out.println(set);
		
		Set<Integer> set1 = new HashSet<>(list);//1,2,3
		set1.add(9);
		Set<Integer> set2 = new HashSet<>();//1,7,5,2
		set2.add(1);
		set2.add(7);
		set2.add(5);
		set2.add(2);
		
		System.out.println(set1);
		System.out.println(set2);
		
		System.out.println("after retaining");
		set1.retainAll(set2); //gives intersection of two sets
		System.out.println(set1);
		System.out.println(set2);
		
		System.out.println("after union");
		set1.addAll(set2); //performs union on two sets
		System.out.println(set1);
		System.out.println(set2);
		
		System.out.println("after difference");
		set1.removeAll(set2); //performs difference on two sets
		System.out.println(set1);
		System.out.println(set2);
		
		//LinkedHashSet maintains insertion order
		Set<Integer> set3 = new LinkedHashSet<>();
		set3.add(2);
		set3.add(11);
		set3.add(78);
		set3.add(5);
		System.out.println(set3.contains(78));
		System.out.println(set3);
		
		
		List<StudentMarks> sMarks = new ArrayList<>();
		sMarks.add(new StudentMarks(70,80));
		sMarks.add(new StudentMarks(100,35));
		sMarks.add(new StudentMarks(90,90));
		sMarks.add(new StudentMarks(99,45));
		sMarks.add(new StudentMarks(85,56));
		
		Set<StudentMarks> set4 = new HashSet<>(sMarks);
		for(StudentMarks x : set4)
			System.out.println(x);
		
		//if we are using custom class in HashSet, always override hashCode() and equals() in the class
	    //because if we don't do it, it takes from Object class, Object class equals() does refrence comparison
		//and hashCode() generated for the memory address
		//returns false
		System.out.println(set4.contains(new StudentMarks(70,80)));
		
		Set<StudentMarks> treeSet = new TreeSet<>((a,b)->a.getPhysics()-b.getPhysics());
		treeSet.add(new StudentMarks(70,80));
		treeSet.add(new StudentMarks(100,35));
		treeSet.add(new StudentMarks(90,90));
		treeSet.add(new StudentMarks(99,45));
		treeSet.add(new StudentMarks(85,56));
		
		for(StudentMarks x : treeSet)//data is coming according to compareTo() of StudentMarks if comparator not passed
			System.out.println(x);
		
		
		//TreeSet uses Balanced Binary Tree so O(logn)
		NavigableSet<Integer> set5 = new TreeSet<>();
		set5.add(8);
		set5.add(3);
		set5.add(1);
		set5.add(0);
		
		for(int x : set5)
			System.out.print(x+", ");
		
		System.out.println("\n"+set5.floor(5));//maxium value <=5 in the set
		System.out.println(set5.ceiling(4));//minimum value >=4 in the set
		System.out.println(set5.higher(1));//returns minimum value from set strictly greater > 1
		System.out.println(set5.lower(1));//returns maximum value from set strictly lower < 1
	}

}
