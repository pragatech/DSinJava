package com.praga.logical.stack.test;

import com.praga.logical.stack.StackUsingArray;

public class StackUsingArrayTest {
	public static void main(String[] args) throws Exception {
		StackUsingArray<Integer> s = new StackUsingArray(Integer.class, 5);
		
		System.out.println("Is stack empty?"+s.isEmpty());
		s.push(2);
		s.push(5);
		s.push(6);
		s.push(1);
		s.push(3);
		s.push(30);
		System.out.println("Is stack Full?"+s.isFull());
		s.pop();
		s.pop();
		s.pop();
		System.out.println("Is stack empty?"+s.isEmpty());
		s.pop();
		s.pop();
		s.pop();
		s.push(30);
		s.peek();
		s.pop();
		System.out.println("Is stack empty?"+s.isEmpty());
	}
}
