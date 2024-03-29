package com.praga.list.single.test;

import com.praga.list.single.SinglyLinkedList;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		
		System.out.println("is List Empty:"+list.isEmpty());
		System.out.println("Insert few numbers");
		list.insertAtFirst(5);
		list.insertAtFirst(3);
		list.insertAtFirst(2);
		list.insertAtFirst(1);
		list.insertAt(4, 4);
		list.insertAt(8,9);
		list.insertAtLast(9);
		list.insertAt(6, 6);
		list.traverse();
		
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
		System.out.println("\n Deleting Entire List");
		list.deleteEntireList();
		System.out.println("\nTraversing the list");
		list.traverse();
		
	}

}
