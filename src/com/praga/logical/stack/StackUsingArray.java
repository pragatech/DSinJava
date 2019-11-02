package com.praga.logical.stack;

import java.lang.reflect.Array;
import java.util.logging.Logger;

public class StackUsingArray<E> {
	private final static Logger log = Logger.getLogger(StackUsingArray.class.getName());
	private E[] stack;
	private int top;
	private int size;
	
	public StackUsingArray(Class E, int size){
		this.size = size;
		stack = (E[]) Array.newInstance(E, size);
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == size -1;
	}
	
	public void push(E data){
		if(top == size-1) {
			log.info("Stack is full");
			return;
		}
		stack[++top] = data;
		log.info(data +" is pushed");
	}
	
	public E pop(){
		if(top == -1) {
			log.info("Stack is empty");
			return null;
		}
		E data = stack[top];
		top--;
		log.info(data +" is poped");
		return data;
	}
	
	public E peek() {
		if(top == -1) {
			log.info("Stack is empty");
			return null;
		}
		E data = stack[top];
		log.info(data +" is in top of stack");
		return data;		
	}
}
