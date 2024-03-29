package com.sachin.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyCloudLogAsyncAspect {

	@Before("com.sachin.aopdemo.aspect.DemoAopExpressions.forDAOPackageNoGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("\n ======>>> Logging to cloud in async manner.");
	}
}
