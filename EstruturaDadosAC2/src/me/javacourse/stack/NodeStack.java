package me.javacourse.stack;

public class NodeStack<T> implements Stack<T> {
	
	protected Node<T> top;

	protected int size;

	public NodeStack() {
		top = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		return false;
	}

	public void push(T elem) {
		Node<T> v = new Node<T>(elem, top);
		top = v;
		size++;
	}

	public T top() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException("Stack is empty.");
		return top.getElement();
	}

	public T pop() throws EmptyStackException {
		Node<T> aux = top;
		if (isEmpty())
			throw new EmptyStackException("Stack is empty.");
		T temp = top.getElement();
		top = top.getNext();
		aux.setNext(null);
		size--;
		return temp;
	}
	
	public String toString() {
		String s;
		Node<T> p = top;
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