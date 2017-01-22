package com.zazdravnykh.jdbc.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zazdravnykh.jdbc.config.DBConfig;
import com.zazdravnykh.jdbc.dao.BookRepository;
import com.zazdravnykh.jdbc.domain.Book;

public class Main {

	public static void main(String... args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);

		BookRepository bookDAO = (BookRepository) context.getBean("bookService");

		Book book = bookDAO.findOne(1);

		List<Book> list = bookDAO.findByAuthor("author two");

		System.out.println(book);

		for (Book item : list) {
			System.out.println(item);
		}

		context.close();

	}

}
