package com.encore.BookManager;

import com.encore.Book.Book;

/*
 * BookManager 인터페이스는 다양한 Book 객체들을 핸들링하는 템플릿 기능을 가지고 있다.
 */
public interface BookManager {//템플릿!! Client와 사용자 사이의 규약
	int getNumberOfBooks();
	void insertBook(Book b);
	public Book[] getAllBook();
	public Book searchBookbyIsbn(String isbn);
	public Book[] searchBookbyTitle(String title);
	public Book[] searchBookbyPublisher(String pub);
	public Book[] searchBookbyPrice(double d);
	public double getSumPriceOfBooks();
	public double getAveragePrice();
}
