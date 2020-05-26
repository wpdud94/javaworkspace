package com.encore.BookManager;

import com.encore.Book.Book;
import com.encore.Magezine.Magazine;

/*
 * @author JeYoung Kang
 * @version 2 :: Singletion 적용
 * @version 3 :: BookManager 인터페이스 템플릿 제공
 */

public class BookManagerImpl implements BookManager {//인터페이스를 구현하는 클래스 이름 짓는 법 "~"+"Imple"
	//싱글톤으로 만들기	
	private int numberOfBooks;
	Book[] bsi;
	Book[] bs;
	
	//1. 싱글톤 step1
	private static BookManagerImpl Bookmgr = new BookManagerImpl();
	
	//2. 싱글톤 step2
	private BookManagerImpl() {
		bsi = new Magazine[100];
		
	}
	//3. 싱글톤 step3
	public static BookManagerImpl getBookManager() {
		return Bookmgr;
	};
	
	
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	/*
	 * @param b
	 * Book 객체를 추가함.
	 */
	public void insertBook(Book b) {
		bsi[numberOfBooks++] = b;
		bs =new Magazine[numberOfBooks];
		System.arraycopy(bsi, 0, bs, 0, bs.length);
	}
	/*
	 * @return : 추가된 모든 Book 객체를 반환함
	 */
	
	public Book[] getAllBook() {
		return bs;
	}
	/*
	 * @param isbn : 찾고자 하는 책의 isbn
	 * @return : 입력된 isbn과 일치하는 책을 반환.
	 */
	public Book searchBookbyIsbn(String isbn) {
		Book temp = null;
		for(Book b : bs) {
			if(b==null) break;
			if(b.getIsbn().equals(isbn)) temp = b;
			
		}
		return temp;
	}
	/*
	 * @param a : 찾고자 하는 책의 isbn 중 문자
	 * @return : 입력된 character를 포함한 isbn을 가진책을 반환.
	 */
	public Book searchBookbyIsbn(char a) {
		Book temp = null;
		for(Book b : bs) {
			if(b==null) continue;
			char[] chararr = b.getIsbn().toCharArray();
			for(char c : chararr)
			if(c==a) temp = b;
			
		}
		return temp;
	}
	/*
	 * @param title : 찾고자 하는 책의 title
	 * @return : 입력된 title과 일치하는 책 배열을 반환.
	 */
	
	public Book[] searchBookbyTitle(String title) {
		int idx = 0;
		Book[] temp = new Book[bs.length];
		for(Book b : bs) {
			if(b==null) continue;
			if(b.getTitle().equals(title)) temp[idx++] = b;
		}
		Book[] temp2 =new Magazine[idx];
		System.arraycopy(temp, 0, temp2, 0, temp2.length);
		return temp2;
	}
	
	/*
	 * @param ch : 찾고자 하는 책의 title 중 문자 
	 * @return : 입력된 문자를 포함한 title을 가진 책을 반환.
	 */
	
	public Book[] searchBookbyTitle(char ch) {
		int idx = 0;
		Book[] temp = new Book[bs.length];
		for(Book b : bs) {
			if(b==null) continue;
			char[] chararr = b.getTitle().toCharArray();
			for(char c : chararr) if(c==ch) temp[idx++] = b;
		}
		Book[] temp2 =new Magazine[idx];
		System.arraycopy(temp, 0, temp2, 0, temp2.length);
		return temp2;
	}
	/*
	 * @param pub : 찾고자 하는 책의 출판사 이름
	 * @return : 입력된 출판사 이름과 일치하는 책 배열을 반환.
	 */
	
	public Book[] searchBookbyPublisher(String pub) {
		int idx = 0;
		Book[] temp = new Book[bs.length];
		for(Book b : bs) {
			if(b==null) continue;
			if(b.getPublisher().equals(pub)) temp[idx++] = b;
		}
		Book[] temp2 =new Magazine[idx];
		System.arraycopy(temp, 0, temp2, 0, temp2.length);
		return temp2;
	}
	/*
	 * @param a : 찾고자 하는 책의 출판사 이름 중 문자 
	 * @return : 입력된 문자를 포함한 출판사 이름을 가진 책을 반환.
	 */
	public Book[] searchBookbyPublisher(char a) {
		int idx = 0;
		Book[] temp = new Book[bs.length];
		for(Book b : bs) {
			if(b==null) continue;
			char[] chararr = b.getPublisher().toCharArray();
			for(char c : chararr) if(c==a) temp[idx++] = b;
		}
		Book[] temp2 =new Magazine[idx];
		System.arraycopy(temp, 0, temp2, 0, temp2.length);
		return temp2;
	}
	
	public Book[] searchBookbyPrice(double d) {
		int idx = 0;
		Book[] temp = new Book[bs.length];
		for(Book b : bs) {
			if(b==null) continue;
			if(b.getPrice() == d) temp[idx++] = b;
		}
		Book[] temp2 =new Magazine[idx];
		System.arraycopy(temp, 0, temp2, 0, temp2.length);
		return temp2;
	}
	
	public double getSumPriceOfBooks() {
		double sum = 0;
		for(Book b : bs) sum += b.getPrice();
		return sum;
	}
	
	public double getAveragePrice() {
		double avg = 0;
		avg = getSumPriceOfBooks() / bs.length;
		return avg;
	}

}
