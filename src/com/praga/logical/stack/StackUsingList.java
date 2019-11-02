package com.praga.logical.stack;

import java.util.logging.Logger;

import com.praga.list.single.SinglyLinkedList;

public class StackUsingList<E> {
	private static final Logger log = Logger.getLogger(StackUsingList.class.getName());
	private SinglyLinkedList<E> stack;
	public void createStack() {
		stack = new SinglyLinkedList<>();
	}
	public void push(E data) {
		stack.insertAtFirst(data);
	}
	public void pop() {
		stack.deleteAtFirst();
	}
	public void peek() {
		System.out.println("Top of the stack is "+stack.getHead().getData());
	}
	public boolean isEmpty() {
		return stack.getHead() == null;
	}
	public void deleteStack() {
		stack = null;
	}
			
}
