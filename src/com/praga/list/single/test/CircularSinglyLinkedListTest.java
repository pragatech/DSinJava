package com.praga.list.single.test;

import com.praga.list.single.CircularSinglyLinkedList;

public class CircularSinglyLinkedListTest {
	public static void main(String[] args) {
		CircularSinglyLinkedList<Integer> list = new CircularSinglyLinkedList<>();

		System.out.println("is List Empty:" + list.isEmpty());
		System.out.println("Insert few numbers");
		list.insertAtFirst(5);
		list.insertAtFirst(3);
		list.insertAtFirst(2);
		list.insertAtFirst(1);
		list.insertAt(4, 4);
		list.insertAt(8, 9);
		list.insertAtLast(9);
		list.insertAt(6, 6);
		list.traverse();

		System.out.println("\n\nFind number 6");
		list.find(6);

		System.out.println("===Deletition of list===");
		list.deleteAtFirst();
		list.deleteAtFirst();
		list.deleteAtLast();
		list.deleteAt(2);
		list.deleteAt(3);
		list.deleteAt(3);
		list.deleteAtLast(); // added for testing
		list.insertAtLast(100);
		System.out.println("\nTraversing the list");
		list.traverse();
		list.deleteEntireList();
		System.out.println("\nEntire List is deleted");
		list.traverse();

	}
}
