package com.praga.list.single;

public class Node<E> {
	private E data;
	protected Node<E> next;
	
	Node(E data) {
		this.data = data;
		this.next = null;
	}
	
	public E getData() {
		return data;
	}
	
}
