package com.emids.BookComments.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.emids.BookComments.entity.BookComment;
@CrossOrigin
@Repository
public interface CommentRepository extends MongoRepository<BookComment,Integer> {

	//BookComment findByBookId(int bookId);

	BookComment findByBookTitle(String bookTitle);

	//boolean exists(String bookTitle);

	//void delete(String bookTitle);

}
