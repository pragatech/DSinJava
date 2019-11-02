package com.praga.list.single;

import java.util.logging.Logger;

public class SinglyLinkedList<E> {	
	{
		System.out.println("Initializer is always first. Before constructor");
		System.setProperty("java.util.logging.config.file", "logging.properties");
	}
	private final Logger log = Logger.getLogger(SinglyLinkedList.class.getName());
	private Node<E> head = null;
	private Node<E> tail = null;

	public boolean isEmpty() {
		return head == null;
	}
	
	public Node<E> getHead() {
		return head;
	}
	//Node creation helper method
	private Node<E> createNode(E value){
		return new Node<>(value); 
	}
	
	public void createList(E value) {
		Node<E> node = createNode(value);
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
		log.info(value +" is appended at first");
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
		log.info(value +" is appended at last");
	}
	
	//Node insertion at middle
	public void insertAt(E value, int pos) {
		if(isEmpty()) {
			createList(value); 
		}else if(pos == 1){
			insertAtFirst(value);
		}else {
			Node<E> node = createNode(value);
			int counter = 1;
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
		log.info(value +" is appended at pos "+pos);
	}
	
	//traverse the list
	public void traverse() {
		if(isEmpty()) {
			log.info("List is empty");
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
			log.info("list is empty");
		}else {
			Node<E> temp = head;
			while(temp.next != null) {
				if(temp.getData().equals(value)) {
					log.info("Given value is in list");
					return;
				}
				temp = temp.next;
			}
		}
		log.info("value "+value+" is in list");
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
		log.info(temp.getData()+" from the list");
	}
	
	//delete list at first
	public void deleteAt(int pos) {
		if(!isEmpty()) {
			int counter = 1;
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
			log.info(delNode.getData()+" deleted from the list at position "+pos);
		}
	}
	
	//delete list at first
	public void deleteAtLast() {
		if(!isEmpty()) {
			Node<E> temp = head;
			while(temp.next != null && temp.next.next != null) {
				temp = temp.next;
			}
			Node<E> delNode = temp.next;
			temp.next = null;
			tail = temp;
			log.info(delNode.getData()+" deleted from end of the list");
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
