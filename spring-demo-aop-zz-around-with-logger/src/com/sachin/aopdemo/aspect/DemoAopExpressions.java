package com.sachin.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DemoAopExpressions {

	@Pointcut("execution(* com.sachin.aopdemo.dao.*.*(..))")
	public void forDAOPackage() {
	}
	
	@Pointcut("execution(* com.sachin.aopdemo.dao.*.get*(..))")
	public void getter() {
	}
	
	@Pointcut("execution(* com.sachin.aopdemo.dao.*.set*(..))")
	public void setter() {
	}
	
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	public void forDAOPackageNoGetterSetter() {
	}

}
