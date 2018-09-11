package com.testing.automatesite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface I1 {
	public void add(int a, int b);
}

public class Test3 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		
		List l2 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		
		List l3 = l.stream().filter(i -> i%2==0).map(i -> i*2).collect(Collectors.toList());
		
		System.out.println("l2 = " + l2);
		
		System.out.println("l3 = " + l3);
		
		I1 i = (c,d) -> System.out.println("hello = " + (c+d));
		
		System.out.println("Hello World");
		
		i.add(10,20);
		i.add(30,40);

	}
	
	public void m1() {
		System.out.println("Hello World");
	}
	
	

}
