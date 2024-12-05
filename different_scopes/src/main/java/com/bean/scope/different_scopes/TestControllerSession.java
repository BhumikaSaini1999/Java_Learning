package com.bean.scope.different_scopes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@Scope(value="session")
@RequestMapping(value="/api/")
public class TestControllerSession {
	
	@Autowired
	User user; //field injection
	
	
	public TestControllerSession() {
		System.out.println("TestControllerSession instance initialization");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("TestControllerSession object hashCode: "+this.hashCode()+
				" User object hashCode: "+user.hashCode());
	}
	
	@GetMapping(path="/fetchUser")
	public ResponseEntity<String> getUserDetails(){
		System.out.println("fetchUser api invoked");
		return ResponseEntity.status(HttpStatus.OK).body("");
	}
	
	@GetMapping(path="/logout")
	public ResponseEntity<String> getUserDetails(HttpServletRequest request){
		System.out.println("end the session");
		HttpSession session = request.getSession();
		session.invalidate();
		return ResponseEntity.status(HttpStatus.OK).body("");
	}
}
