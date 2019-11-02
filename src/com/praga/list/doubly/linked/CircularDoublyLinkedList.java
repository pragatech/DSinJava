package com.praga.list.doubly.linked;

public class CircularDoublyLinkedList<E> {
	{
		System.setProperty("java.util.logging.config.file", "logging.properties");
	}
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
		
	}
	
	public void insertAt(E data, int pos) {
		
	}
	
	public void insertAtLast(E data) {
		
	}
	
	public void traverse() {
		
	}
	
	public void reverseTraverse() {
		
	}
	
	public void search(E data) {
		
	}
	
	public void deleteAtFirst() {
		
	}
	
	public void deleteAt(int pos) {
		
	}
	
	public void deleteAtLast() {
		
	}
	
	public void deleteEntireList() {
		
	}
}
