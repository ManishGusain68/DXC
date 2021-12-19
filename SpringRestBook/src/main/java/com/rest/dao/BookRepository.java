package com.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
