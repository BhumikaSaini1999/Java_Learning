//package com.bean.scope.different_scopes;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import jakarta.annotation.PostConstruct;
//
//@RestController
//@RequestMapping(value="/api/")
//public class TestControllerSingleton1 {
//	
//	@Autowired
//	User user; //field injection
//	
//	public TestControllerSingleton1() {
//		System.out.println("TestControllerSingleton1 instance initialization");
//	}
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("TestController1 object hashCode: "+this.hashCode()+
//				" User object hashCode: "+user.hashCode());
//	}
//	
//	@GetMapping(path="/fetchUser")
//	public ResponseEntity<String> getUserDetails(){
//		System.out.println("fetchUser api invoked");
//		return ResponseEntity.status(HttpStatus.OK).body("");
//	}
//}
