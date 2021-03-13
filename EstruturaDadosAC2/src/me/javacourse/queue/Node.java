package me.javacourse.queue;

public class Node<T> {
	
	private T element;

	private Node<T> next;

	public Node() {
		this(null, null);
	}

	public Node(T e, Node<T> n) {
		element = e;
		next = n;
	}

	public T getElement() {
		return element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setElement(T newElem) {
		element = newElem;
	}

	public void setNext(Node<T> newNext) {
		next = newNext;
	}
	
}
