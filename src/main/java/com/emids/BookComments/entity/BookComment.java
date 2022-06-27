package com.emids.BookComments.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="comments")
public class BookComment {
	@Id
	private int bookId;
	private int commentId;
	private String bookTitle;
	private String comment;
	private String bookAuthor;
	
	public BookComment(int bookId, int commentId, String bookTitle, String bookAuthor, String comment) {
		super();
		this.bookId = bookId;
		this.commentId = commentId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	    this.comment=comment;
	}
	public int getBookId() {
		return bookId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	
	}
	
	}

