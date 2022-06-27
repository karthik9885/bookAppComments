package com.emids.BookComments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emids.BookComments.entity.BookComment;
import com.emids.BookComments.exceptions.CommentNotFoundException;
import com.emids.BookComments.repository.CommentRepository;
@Service
public class BookCommentService {
	@Autowired
    CommentRepository commentrepo;
	
	public BookComment  savecomment(BookComment c)
	{
		BookComment savedcomment=commentrepo.save(c);
		return savedcomment;
	}
	public List<BookComment> getcomment()
	{
		List<BookComment> allcomments=commentrepo.findAll();
		return allcomments;
	}
	
	public BookComment getBooksById(int bookId) throws CommentNotFoundException
	{
		BookComment comments=commentrepo.findById(bookId).get();
		return comments;
	}
	public BookComment  getAllCommentsBybookTitle(String bookTitle) throws CommentNotFoundException
	{
		BookComment commentlist=commentrepo.findByBookTitle(bookTitle);
	
		return commentlist;
	}

	
	public String deleteCommentById(int id)
	{
		if(commentrepo.existsById(id))
		{
			commentrepo.deleteById(id);;
		}
		return "deleted";
	}
  
	
}