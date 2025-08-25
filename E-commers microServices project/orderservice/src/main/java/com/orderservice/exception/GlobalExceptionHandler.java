package com.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(itemNotFoundException.class)
    public ResponseEntity<ErrorrMessage> handleUserNotFoundException(itemNotFoundException ex){
    	   ErrorrMessage msg=new ErrorrMessage(ex.getMessage(),"userNotFoundException");
		   return new ResponseEntity<>(msg,HttpStatus.NOT_FOUND);
    };
}
