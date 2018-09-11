package com.sachin.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	Logger log = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.sachin.springdemo.controller.*.*(..))")
	public void forControllerPackage() {
		
	}
	
	@Pointcut("execution(* com.sachin.springdemo.service.*.*(..))")
	public void forServicePackage() {
		
	}
	
	@Pointcut("execution(* com.sachin.springdemo.dao.*.*(..))")
	public void forDaoPackage() {
		
	}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	public void forAppFlow() {
		
	}
	
	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint) {
		
		String methodName = joinPoint.getSignature().toShortString();
		
		log.info(">>>> method Name = " + methodName);
		
		Object[] tempArgs = joinPoint.getArgs();
		
		for(Object obj : tempArgs) {
			log.info(">>>> arg = " + obj);
		}
	}
	
	@AfterReturning(pointcut = "forAppFlow()", returning="theResult")
	public void before(JoinPoint joinPoint, Object theResult) {

		String methodName = joinPoint.getSignature().toShortString();
		
		log.info(">>>> method Name Returning from = " + methodName);
		
		log.info(">>>> result = " + theResult);
	}

}
