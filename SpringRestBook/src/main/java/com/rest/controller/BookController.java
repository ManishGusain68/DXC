package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Book;

import com.rest.service.BookService;

@RestController
@CrossOrigin
public class BookController {
	@Autowired
	public BookService bookservice;

	// @RequestMapping(value="/book/id",method=RequestMethod.GET)
	@GetMapping("/book/{id}")
	public Book getBooks(@PathVariable("id") int bookid) {
		
		
		System.out.println("get controller");
		Book b = bookservice.getBookById(bookid);
		System.out.println(b);
		return b;

	}

	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		Book b = this.bookservice.addBook(book);
		return b;
	}

	@DeleteMapping("/book/{id}")
	public void deleteBook(@PathVariable("id") int bookid) {
		bookservice.deleteBookById(bookid);

	}

	@PutMapping("book/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable("id") int bid) {
		Book b = bookservice.updateBook(book, bid);
		return b;

	}
}
