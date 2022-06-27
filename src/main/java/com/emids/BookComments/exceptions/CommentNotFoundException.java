package com.emids.BookComments.exceptions;

public class CommentNotFoundException extends Exception{

	private String message;

	public CommentNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "BookNotFoundException [message=" + message + "]";
	}

}
