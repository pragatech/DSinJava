package com.praga.list.doubly.linked;

import java.util.logging.Logger;

public class CircularDoublyLinkedList<E> {
	{
		System.setProperty("java.util.logging.config.file", "logging.properties");
	}
	private static final Logger log = Logger.getLogger(CircularDoublyLinkedList.class.getName());
	private Node<E> head = null;
	private Node<E> tail = null;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public Node<E> getHead(){
		return head;
	}
	
	public Node<E> getTail(){
		return tail;
	}
	
	public Node<E> createNode(E data){
		return new Node<>(data);
	}
	
	public void createList(E data) {
		Node<E> node = createNode(data);
		head = node;
		tail = node;
		node.next = head;
		node.prev = tail;
	}
	
	public void insertAtFirst(E data) {
		if(isEmpty()) {
			createList(data);
		}else {
			Node<E> node = createNode(data);
			node.next = head;
			node.prev = head.prev;
			head.prev = node;
			tail.next = node;
			head = node;
		}
		log.info(data+" is insterted at first");
	}
	
	public void insertAt(E data, int pos) {
		if(isEmpty()) {
			createList(data);
		}else {
			Node<E> temp = head;
			int counter = 1;
			while(counter != pos-1) {
				counter++;
				temp=temp.next;
			}
			Node<E> node = createNode(data);
			node.prev = temp;
			node.next = temp.next;
			temp.next = node;
			node.next.prev = node;
			if(temp == tail) {
				tail = node;
			}
		}
	}
	
	public void insertAtLast(E data) {
		if(isEmpty()) {
			createList(data);
		}else {
			Node<E> node = createNode(data);
			node.prev = tail;
			node.next = tail.next;
			tail.next = node;
			head.prev = node;
			tail = node;
		}
		log.info(data+" is insterted at last");
	}
	
	public void traverse() {
		if(isEmpty()) {
			log.info("List is empty");
			return;
		}
		Node<E> temp = head;
		while(temp != tail) {
			System.out.print(temp.value+ " -> ");
			temp = temp.next;
		}
		System.out.print(tail.value+ " -> ");
		System.out.print(tail.next.value+ " -> ");
	}
	
	public void reverseTraverse() {
		if(isEmpty()) {
			log.info("List is empty");
			return;
		}
		Node<E> temp = tail;
		while(temp != head) {
			System.out.print(temp.value+ " -> ");
			temp =temp.prev;
		}
		System.out.print(head.value+" -> ");
		System.out.print(head.prev.value+ " -> ");
	}
	
	public void search(E data) {
		Node<E> temp = head;
		while(temp.next != head && temp.value != data) {
			temp = temp.next;
		}
		if(temp.value == data) {
			log.info("Given number "+data+" is in the list");
		}else {
			log.info("Given number "+data+" is not in the list");
		}
	}
	
	public void deleteAtFirst() {
		if(!isEmpty()) {
			Node<E> temp = head;
			if(temp.next == head) {
				temp = null;
				head=tail=null;
			}else {
				log.info(temp.value+" is deleted at First");
				temp = temp.next;
				head.next = head.prev = null;
				tail.next = temp;
				temp.prev = tail;
				head = temp;
			}
			
		}
	}
	
	public void deleteAt(int pos) {
		if(!isEmpty()) {
			Node<E> temp = head;
			int counter = 1;
			while(counter != pos-1) {
				counter++;
				temp = temp.next;
			}
			Node<E> delNode = temp.next;
			temp.next = delNode.next;
			delNode.next.prev = temp;
			if(delNode == tail) {
				tail = temp;
			}else if(delNode == head) {
				head = temp.next;
			}
			log.info(delNode.value+" is deleted at First");
		}
		
	}
	
	public void deleteAtLast() {
		if(!isEmpty()) {
			Node<E> temp = tail;
			if(temp.next == tail) {
				temp = null;
				head=tail=null;
			}else {
				log.info(tail.value+" is deleted at last");
				temp = temp.prev;
				temp.next = tail.next;
				tail.next = tail.prev = null;
				head.prev = temp;
				tail =temp;
			}
			
		}
	}
	
	public void deleteEntireList() {
		Node<E> temp = head;
		head.prev = null;
		tail.next = null;
		while(temp != null) {
			temp = temp.next;
			head.next = null;
			head.prev = null;
			head= temp;
		}
	}
}
