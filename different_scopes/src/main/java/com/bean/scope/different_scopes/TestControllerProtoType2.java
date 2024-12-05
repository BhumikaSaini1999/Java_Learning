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
//public class TestControllerProtoType2 {
//	
//	@Autowired
//	User user; //field injection
//	
//	public TestControllerProtoType2() {
//		System.out.println("TestControllerProtoType2 instance initialization");
//	}
//	
//	@PostConstruct
//	public void init() {
//		System.out.println("TestControllerProtoType2 object hashCode: "+this.hashCode()+
//				" User object hashCode: "+user.hashCode());
//	}
//	
//	@GetMapping(path="/fetchUser2")
//	public ResponseEntity<String> getUserDetails(){
//		System.out.println("fetchUser2 api invoked");
//		return ResponseEntity.status(HttpStatus.OK).body("");
//	}
//}
