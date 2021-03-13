package me.javacourse.queue;

public class ArrayQueue<T> implements Queue<T> {

	private int front, rear, capacity;
	private T[] queue;
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int cap) {
		front = rear = 0;
		capacity = cap;
		queue = (T[]) new Object[capacity];
	}
	
	public int size() {	
		return (capacity - front + rear) % capacity;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public T front() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException("Queue is empty");
		return queue[front];
	}

	public void enqueue(T element) throws FullQueueException {
		if(size() == capacity - 1)
			throw new FullQueueException("Queue is full");
		queue[rear] = element;
		rear = (rear + 1) % capacity;
	}

	public T dequeue() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException("Queue is empty");
		T temp = queue[front];
		queue[front] = null;
		front = (front + 1) % capacity;
		return temp;
	}
	
	public String toString() {
		String s;
		s = "[";
		if (size() > 0) s += queue[0];
		if (size() > 1) {
			for (int i = 1; i <= size() - 1; i++) {
				s += ", " + queue[i];
			}
		}
		return s + "]";
	}

}
