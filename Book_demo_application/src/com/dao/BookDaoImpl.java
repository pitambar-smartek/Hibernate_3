package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.domain.Book;
import com.util.HibernateUtil;

public class BookDaoImpl implements BookDao{

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().openSession();

		//Transaction tx = session.beginTransaction();

		session.beginTransaction();
		
		try{
			
			session.save(book);
			session.getTransaction().commit();
			System.out.println("record saved");
			
		}catch (HibernateException e) {
			
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		
		System.out.println(session.isConnected());
			
		
	}



	@Override
	public void update(Book book) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		//Transaction tx = session.beginTransaction();

		session.beginTransaction();
		
		try{
			
			session.update(book);
			session.getTransaction().commit();
			System.out.println("record updated");
			
		}catch (HibernateException e) {
			
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}

	}

	@Override
	public void delete(Book book) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		//Transaction tx = session.beginTransaction();

		session.beginTransaction();
		
		try{
			
			session.delete(book);
			session.getTransaction().commit();
			System.out.println("record deleted");
			
		}catch (HibernateException e) {
			
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}

	}

	@Override
	public Book getBookByIsbn(String isbn) {
		
		Book book = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
			
            book = (Book) session.get(Book.class, isbn);
			System.out.println("record saved");
			System.out.println(session.isConnected());
			
			//session.getTransaction().commit();
			// session.getTransaction().rollback();
			 session.close();
		
		return book;
	
	}
}
