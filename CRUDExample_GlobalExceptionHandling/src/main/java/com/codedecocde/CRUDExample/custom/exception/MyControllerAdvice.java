package com.codedecocde.CRUDExample.custom.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//-------------------------------------------------------------------------------------------------
//Global Exception Handling:
//It can be used to handle exceptions thrown by controllers globally, rather than individually 
//in each controller.This is achieved by combining @ControllerAdvice with methods annotated with @ExceptionHandler, 
//where you can specify the exception types you want to handle.

//when writing any application you encounter exceptions and to handle them at each method level is 
//tedious and not optimal. So in order to overcome that, spring has introduced the concept of 
//@ControllerAdvice which will intercept all the controllers and look for the exceptions thrown. 
//This is at a global level means you only have one @ControllerAdvice for each application and 
//it will intercept the exceptions thrown by the controllers in that particular application context.
//---------------------------------------------------------------------------------------------------

//global exception handling class for multiple controllers
//@RestControllerAdvice//@ControllerAdvice+@ResponseBody
//The key difference lies in the response format. @RestControllerAdvice is geared towards returning JSON/XML, 
//which is typical for REST APIs, while @ControllerAdvice is more general-purpose and suited for applications 
//that might also return views.

//@ControllerAdvice
//By default, @ControllerAdvice methods return views (i.e., they are suitable for traditional MVC applications 
//where you return views like JSPs or Thymeleaf templates). If you want to return a JSON or XML response, 
//you would typically annotate your methods with @ResponseBody inside a @ControllerAdvice.

//@RestControllerAdvice
//Methods annotated with @RestControllerAdvice automatically return JSON or XML responses. 
//There's no need to explicitly add @ResponseBody to the methods since it's already implied.
//-----------------------------------------------------------------------------------------------------------------

//@ResponseStatus=>set the status code of an HTTP response.
//@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Some parameters are invalid")
//void onIllegalArgumentException(IllegalArgumentException exception) {}

@RestControllerAdvice
public class MyControllerAdvice extends ResponseEntityExceptionHandler{

	//please intercept any exception handling in any controller(if try catch not there in controller)
	//@ResponseStatus(code=HttpStatus.BAD_GATEWAY, reason="empty input")
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<EmptyInputException> handleEmptyInput(EmptyInputException emptyInputException){
		//return emptyInputException.getErrorMessage();
		return new ResponseEntity<EmptyInputException>(emptyInputException, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException elementException){
		return new ResponseEntity<String>("No value present in DB, please change your request", HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
			HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		return new ResponseEntity<Object>("Please change http Method type",HttpStatus.METHOD_NOT_ALLOWED);
	}
}
