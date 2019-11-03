package com.praga.logical.queue;

import java.lang.reflect.Array;
import java.util.logging.Logger;

public class LinearQueueArrayImpl<E> {
	{
		System.setProperty("java.util.logging.config.file", "logging.properties");
	}
	private final static Logger log = Logger.getLogger(LinearQueueArrayImpl.class.getName());
	private int enquePos;
	private int dequePos;
	private E[] queue;
	private int size;
	
	@SuppressWarnings("unchecked")
	public LinearQueueArrayImpl(Class<E> E, int size) {
		queue = (E[]) Array.newInstance(E, size);
		this.size = size;
		this.enquePos = this.dequePos = -1;
	}
	
	public void enqueue(E data) throws Exception {
		if(queue == null){
			throw new Exception("Queue is not created yet");
		}else if(isFull()){
			throw new Exception("Queue is Full");
		}else {
			queue[++enquePos] = data;
			log.info(data + " is added to the Queue");
		}
		
	}

	public E dequeue() throws Exception {
		E data = null;
		if(enquePos > dequePos) {
			data = queue[++dequePos];
			if(enquePos == dequePos) {
				enquePos = dequePos = -1;
			}
		}else {
			throw new Exception("Queue is empty");
		}
		
		return data;
	}
	
	public E peekInQueue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		return queue[dequePos+1];
	}

	public boolean isFull() {
		return enquePos == size-1;
	}
	
	public boolean isEmpty() {
		return enquePos == size;
	}
	
	public void deleteQueue() {
		queue = null;
		enquePos = dequePos = -1;
	}
}
