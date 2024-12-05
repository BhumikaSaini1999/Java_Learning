package com.collection;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSortingImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = new Employee[] { 
			      new Employee("John", 23, 5000), new Employee("Steve", 26, 6000), 
			      new Employee("Frank", 33, 7000), new Employee("Earl", 43, 10000), 
			      new Employee("Jessica", 23, 4000), new Employee("Pearl", 33, 6000)};
		
		System.out.println("Sorting in descending order of salary");
		System.out.println("--------------------------------------");
		Arrays.sort(employees, (a,b)->-Double.compare(a.getSalary(), b.getSalary()));
		for(Employee emp : employees)
			System.out.println(emp);
		
		System.out.println("Sorting in alphbetical order of name");
		System.out.println("--------------------------------------");
		Arrays.stream(employees).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(emp-> System.out.println(emp));
		
		//Java 8 comes with two new APIs useful for sorting – comparing() and thenComparing() in the Comparator interface.
		//These are quite handy for the chaining of multiple conditions of the Comparator.
		//Let’s consider a scenario where we may want to compare Employee by age and then by name
		Employee[] employees1 = new Employee[] { 
			      new Employee("John", 23, 5000), new Employee("Steve", 26, 6000), 
			      new Employee("Frank", 33, 7000), new Employee("Earl", 43, 10000), 
			      new Employee("Jessica", 23, 4000), new Employee("Pearl", 33, 6000)};
		System.out.println("compare Employees by age and then by name");
		System.out.println("--------------------------------------");
		//In this example, Employee::getAge is the sorting key for Comparator interface implementing a functional interface with compare function.
		Arrays.stream(employees1).sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName)).forEach(emp->System.out.println(emp));
		
		//sort Employees according to name if two Employees having same name then compare by age
		Employee[] employees2 = new Employee[] { 
			      new Employee("John", 23, 5000), new Employee("John", 26, 6000), 
			      new Employee("Frank", 33, 7000), new Employee("Earl", 43, 10000), 
			      new Employee("Jessica", 23, 4000), new Employee("Pearl", 33, 6000)};
		System.out.println("compare Employees by name and if employees having same name then by age");
		System.out.println("--------------------------------------");
		Arrays.stream(employees2).sorted((a,b)->{
			int nameComp = a.getName().compareTo(b.getName());
			int ageComp = Integer.compare(a.getAge(), b.getAge());
			return nameComp==0 ? ageComp : nameComp;
		}).forEach(emp->System.out.println(emp));
	}

}
