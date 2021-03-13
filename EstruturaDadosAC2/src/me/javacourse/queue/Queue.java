package me.javacourse.queue;

public interface Queue<T> {

	public int size();

	public boolean isEmpty();

	public T front() throws EmptyQueueException;
	
	public void enqueue(T element) throws FullQueueException;

	public T dequeue() throws EmptyQueueException;
	
}
