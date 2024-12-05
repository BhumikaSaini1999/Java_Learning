package com.example.DemoHiber;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private int marks;
	
	//@OneToOne //we need to define relationship
	//private Laptop laptop;
	
//	@OneToMany(mappedBy="stud")
//	private List<Laptop> laptops = new ArrayList<>();
	
	@ManyToMany(mappedBy="students")
	private List<Laptop> laptops = new ArrayList<>();
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}


	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
