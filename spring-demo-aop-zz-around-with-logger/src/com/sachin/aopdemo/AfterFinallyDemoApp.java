package com.sachin.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sachin.aopdemo.dao.AccountDAO;
import com.sachin.aopdemo.dao.MembershipDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> theAccounts = null;
		
		try {
			boolean tripwire = true;
			theAccounts = theAccountDAO.findAccounts(tripwire);
		} catch(Exception e) {
			System.out.println("\n\n Main Program... Caught Exception... " + e);
		}
		
		
		System.out.println("\n\nMain Program: AfterThrowingDemoApp");
		System.out.println("----");
		
		System.out.println(theAccounts);
		
		System.out.println("\n");
		
		context.close();
	}

}
