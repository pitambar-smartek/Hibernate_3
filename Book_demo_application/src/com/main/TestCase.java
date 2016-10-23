package com.main;

import java.util.Date;

import com.dao.BookDao;
import com.dao.BookDaoImpl;
import com.domain.Book;

public class TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setIsbn("1234");
		book.setName("hibernate");
		book.setPrice(500);
		book.setPublishDate(new Date(10, 10, 1988));
		book.setPublisherCode("P101");
		
       BookDao bookDao = new BookDaoImpl();
       bookDao.save(book);
       
       System.out.println(bookDao.getBookByIsbn("1234"));
       
       book.setPrice(600);
       bookDao.update(book);
       
       System.out.println(bookDao.getBookByIsbn("1234"));
       bookDao.delete(book);
	}

}
