//package com.bean.scope.different_scopes;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import jakarta.annotation.PostConstruct;
//
//@Component
//@Scope("prototype")
//public class Student2 {
//	
//	@Autowired
//	User user;
//	
//	public Student2() {
//		System.out.println("Student2 instance initialization");
//	}
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("Student2 object hashCode: "+this.hashCode()
//		+" User object hashCode: "+user.hashCode());
//	}
//}
