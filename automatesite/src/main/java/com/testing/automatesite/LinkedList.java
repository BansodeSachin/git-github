package com.testing.automatesite;

public class LinkedList {
	
	Node head;
	
	public void insert(int data) {
		
		Node n = new Node();
		
		n.setData(data);
		n.setNext(null);
		
		if(head==null) {
			head = n;
		} else {
			Node node = head;
			while(node.getNext()!=null) {
				node = node.getNext();
			}
			node.setNext(n);
		}
		
	}
	
	public void show() {
		Node n = head;
		while(n.getNext()!=null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
		System.out.println(n.getData());
	}
	
	public void insertAtStart(int data) {
		
	}
	
	public void insertAt(int index, int data) {
		
	}
	
	public void deleteAt(int index) {
		
	}

}
