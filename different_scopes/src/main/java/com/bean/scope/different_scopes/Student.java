//package com.bean.scope.different_scopes;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import jakarta.annotation.PostConstruct;
//
//@Component
//public class Student {
//	
//	@Autowired
//	User user;
//	
//	public Student() {
//		System.out.println("Student instance initialization");
//	}
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("Student object hashCode: "+this.hashCode()
//		+" User object hashCode: "+user.hashCode());
//	}
//}
