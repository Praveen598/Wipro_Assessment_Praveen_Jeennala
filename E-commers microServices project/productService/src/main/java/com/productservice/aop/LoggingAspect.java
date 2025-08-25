package com.productservice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect // we are to spring this extra logic iam writing
@Component // a spring take care of this class (object creation)
@Slf4j
public class LoggingAspect {

	@Before("execution(* com.productservice.controller.getAllCartItems(..))")
	public void logbefore(JoinPoint joinpoint) {
		log.warn("loging something before addNewPROPDUCT Endpoint");
		
	}

}
