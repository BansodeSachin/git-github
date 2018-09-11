package com.sachin.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sachin.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public List<Account> findAccounts(boolean tripwire) {
		
		if(tripwire) {
			throw new RuntimeException("No Soup for  you.");	
		}
		
		List<Account> myAccounts = new ArrayList<>();
		
		Account temp1 = new Account("Sachin", "test1");
		Account temp2 = new Account("Test2", "test2");
		Account temp3 = new Account("Test3", "test3");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}
	
	public void addAccount(String s, boolean b) {
		System.out.println(getClass() + " Doing My DB Work, adding an account.");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return false;
	}

	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}

	
	
}
