package com.praga.list.single;

public class CircularSinglyLinkedList<E> {
	private Node<E> head = null;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	//Node creation helper method
	private Node<E> createNode(E value){
		return new Node<>(value); 
	}
	
	private void createList(E value) {
		Node<E> node = createNode(value);
		head = node;
		node.next = head;
	}
	
	public void traverse() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		System.out.print(head.getData() +" -> ");
		Node<E> temp = head.next;
		while(temp != head) {
			System.out.print(temp.getData()+" -> ");
			temp = temp.next;
		}
		if(temp == head) {
			System.out.print(head.getData() +" -> ");
		}
	}
	
	public void find(E val) {
		if(head != null && head.getData().equals(val)) {
			System.out.println("Numebr is found");
			return;
		}
		Node<E> temp = head.next;
		while (temp != head) {
			if(temp.getData().equals(val)) {
				System.out.println("Numebr is found");
				break;
			}
			temp = temp.next;
		}
		System.out.println("Numebr is not found");
	}
	
	//Insert at first
	public void insertAtFirst(E value) {
		if(isEmpty()) {
			createList(value);
		}else {
			Node<E> node = createNode(value);
			node.next = head;
			
			Node<E> temp = head;
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = node;
			head = node;
		}
		System.out.println(value +" is appended at first");
	}
	
	public void insertAtLast(E value) {
		if(isEmpty()) {
			createList(value);
		}else {
			Node<E> node = createNode(value);
			Node<E> temp = head;
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = node;
			node.next = head;
		}
		System.out.println(value +" is appended at last");
	}
	
	public void insertAtMiddle(E value, int pos) {
		if(isEmpty()) {
			createList(value);
		}else if(pos == 0) {
			insertAtFirst(value);
		}else {
			int counter = 0;
			Node<E> node = createNode(value);
			Node<E> temp = head;
			while(counter != pos-1 && temp.next != head) {
				temp = temp.next;
				counter++;
			}
			node.next = temp.next;
			temp.next = node;
		}
		System.out.println(value +" is appended at position "+pos);
	}

	public void deleteAtFirst() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node<E> temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		System.out.println("Deleting node "+head.getData());
		temp.next = head.next;
		head.next = null;
		head = temp.next;
		
	}

	public void deleteAtLast() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node<E> temp = head;
		while(temp.next != head && temp.next.next != head) {
			temp = temp.next;
		}
		Node<E> delNode = temp.next;
		temp.next = delNode.next;
		delNode.next = null;
		head = temp.next;
		System.out.println("Deleting node "+delNode.getData());
	}

	public void deleteAtMiddle(int pos) {
		if(isEmpty()) {
			System.out.println("List is empty");
		}else if(pos == 0) {
			deleteAtFirst();
		}else {
			int counter = 0;
			Node<E> temp = head;
			while (counter != pos-1 && temp.next != head && temp.next.next != head) {
				temp = temp.next;
				counter++;
			}
			Node<E> delNode = temp.next;
			temp.next = delNode.next;
			delNode.next = null;
			
			System.out.println("Deleting node "+delNode.getData());
		}
		
	}

	public void deleteEntireList() {
		if(isEmpty()) {
			System.out.println("List is already empty");
			return;
		}
		Node<E> temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = null;
		head = null;
	}
}
