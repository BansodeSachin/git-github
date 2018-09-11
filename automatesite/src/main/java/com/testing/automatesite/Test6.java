package com.testing.automatesite;

public class Test6 {
	
	public static void main(String[] args) {
	
		int a[] = {3,11,2,9,1,5};
		
		int result[] = insertionSort(a);
		
		for(int i : result) {
			System.out.println(i);
		}
			
		
	}
	
	public static int[] bubbleSort(int a[]) {
		for (int i = a.length-1 ; i >=0  ; i--) {
			
			for(int j=1 ; j <=i ; j++) {
				
				if(a[j-1] > a[j]) {
					a[j-1] = a[j-1] + a[j];
					a[j] = a[j-1] - a[j];
					a[j-1] = a[j-1] - a[j];
				}
				
			}
		}
		
		return a;
	}
	
	public static int[] selectionSort(int a[]) {
		
		for (int i=0 ; i<a.length-1 ; i++) {
			int min = i;
			for(int j=i+1 ; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			a[i] = a[i] + a[min];
			a[min] = a[i] - a[min];
			a[i] = a[i] - a[min];
		}
		
		return a;
	}
	
	public static int[] insertionSort(int a[]) {
		
		for(int i=1 ; i<a.length ; i++) {
			
			int index = a[i];
			int j = i;
			
			while(j > 0 && a[j-1] > index) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = index;
		}
		
		return a;
	}
}

