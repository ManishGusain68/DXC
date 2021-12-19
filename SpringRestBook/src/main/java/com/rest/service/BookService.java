package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.BookRepository;
import com.rest.entity.Book;

@Service
public class BookService {
	@Autowired
	public BookRepository bookrepo;

	public Book getBookById(int id) {
		Book b = bookrepo.findById(id).get();
		return b;
	}

	public Book addBook(Book book) {
		Book b = bookrepo.save(book);
		return b;
	}

	public void deleteBookById(int bookid) {
		bookrepo.deleteById(bookid);

	}

	public Book updateBook(Book book, int bid) {
		Book book1 = bookrepo.findById(bid).get();
		book1.setBookid(book.getBookid());
		book1.setAuthor(book.getAuthor());
		book1.setBookname(book.getBookname());
		Book updatedBook=bookrepo.save(book1);
		return updatedBook;
	}

}
