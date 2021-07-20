package com.training.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.librarymanagement.model.Book;
import com.training.librarymanagement.repository.BookRepository;


@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	// fetch all books
	
	public List<Book> getAllBooks(){
		return this.bookRepository.findAll();
	}
//add new book
	public String addNewBook(Book book) {
		this.bookRepository.save(book);
		return "added book successfully";
		
	}
	//update book
	public void updateBook(String id,Book book) {
		if(this.bookRepository.findById(id).isPresent()){
			this.bookRepository.save(book);
		}
	}
	//delete book
	public String deleteBook(String bookid) {
	this.bookRepository.deleteById(bookid);
	return "deleted successfully";
	
	}
	
	//get single book
	public Book getSingleBook(String id) {
		if(this.bookRepository.findById(id).isPresent()){
			Book book1 = this.bookRepository.getById(id);
			return book1;
						
		} else {
			return null;
		}
	}
}
