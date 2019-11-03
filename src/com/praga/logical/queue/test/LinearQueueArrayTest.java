package com.praga.logical.queue.test;

import com.praga.logical.queue.LinearQueueArrayImpl;

public class LinearQueueArrayTest {
	public static void main(String[] args) throws Exception {
		LinearQueueArrayImpl<Integer> q = new LinearQueueArrayImpl<>(Integer.class, 5);
		
		q.enqueue(5);
		q.enqueue(10);
		System.out.println("Dequed:"+q.dequeue());
		System.out.println("Next in queue:"+q.peekInQueue());
		System.out.println("Dequed:"+q.dequeue());
		q.enqueue(6);
		System.out.println("Dequed:"+q.dequeue());
		System.out.println("isEmpty:"+q.isEmpty());
		System.out.println("IsFull:"+q.isFull());
		q.enqueue(6);
		q.enqueue(16);
		q.enqueue(26);
		q.enqueue(36);
		q.enqueue(46);
		System.out.println("IsFull:"+q.isFull());
	}
}
