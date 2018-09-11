package com.sachin.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sachin.aopdemo.dao.AccountDAO;
import com.sachin.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		theAccountDAO.addAccount("Sachin", true);
		
		theAccountDAO.doWork();
		
		theAccountDAO.setName("foobar");
		
		theAccountDAO.setServiceCode("Silver");
		
		String name = theAccountDAO.getName();
		
		String code = theAccountDAO.getServiceCode();
		
		
		
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		theMembershipDAO.addSiliMember();
		
		context.close();
	}

}
