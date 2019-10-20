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
		System.out.println("List position starts at Zero");
		list.insertAtMiddle(4, 3);
		list.insertAtMiddle(8, 9);
		list.insertAtLast(9);
		list.insertAtMiddle(6, 5);
		list.traverse();

		System.out.println("\n\nFind number 6");
		list.find(6);

		System.out.println("Deletition of list");
		list.deleteAtFirst();
		list.deleteAtFirst();
		list.deleteAtLast();
		list.deleteAtMiddle(2);
		list.deleteAtMiddle(3);
		list.deleteAtMiddle(3);
		list.deleteAtMiddle(3);
		list.deleteAtLast(); // added for testing
		list.insertAtLast(100);
		System.out.println();
		list.traverse();
		list.deleteEntireList();
		System.out.println("\nList is deleted");
		list.traverse();

	}
}
