package com.praga.list.single;

public class SinglyLinkedList<E> {
	private Node<E> head = null;
	private Node<E> tail = null;

	public boolean isEmpty() {
		return head == null;
	}
	
	//Node creation helper method
	private Node<E> createNode(E value){
		return new Node<>(value); 
	}
	
	public void createList(E value) {
		Node<E> node = createNode(value);
		node.next = head;
		head = node;
		tail = node;  
	}
	
	//Node insertion at first
	public void insertAtFirst(E value) {	
		if(isEmpty()) {
			createList(value);
		}else {
			Node<E> node = createNode(value);
			node.next = head;
			head = node;
		}
	}
	
	//Node insertion at last
	public void insertAtLast(E value) {
		if(tail == null) {
			createList(value);
		}else {
			Node<E> node = createNode(value);
			tail.next = node;
			tail = node;
		}			
	}
	
	//Node insertion at middle
	public void insertAtMiddle(E value, int pos) {
		if(isEmpty()) {
			createList(value); 
		}else if(pos == 0){
			insertAtFirst(value);
		}else {
			Node<E> node = createNode(value);
			int counter = 0;
			Node<E> temp = head;
			while(counter != pos-1 && temp.next != null) {
				temp = temp.next;
				counter++;
			}
			node.next = temp.next;
			temp.next = node;
			if(counter != pos-1) {
				tail = node;
			}
		}
	}
	
	//traverse the list
	public void traverse() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.getData() +" -> ");
			temp = temp.next;
		}
	}
	
	//serach the list
	public void search(E value) {
		if(isEmpty()) {
			System.out.println("list is empty");
		}else {
			Node<E> temp = head;
			while(temp.next != null) {
				if(temp.getData().equals(value)) {
					System.out.println("Given value is in list");
					break;
				}
				temp = temp.next;
			}
		}
	}
	
	//delete entire list
	public void deleteEntireList() {
		head=tail=null;
	}
	
	//delete list at first
	public void deleteAtFirst() {
		Node<E> temp = head;
		head = head.next;
		temp.next = null;
	}
	
	//delete list at first
	public void deleteAtMiddle(int pos) {
		if(!isEmpty()) {
			int counter = 0;
			Node<E> temp = head;
			while(counter != pos-1 && temp.next != null && temp.next.next != null) {
				temp = temp.next;
				counter++;
			}
			Node<E> delNode = temp.next;
			if(delNode != null) {
				temp.next = delNode.next;
				delNode.next=null;
			}
			if(delNode == tail) {
				tail = temp;
			}
		}
	}
	
	//delete list at first
	public void deleteAtLast() {
		if(!isEmpty()) {
			Node<E> temp = head;
			while(temp.next != null && temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		}
	}
	
	public int getLength() {
		int counter = 0;
		Node<E> temp = head;
		while(temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}
}
