package com.encore.Test;

import com.encore.Book.Book;
import com.encore.BookManager.BookManagerImpl;
import com.encore.Magezine.Magazine;

public class BookManagerTest {

	public static void main(String[] args) {
		BookManagerImpl service = BookManagerImpl.getBookManager();
		
		System.out.println("==================== 책을 입력합니다.============================");
		service.insertBook(new Magazine("123", "잡지16", "작가1", "출판사1", 20000, "잡지1입니다.", 2019, 06));
		service.insertBook(new Magazine("456", "잡지26", "작가2", "출판사2", 25000, "잡지2입니다.", 2020, 03));
		service.insertBook(new Magazine("789", "잡지37", "작가3", "출판사1", 19000, "잡지3입니다.", 2019, 12));
		/*service.insertBook(new Magazine("JKL", "잡지48", "작가4", "출판사4", 18000, "잡지4입니다.", 2019, 11));
		service.insertBook(new Magazine("MNO", "잡지58", "작가5", "출판사4", 25000, "잡지5입니다.", 2019, 07));*/
		
		System.out.println("==================== BookManager에 등록된 책 수량 입니다.============================");
		System.out.println(service.getNumberOfBooks());
		
		System.out.println("==================== 모든 등록된 책의 정보를 출력합니다.============================");
		Book[] bs = service.getAllBook();
		for(Book b : bs) System.out.println(b);
		
		System.out.println("==================== isbn이 123인 책을 검색합니다============================");
		System.out.println(service.searchBookbyIsbn("123"));
		System.out.println("==================== isbn 중 5를 포함한 책을 검색합니다============================");
		System.out.println(service.searchBookbyIsbn('5'));
		
		System.out.println("==================== 제목이 잡지37인 책을 검색합니다============================");
		Book[] temp = service.searchBookbyTitle("잡지37");
		for(Book b :temp) System.out.println(b);
		Book[] temp05 = service.searchBookbyTitle("잡지");
		for(Book b :temp05) System.out.println(b);
		System.out.println("==================== 제목 중 6이 포함된 책을 검색합니다============================");
		Book[] temp1 = service.searchBookbyTitle('6');
		for(Book b :temp1) System.out.println(b);
		
		System.out.println("==================== 출판사1인 책을 검색합니다============================");
		Book[] temp2 = service.searchBookbyPublisher("출판사1");
		for(Book b :temp2) System.out.println(b);
		System.out.println("==================== 출판사 이름 중 2가 포함된 책을 검색합니다============================");
		Book[] temp3 = service.searchBookbyPublisher('2');
		for(Book b :temp3) System.out.println(b);
		
		System.out.println("==================== 가격이 19000인 책을 검색합니다============================");
		Book[] temp4 = service.searchBookbyPrice(19000);
		for(Book b :temp4) System.out.println(b);
		System.out.println("==================== 가격 중 5가 포함된 책을 검색합니다============================");
		Book[] temp5 = service.searchBookbyPrice('5');
		for(Book b :temp5) System.out.println(b);
		
		System.out.println("==================== 모든 책 가격의 총합을 출력합니다.============================");
		System.out.println(service.getSumPriceOfBooks()+" 원");
		
		System.out.println("==================== 평균 각격을 출력합니다.============================");
		System.out.println(Math.round(service.getAveragePrice())+" 원");
	}

}
