package com.encore.vo;
/**
 * 
 * @author KJY
 * @since JDK 1.8.5
 * @version 1
 * vo SubClass
 */

import com.encore.vo.Book;

public class Magazine extends Book {
	private int year;
	private int month;
	
	public Magazine() {};
	public Magazine(String isbn, String title, String author, String publisher, double price, String desc,int year, int month) {
		super(isbn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+year+", "+month;
	}
	
	

}
