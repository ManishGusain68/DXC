package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BookData")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	private String bookname;
	private String author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookid, String bookname, String author) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + "]";
	}

}
