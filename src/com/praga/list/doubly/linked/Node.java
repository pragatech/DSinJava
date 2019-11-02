package com.praga.list.doubly.linked;

public class Node<E> {
	protected E value;
	protected Node<E> next=null;
	protected Node<E> prev=null;
	
	public Node(E value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	
	
}
