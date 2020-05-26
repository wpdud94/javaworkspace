package com.encore.Test;

import com.encore.vo.Book;
import com.encore.vo.Magazine;

import java.util.ArrayList;

import com.encore.service.BookManagerImpl;

public class BookManagerTest {

	public static void main(String[] args) {
		BookManagerImpl service = BookManagerImpl.getBookManager();
		
		System.out.println("==================== 책을 입력합니다.============================");
		service.insertBook(new Magazine("123", "잡지16", "작가1", "출판사1", 20500, "잡지1입니다.", 2019, 06));
		service.insertBook(new Magazine("456", "잡지26", "작가2", "출판사2", 25000, "잡지2입니다.", 2020, 03));
		service.insertBook(new Magazine("167", "잡지37", "작가3", "출판사1", 19000, "잡지3입니다.", 2019, 12));
		service.insertBook(new Book("678", "소설책48", "작가4", "출판사4", 18000, "잡지4입니다."));
		service.insertBook(new Book("457", "전공책58", "작가5", "출판사4", 25000, "잡지5입니다."));
	
		ArrayList<Book> temp = service.getAllBook();
		for(Book b : temp) System.out.println(b);
	
		ArrayList<Book> temp2 = service.searchBookbyIsbn("6");
		for(Book b : temp2) System.out.println(b);
		
		ArrayList<Book> temp3 = service.searchBookbyTitle("26");
		for(Book b :temp3) System.out.println(b);
		
		ArrayList<Book> temp4 = service.onlySearchBook("6");
		for(Book b :temp4) System.out.println(b);
		
		ArrayList<Book> temp5 = service.onlySearchMagazine("6");
		for(Book b :temp5) System.out.println(b);
		
		ArrayList<Book> temp6 = service.searchBookbyPublisher("출판사1");
		for(Book b :temp6) System.out.println(b);
		
		ArrayList<Book> temp7 = service.searchBookbyPrice(20000.0);
		for(Book b :temp7) System.out.println(b);
		
		System.out.println("모든 도서 가격의 합은 : "+service.getSumPriceOfBooks()+" 원");
		
		System.out.println(("도서 평균 가격은 : "+Math.round(service.getAveragePrice())+" 원"));
	}

}
