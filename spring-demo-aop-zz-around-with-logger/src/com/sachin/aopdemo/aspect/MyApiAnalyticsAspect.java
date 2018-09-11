package com.sachin.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalyticsAspect {

	@Before("com.sachin.aopdemo.aspect.DemoAopExpressions.forDAOPackageNoGetterSetter()")
	public void beforeAddAPIAnalytics() {
		System.out.println("\n ======>>> Performing API Analytics");
	}

}
