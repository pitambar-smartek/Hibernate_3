package com.dao;

import com.domain.Book;

public interface BookDao {
	
	void save(Book book);
	void update(Book book);
	void delete(Book book);
	Book getBookByIsbn(String isbn);

}
