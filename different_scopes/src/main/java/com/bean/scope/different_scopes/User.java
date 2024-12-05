package com.bean.scope.different_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
//@Scope("singleton")//Singleton->as its singleton single instance get created and used for both TestControllerSingleton1 and  TestControllerSingleton2
//@Scope("prototype") //ProtoType->every time new object get created, not initialized at startup
//@Scope("request")//Request->for each Http request a new object is created
public class User {
	
	public User() {
		System.out.println("User constructor called");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("postconstruct on User called");
	}
}
