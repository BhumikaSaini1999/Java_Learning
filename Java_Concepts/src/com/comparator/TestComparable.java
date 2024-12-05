package com.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

///////////////////////Comparable///////////////////
//Purpose: Used to define the natural ordering of objects of a class.(default natural sorting order)
//Implementation: The class itself implements the Comparable interface.
//Method: compareTo(T o)
//Usage: Used when a class has a natural default ordering that makes sense across many contexts.
//Modification: Requires modifying the class whose instances need to be compared.

public class TestComparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = Arrays.asList(new Student(109, "Bhumika"), new Student(102, "Kanika")
				, new Student(105, "Rupali"), new Student(104, "Raman"), new Student(101, "Anamika"));
		
		Collections.sort(students); //default natural sorting order using Comparable
		students.forEach(System.out :: println);
	}

}
