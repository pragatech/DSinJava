package com.praga.logical.stack.test;

import com.praga.logical.stack.StackUsingList;

public class StackUsingListTest {

	public static void main(String[] args) {
		
		StackUsingList<Integer> s = new StackUsingList<Integer>();
		s.createStack();
		System.out.println("Is stack empty?"+s.isEmpty());
		s.push(2);
		s.push(5);
		s.push(6);
		s.push(1);
		s.push(3);
		s.push(30);
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
