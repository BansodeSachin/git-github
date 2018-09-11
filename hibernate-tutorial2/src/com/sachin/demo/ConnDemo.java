package com.sachin.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnDemo {
	public static void main(String[] args) {
		try {
			Class.forName("");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false", "hbstudent", "hbstudent");
		} catch (Exception e) {
			System.out.println("Exception occurred during connection!");
		}
	}
}
