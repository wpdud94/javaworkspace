package oop.greet.test;


import java.util.Scanner;
import oop.greet.EncoreGreet;


public class EncoreGreetTest {

	public static void main(String[] args) {
		EncoreGreet eg = new EncoreGreet(); //변수 선언과 동시에 할당 => eg변수 형태는 class이고 해당 객체 할당
		
		/* 1. 묵시적 초기선
		 * - 클래스 내 필드의 기본값은 null
		 * 2. 주소값 할당 in Heap memory
		 * 3. stack 영역에 eg변수에 주소값 할당
		 * eg는 필드가 아니고 Local Variable(왜냐하면 main 안에서 정의됨). 
		 * 이 변수도 stack 메모리에 올라감.
		 * Local Variable은 필드가 아니기에 기본값이 없음.
		 * 값이 배정되어야 주소값이 가질텐데, 언제 배정될까?
		 * ==> Heap의 값을 Local Variable로 매칭할 대
		 * 4. 참조가 일어남
		 * ex) eg.~
		 */
		// 실행 시에 키보드로 입력받은 값을 처리하도록 -> Scanner
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요>>>>");
		String scName=sc.nextLine();
		eg.name=scName;
		// scName에 값이 할당이 안 됐는데 eg즉 Encore()의 name이라는 것을 할당한다.
		
		System.out.println("메세지를 입력하세요>>>>");
		String scMsg=sc.nextLine();
		eg.message=scMsg;
		eg.sayHello();

	}

}
