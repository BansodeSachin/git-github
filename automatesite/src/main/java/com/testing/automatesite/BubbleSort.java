package com.testing.automatesite;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {30,50,10,80,70,40,20};
		
		System.out.println("Before = " + Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				if(a[i] > a[j]) {
					
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
					
				}
			}
			
			
		}
		
		
		System.out.println("After = " + Arrays.toString(a));

	}

}
