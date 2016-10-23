package com.domain;

import java.util.Date;

public class Book {

	
	private String isbn;
	private String name;
	private String publisherCode;
	private Date publishDate;
	private int price;

	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publisherCode="
				+ publisherCode + ", publishDate=" + publishDate + ", price="
				+ price + "]";
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisherCode() {
		return publisherCode;
	}
	public void setPublisherCode(String publisherCode) {
		this.publisherCode = publisherCode;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
