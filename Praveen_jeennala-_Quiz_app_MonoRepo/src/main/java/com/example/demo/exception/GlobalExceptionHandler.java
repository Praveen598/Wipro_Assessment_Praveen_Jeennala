package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(questionNotfound.class)
	public ResponseEntity<errorMessage> handleQuestionNotFound(questionNotfound ex){
		errorMessage msg=new errorMessage(ex.getMessage(),"questionNotFound");
		return new ResponseEntity<>(msg,HttpStatus.NOT_FOUND);
		
	}

}
