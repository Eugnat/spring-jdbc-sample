package com.zazdravnykh.jdbc.dao;

import java.util.List;

import com.zazdravnykh.jdbc.domain.Book;

public interface BookRepository {

	Book findOne(int id);

	List<Book> findAll();

	List<Book> findByName(String name);

	List<Book> findByAuthor(String author);

}
