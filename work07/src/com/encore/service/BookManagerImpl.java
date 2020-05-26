package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Book;
import com.encore.vo.Magazine;

/**
 * @author JeYoung Kang
 * @version 2 :: Singletion 적용
 * @version 3 :: BookManager 인터페이스 템플릿 제공
 * @version 4 :: Collection 중 ArrayList 활용
 */

public class BookManagerImpl implements BookManager{//인터페이스를 구현하는 클래스 이름 짓는 법 "~"+"Imple"
	//싱글톤으로 만들기	
	private ArrayList<Book> bs;
	
	//1. 싱글톤 step1
	private static BookManagerImpl Bookmgr = new BookManagerImpl();
	
	//2. 싱글톤 step2
	private BookManagerImpl() {
		bs = new ArrayList<>();
		
	}
	//3. 싱글톤 step3
	public static BookManagerImpl getBookManager() {
		return Bookmgr;
	};

	/**
	 * 데이터 입력 기능
	 * @param book
	 * Book 객체를 추가함.
	 */
	public void insertBook(Book book) {
		System.out.println(book.getTitle()+", "+book.getIsbn()+" 입력합니다.");
		boolean find = false;
		
		for(Book b : bs) {
			if(book.getIsbn().equals(b.getIsbn())) {
				find = true;
				System.out.println("같은 책이 목록에 있습니다.");
			}
		}
		if(find == false) bs.add(book);
	}
	/**
	 * 데이터 전체 검색 기능
	 * @return : 추가된 모든 Book 객체를 반환함
	 */
	
	public ArrayList<Book> getAllBook() {
		System.out.println("==================== 모든 등록된 책의 정보를 출력합니다.============================");
		return bs;
	}
	/**
	 * isbn으로 정보를 검색하는 기능
	 * @param isbn : 찾고자 하는 책의 isbn
	 * @return : 입력된 isbn을 포함하는 책을 반환.
	 */
	public ArrayList<Book> searchBookbyIsbn(String isbn) {
		System.out.println("==================== isbn : "+isbn+" (으)로 있는 책을 검색합니다============================");
		
		boolean find = false;
		ArrayList<Book> temp = new ArrayList<Book>();
		
		for(Book b : bs) {
			if(b==null) break;
			if(b.getIsbn().contains(isbn)) {
				find = true;
				temp.add(b);
			}
			
		}
		if(find == false) {
			System.out.println("==================== 해당 책이 없습니다. ============================");
			
		}
		return temp;
	}
	/** title로 정보를 검색하는 기능
	 * @param title : 찾고자 하는 책의 title
	 * @return : 입력된 title과 일치하는 책 배열을 반환.
	 */
	
	public ArrayList<Book> searchBookbyTitle(String title) {
		System.out.println("==================== 제목 : "+title+" (으)로 있는 책을 검색합니다============================");
		ArrayList<Book> temp = new ArrayList<Book>();
		for(Book b : bs) {
			if(b==null) continue;
			if(b.getTitle().contains(title)) temp.add(b);
		}
		return temp;
	}
	
	/**
	 * Book만 검색하는 기능
	 * @param num
	 * @return isbn에 일치하는 책 종류만 리턴
	 */
	public ArrayList<Book> onlySearchBook(String isbn) {
		System.out.println("====================Book 안에서만 isbn : "+isbn+" (으)로 검색합니다.====================");
		ArrayList<Book> temp = new ArrayList<Book>();
		ArrayList<Book> temp2 = new ArrayList<Book>();
		Book book = new Book();
		for(Book b : bs) {
			if(b.getClass() == book.getClass())temp.add(b);
		}
		for(Book b1: temp) {
			if(b1.getIsbn().contains(isbn)) temp2.add(b1);
		}
		return temp2;
	}
	/**
	 * Magazine만 검색하는 기능
	 * @param isbn 
	 * @return Magazine 안에서 param가 포함된 magazine ArrayList을 리턴
	 */
	public ArrayList<Book> onlySearchMagazine(String isbn) {
		System.out.println("====================Magazine 안에서만 isbn : "+isbn+" 으로 검색합니다.====================");
		ArrayList<Book> temp = new ArrayList<Book>();
		ArrayList<Book> temp2 = new ArrayList<Book>();
		Magazine magazine = new Magazine();
		for(Book b : bs) {
			if(b.getClass() == magazine.getClass()) temp.add(b);
		}
		for(Book b1: temp) {
			if(b1.getIsbn().contains(isbn)) temp2.add(b1);
		}
		return temp2;
	}
	/**
	 * 출판사로 검색하는 기능
	 * @param pub : 찾고자 하는 책의 출판사 이름
	 * @return : 입력된 출판사 이름과 일치하는 책 배열을 반환.
	 */
	
	public ArrayList<Book> searchBookbyPublisher(String pub) {
		System.out.println("==================== 출판사 : "+pub+" (으)로 검색합니다.====================");
		ArrayList<Book> temp = new ArrayList<Book>();
		for(Book b : bs) if(b.getPublisher().contains(pub)) temp.add(b);
		return temp;
	}
	
	/**
	 * 가격으로 검색(인자로 주어진 가격보다 낮은 가격의 도서 검색)
	 * @param price 도서 가격
	 * @return 인자로 주어진 가격보다 낮은 가격의 도서 ArrayList 반환
	 */
	public ArrayList<Book> searchBookbyPrice(double price) {
		System.out.println("==================== 가격 : "+price+" 보다 낮은 도서를 검색합니다.====================");
		ArrayList<Book> temp = new ArrayList<Book>();
		for(Book b : bs) {
			if(b.getPrice() <= price) temp.add(b) ;
		}
		return temp;
	}
	/**
	 * 저장된 모든 도서의 금액 합을 구하는 기능
	 * @return 모든 도서 가격 합
	 */
	public double getSumPriceOfBooks() {
		double sum = 0;
		for(Book b : bs) sum += b.getPrice();
		return sum;
	}
	/**
	 * 저장된 모든 도서의 금액 평균을 구하는 기능
	 * @return 평균 도서 가격
	 */
	public double getAveragePrice() {
		double avg = 0;
		avg = getSumPriceOfBooks() / bs.size();
		return avg;
	}

}
