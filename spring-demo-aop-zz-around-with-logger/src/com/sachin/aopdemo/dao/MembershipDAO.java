package com.sachin.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public String addSiliMember() {
		System.out.println(getClass() + " Doing My DB Work, adding an account from Membership DAO.");
		return null;
	}

}
