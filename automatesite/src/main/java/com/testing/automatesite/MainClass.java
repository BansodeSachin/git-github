package com.testing.automatesite;

class Element {
	private int value;
	private Element nextElement;
	
	public Element(int value, Element nextElement) {
		super();
		this.value = value;
		this.nextElement = nextElement;
	}

	public Element() {
	
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Element getNextElement() {
		return nextElement;
	}

	public void setNextElement(Element nextElement) {
		this.nextElement = nextElement;
	}
	
}

class SinglyLinkedList {
	
}


public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Program started!");
	}
	
}





















