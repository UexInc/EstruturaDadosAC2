package me.javacourse.stack;

public interface Stack<T> {

	public int size();

	public boolean isEmpty();

	public T top() throws EmptyStackException;

	public void push(T element) throws FullStackException;

	public T pop() throws EmptyStackException;

}