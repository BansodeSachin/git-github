package com.testing.automatesite;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test5 {

	public static void main(String[] args) {
		
		int a[] = {30,10,20,40,50,30,10,40};
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i : a) {
			
			map.put(i, map.containsKey(i) ? 2 : 1);
		}
		
		System.out.println(map);
		Integer result=0;
		for(Integer i : a) {
			if(map.get(i) == 1) {
				result=i;
				break;
			}
		}
		System.out.println("result = " + result);
	}

}
