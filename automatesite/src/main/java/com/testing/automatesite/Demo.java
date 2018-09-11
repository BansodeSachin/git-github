package com.testing.automatesite;

import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.TreeSet;

public class Demo extends Thread {
		
		int a = 10;
		
		public static void main(String[] args) {
			TreeSet<Employee> t = new TreeSet<Employee>();
			t.add(new Employee(5,"ram",30000));
			Employee e1=new Employee(2,"shyam", 40000);
			t.add(e1);
			t.add(new Employee(1,"sita",60000));
			System.out.println(t);
			System.out.println(new Demo().a);
		}
		
	
}



