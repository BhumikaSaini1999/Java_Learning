package com.example.DemoHiber;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String lname;
	
//	@ManyToOne
//	private Student stud;
	
//	@ManyToMany
//	private List<Student> students = new ArrayList<>();
	
	@ManyToOne
	private Alien alien;
	
	public Laptop() {
		
	}
	
	public Laptop(int lid, String lname) {
		this.lid = lid;
		this.lname = lname;
	}

	public int getLid() {
		return lid;
	}


	public void setLid(int lid) {
		this.lid = lid;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}

	public Alien getAlien() {
		return alien;
	}

	public void setAlien(Alien alien) {
		this.alien = alien;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname +"]";
	}

//	public List<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
	
}
