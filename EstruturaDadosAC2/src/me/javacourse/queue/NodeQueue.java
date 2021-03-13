package me.javacourse.queue;

public class NodeQueue<T> implements Queue<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public NodeQueue() {
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public T front() throws EmptyQueueException {
		return head.getElement();
	}

	public void enqueue(T elem) {
		Node<T> node = new Node<T>();
		node.setElement(elem);
		node.setNext(null);
		if (size == 0)
			head = node;
		else
			tail.setNext(node);
		tail = node;
		size++;
	}

	public T dequeue() throws EmptyQueueException {
		if (size == 0)
			throw new EmptyQueueException("Queue is empty.");
		T tmp = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return tmp;
	}

}
