package com.praga.list.doubly.linked.test;

import com.praga.list.doubly.linked.DoublyLinkedList;

public class DoublyLinkedListTest {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		System.out.println("====Doubly-Linked List====");
		list.traverse();
		
		System.out.println("====Insertion Doubly-Linked List====");
		list.insertAtFirst(5);
		list.insertAtFirst(3);
		list.insertAtFirst(2);
		list.insertAtFirst(1);
		list.insertAt(4, 4);
		list.insertAt(8,9);
		list.insertAtLast(9);
		list.insertAt(6, 6);
		list.traverse();
		System.out.println("\n====Doubly-Linked List - reverse Order====");
		list.reverseTraverse();
		
		System.out.println("\n\nFind number 6");
		list.search(6);
		
		System.out.println("Deletition of list");
		list.deleteAtFirst();
		list.deleteAtFirst();
		list.deleteAtLast();
		list.deleteAt(2);
		list.deleteAt(100);
		list.deleteAtLast();
		//added for testing
		list.insertAtLast(100);
		System.out.println();
		System.out.println("\nTraversing the list");
		list.traverse();
		System.out.println("\nReverse-Traversing the list");
		list.reverseTraverse();
		System.out.println("\nDeleting Entire List");
		list.deleteEntireList();
		System.out.println("\nTraversing the list");
		list.traverse();
	}
}
