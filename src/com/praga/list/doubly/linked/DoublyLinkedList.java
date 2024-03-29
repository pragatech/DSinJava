package com.praga.list.doubly.linked;

import java.util.logging.Logger;

public class DoublyLinkedList<E> {
	{
		System.setProperty("java.util.logging.config.file", "logging.properties");
	}
	private static final Logger log= Logger.getLogger(DoublyLinkedList.class.getName());
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
	}
	
	public void insertAtFirst(E data) {
		if(!isEmpty()) {
			Node<E> node = createNode(data);
			node.next = head;
			head.prev = node;
			head = node;
		}else {
			createList(data);
		}
		log.info(data+" is inserted at First");
	}
	public void insertAt(E data, int pos) {
		if(isEmpty()) {
			createList(data);
		}else if(pos == 1){
			createList(data);
		}else {
			Node<E> node = createNode(data);
			Node<E> temp = head;
			int counter = 1;
			while (counter != pos-1 && temp.next != null) {
				temp = temp.next;
				counter++;
			}
			node.next = temp.next;
			temp.next = node;
			node.prev = temp;
			if(node.next != null) {
				node.next.prev = node;
			}else {
				tail= node;
			}
		}
		log.info(data+" is inserted at position "+pos);
	}
	public void insertAtLast(E data) {
		if(isEmpty()) {
			createList(data);
		}else {
			Node<E> node = createNode(data);
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		log.info(data+" is inserted at Last");
	}
	public void traverse() {
		if(isEmpty()) {
			log.info("List is empty");
			return;
		}
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.value +" -> ");
			temp = temp.next;
		}
	}
	public void reverseTraverse() {
		if(isEmpty()) {
			log.info("List is empty");
			return;
		}
		Node<E> temp = tail;
		while(temp != null) {
			System.out.print(temp.value +" -> ");
			temp = temp.prev;
		}
	}
	public void search(E data) {
		Node<E> temp = head;
		while(temp != null && temp.value != data) {
			temp = temp.next;
		}
		if(temp == null) {
			log.info("Given number "+data+" is not in the list");
		}else {
			log.info("Given number "+data+" is in the list");
		}
	}
	public void deleteAtFirst() {
		if(!isEmpty()) {
			Node<E> temp = head;
			head = temp.next;
			temp.next = null;
			head.prev = null;
			log.info(temp.value+" is deleted from start of the list");
		}
	}
	public void deleteAt(int pos) {
		if(!isEmpty() && pos == 1) {
			deleteAtFirst();
		}else if(!isEmpty()) {
			int counter = 1;
			Node<E> temp = head;
			while(counter != pos-1 && temp.next != null) {
				temp = temp.next;
				counter++;
			}
			if(temp == tail) {
				deleteAtLast();
			}else {
				Node<E> delNode = temp.next;
				temp.next = delNode.next;
				delNode.next.prev=temp;
				delNode.next=delNode.prev=null;
				log.info(delNode.value+" is deleleted from position "+pos);
			}
			
		}
	}
	public void deleteAtLast() {
		if(!isEmpty()) {
			Node<E> temp = tail;
			tail = temp.prev;
			tail.next=null;
			temp.prev=null;
		}
	}
	public void deleteEntireList() {
		Node<E> temp = head;
		while(temp != null) {
			temp = temp.next;
			head.next = null;
			head = temp;
		}
		tail=null;
	}
}
