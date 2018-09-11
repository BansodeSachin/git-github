package com.testing.automatesite;

import java.io.IOException;

public class Test7 {

	public static void main(String[] args) throws ArithmeticException, IOException{
		
		String temp[] = new String[5];
		
		String s1 = "Test2";
		String s2 = "Test";
		
		String s3 = s1 + s2;
		
		System.out.println(s3);
		
		Test7.divide(4,0);

	}
	
	public static void divide(int a, int b) {
		try {
		int c = a / b;
		} catch (Exception e) {
		System.out.print("Exception ");
		} finally {
		System.out.println("Finally");
		}
		}

}
