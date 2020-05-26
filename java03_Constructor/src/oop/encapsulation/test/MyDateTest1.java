package oop.encapsulation.test;
/*
 * encapsulation 작성 패턴
 * 1. 필드 앞에는 무조건 Private
 * 2. setter() & getter() 앞에 public
 * 3. setter(){
 * 	첫 라인에서(필드 초기화하기 직전에) 값의 타당성을 검사하는 제어문을 통해서 valid value만 필드에 할당되도록 한다.
 */
import oop.encapsulation.MyDate;

public class MyDateTest1 {

	public static void main(String[] args) {
		MyDate md = new MyDate();
		//필드에 직접 값 할당
		/*md.month = 13;
		md.day = 33;*/
		
		//현실적은 invalid 값이 들어감
		//하드코딩하면 invalid문제 발생 => encapsulation 문제 발생
		System.out.println(md.setMonth(13));
		System.out.println(md.setday(33));
		

	}

}
