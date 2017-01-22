package com.zazdravnykh.jdbc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zazdravnykh.jdbc.dao.BookRepository;
import com.zazdravnykh.jdbc.domain.Book;

@Repository("bookService")
public class BookService implements BookRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Book findOne(int id) {

		Book book = jdbcTemplate.queryForObject("select * from book where id = ?", new Object[] { id }, new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet rs, int id) throws SQLException {

				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("title"));
				book.setAuthor(rs.getString("author"));

				return book;
			}

		});

		return book;

	}

	@Override
	public List<Book> findAll() {

		List<Book> list = jdbcTemplate.query("select * from book", new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet rs, int id) throws SQLException {

				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("title"));
				book.setAuthor(rs.getString("author"));

				return book;
			}

		});

		return list;
	}

	@Override
	public List<Book> findByName(String name) {
		List<Book> list = jdbcTemplate.query("select * from book where title = ?", new Object[] { name }, new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet rs, int id) throws SQLException {

				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("title"));
				book.setAuthor(rs.getString("author"));

				return book;
			}

		});

		return list;
	}

	@Override
	public List<Book> findByAuthor(String author) {

		List<Book> list = jdbcTemplate.query("select * from book where author = ?", new Object[] { author }, new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet rs, int id) throws SQLException {

				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("title"));
				book.setAuthor(rs.getString("author"));

				return book;
			}

		});

		return list;
	}

}
