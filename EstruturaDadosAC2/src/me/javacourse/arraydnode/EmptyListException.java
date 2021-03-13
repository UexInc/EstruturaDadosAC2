package me.javacourse.arraydnode;

@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException {
	public EmptyListException(String err) {
		super(err);
	}
}