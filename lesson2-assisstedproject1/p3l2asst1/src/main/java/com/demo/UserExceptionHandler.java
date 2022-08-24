package com.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {

	
		@ExceptionHandler(value=UserNotFoundException.class)
		public ResponseEntity<Object> handleExceptionEntity (UserNotFoundException e){
			
			return new ResponseEntity<Object>("ERROR HANDLED  :"+e.getMessage(),HttpStatus.NOT_FOUND);
			
		}
}
