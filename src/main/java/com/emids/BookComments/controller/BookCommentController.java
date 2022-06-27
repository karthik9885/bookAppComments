package com.emids.BookComments.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emids.BookComments.entity.BookComment;
import com.emids.BookComments.exceptions.CommentNotFoundException;
import com.emids.BookComments.service.BookCommentService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@CrossOrigin(origins = "http://localhost:3000/Register?")
@RestController
//@EnableSwagger2
public class BookCommentController {
	
	@Autowired
	BookCommentService fc;
	
    @PostMapping("/bookApp")
	public BookComment  savecomment( @RequestBody BookComment c)
	{
		return fc.savecomment(c);
	}
   @GetMapping("/bookApp")
   public List<BookComment> getComments() 
   {
	  return fc.getcomment();
	  }
 
	@GetMapping("/bookApp/{bookId}")
	public BookComment getBooksById(@PathVariable int bookId) throws CommentNotFoundException
	{
		return fc.getBooksById(bookId);
	}
	
	@GetMapping("/bookApp/Title/{bookTitle}")
	public BookComment getAllCommentsBybookTitle (@PathVariable String bookTitle) throws CommentNotFoundException
	{
		return fc.getAllCommentsBybookTitle(bookTitle);
	}
	
	
	@DeleteMapping("/bookApp/{id}")
	public String deleteComment(@PathVariable Integer id)
	{
		return fc.deleteCommentById(id);
	}
     /*@DeleteMapping("/bookApp/{bookTitle}")
     public String deleteComment(@PathVariable BookComment bookTitle)
     {
    	 return fc.deleteComment(bookTitle);
     }*/
}
