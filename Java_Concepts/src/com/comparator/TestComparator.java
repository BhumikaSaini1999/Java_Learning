package com.comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

///////////////////////Comparator///////////////////////
//Purpose: Used to define multiple custom orderings for objects. (define custom sorting)
//Implementation: A separate class (or a lambda/anonymous class) implements the Comparator interface.
//Method: compare(T o1, T o2)
//Usage: Used when you want to sort objects in different ways without modifying their class.
//Modification: Does not require modifying the class whose instances need to be compared.

class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = Arrays.asList(new Employee(109, "Bhumika"), new Employee(102, "Kanika")
				, new Employee(105, "Rupali"), new Employee(104, "Raman"), new Employee(101, "Anamika"));
		
		//ist way
		//emp.sort((a,b)->{
//			if(a.id<b.id)
//				return -1;
//			else if(a.id>b.id)
//				return 1;
//			else
//				return 0;
			//return Integer.compare(a.id, b.id);
		//});
		
		//2nd way
		Collections.sort(emp, (a,b)->Integer.compare(a.id, b.id));
		System.out.println(emp);
		
		//3rd way
		Collections.sort(emp, new EmployeeNameComparator());
		System.out.println(emp);
		
	}

}
