package com.sachin.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.sachin.aopdemo.Account;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
	
	@After("execution(* com.sachin.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterThrowingFindAccountsAdvice(
			JoinPoint theJoinPoint) {
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @After (Finally) on method: " + method);
	}
	
	
	@AfterThrowing(
			pointcut="execution(* com.sachin.aopdemo.dao.AccountDAO.findAccounts(..))",
			throwing="theExc")
	public void afterThrowingFindAccountsAdvice(
			JoinPoint theJoinPoint, Throwable theExc) {
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterThrowing on method: " + method);
		
		System.out.println("\n=====>>> The exception is: " + theExc);
	}
	
	@AfterReturning(
			pointcut="execution(* com.sachin.aopdemo.dao.AccountDAO.findAccounts(..))",
			returning="result")
	public void afterReturningFindAccountsAdvice(
			JoinPoint theJoinPoint, List<Account> result) {
		
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
		
		System.out.println("\n=====>>> result is: " + result);
		
		convertAccountNamesToUpperCase(result);
		
		System.out.println("\n=====>>> result is: " + result);
		
	}
	
	
	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		for(Account tempAccount : result) {
			String theUpperName = tempAccount.getName().toUpperCase();
			
			tempAccount.setName(theUpperName);
		}
		
	}


	@Before("com.sachin.aopdemo.aspect.DemoAopExpressions.forDAOPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n ======>>> Executing @Before advice on addAccount()");
		
		MethodSignature methodSign = (MethodSignature) theJoinPoint.getSignature();
		
		System.out.println("Method Signature = " + methodSign);
		
		Object[] obj = theJoinPoint.getArgs();
		
		for(Object tempObj : obj) {
			System.out.println("Item = " + tempObj.toString());
		}
	}
}
