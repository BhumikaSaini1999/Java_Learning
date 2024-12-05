//package com.bean.scope.different_scopes;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import jakarta.annotation.PostConstruct;
//
//@RestController
//@RequestMapping(value="/api/")
//public class TestControllerProxyRequest {
//	
//	@Autowired
//	User user; //field injection
//	
//	@Autowired
//	Student2 student; //field injection
//	
//	public TestControllerProxyRequest() {
//		System.out.println("TestControllerProxyRequest instance initialization");
//	}
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("TestControllerProxyRequest object hashCode: "+this.hashCode()+
//				" User object hashCode: "+user.hashCode()+" Student object hashCode: "+student.hashCode());
//	}
//	
//	@GetMapping(path="/fetchUser")
//	public ResponseEntity<String> getUserDetails(){
//		System.out.println("fetchUser api invoked");
//		return ResponseEntity.status(HttpStatus.OK).body("");
//	}
//}
