package me.javacourse.queue;

import me.javacourse.stack.Node;

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
		if(isEmpty())
			throw new EmptyQueueException("Queue is empty.");
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

	public String toString() {
		String s;
		Node<T> p = head;
		s = "[";
		while (p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		if (s.length() > 1)
			s = s.substring(0, s.length() - 2);
		return s + "]";
	}

}
