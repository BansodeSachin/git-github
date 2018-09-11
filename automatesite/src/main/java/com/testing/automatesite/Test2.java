package com.testing.automatesite;

class Test4 {
	
	int i = 10;
	static int j = 20;
	
	
}


public class Test2 {
	
	public static void main(String[] args) {
		
		Test4 t1 = new Test4();
		Test4 t2 = new Test4();
		
		t1.i = t1.i +50;
		t1.j = t1.j +50;
		
		System.out.println(t1.i); //60
		System.out.println(t1.j);//70
		System.out.println(t2.i);//10
		System.out.println(t2.j);//70
		

	}

}
