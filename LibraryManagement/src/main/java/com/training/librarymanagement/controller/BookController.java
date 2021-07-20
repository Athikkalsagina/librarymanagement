package com.training.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.librarymanagement.model.Book;
import com.training.librarymanagement.service.BookService;

@RestController
public class BookController {
@Autowired
private BookService bookService;

@GetMapping(value= "/all")
public List<Book> getAllItems(){
	return this.bookService.getAllBooks();
	}

@PostMapping("/add")
public String addBook(@RequestBody Book book) {
	return this.bookService.addNewBook(book);
	
}
@DeleteMapping(value="/delete/{id}")
public String deleteBook(@PathVariable String id) {
	return this.bookService.deleteBook(id); 
}

@PutMapping(value="/update/{id}")
public String updateBook (@PathVariable String id,@RequestBody Book book) {
	this.bookService.updateBook(id,book);
	return "updated data successfully";
}

@GetMapping(value="/all/{id}")
public Book getSingleBook( @PathVariable String id) {
	return this.bookService.getSingleBook(id);
}
}
