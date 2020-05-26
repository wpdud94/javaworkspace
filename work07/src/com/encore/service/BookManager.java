package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Book;

/*
 * BookManager 인터페이스는 다양한 Book 객체들을 핸들링하는 템플릿 기능을 가지고 있다.
 */
public interface BookManager {//템플릿!! Client와 사용자 사이의 규약
	void insertBook(Book b);
	public ArrayList<Book> getAllBook();
	public ArrayList<Book> searchBookbyIsbn(String isbn);
	public ArrayList<Book> searchBookbyTitle(String title);
	public ArrayList<Book> onlySearchBook(String isbn);
	public ArrayList<Book> onlySearchMagazine(String isbn);
	public ArrayList<Book> searchBookbyPublisher(String pub);
	public ArrayList<Book> searchBookbyPrice(double d);
	public double getSumPriceOfBooks();
	public double getAveragePrice();
}
