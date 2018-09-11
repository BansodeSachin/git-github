package com.testing.automatesite;

import java.util.ArrayList;
import java.util.ListIterator;

class Test {
	public static void main(String args[]){
		String name = "Citius techti";
		
		char a[] = name.toCharArray();
		ArrayList al = new ArrayList();
		
		
		for(char ch:a) {
			//System.out.println("Char = " + ch);
			if(al.contains(ch)) {
				int count = 0;
				ListIterator itr = al.listIterator();
				while(itr.hasNext()) {
					if(itr.next().equals(ch)) {
						count++;
					}
				}
				System.out.println("Character " + ch + " occures " + count + " times");
				
			}
			al.add(ch);
		}
		
	}
}







