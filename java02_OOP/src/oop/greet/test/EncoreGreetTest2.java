package oop.greet.test;
/*
 * EncoreGreetTest에서는 필드에 값을 직접적으로 입력했다
 * 그런데 필드의 갯수가 늘어난다면?
 * 필드가 20개를 초과한다면?
 * 이럴 경우 일일이 필드에 값을 입력하는 방식은 너무 비효율적이다.
 * 
 * 해결책
 * : 모든 필드의 값을 한번에 받아서 할당해주는 기능을 가진 함수(Method)를 새롭게 정의하고
 * test2에서는 함수를 호출하는 방식을 이용하자.
 */

import oop.greet.EncoreGreet;

public class EncoreGreetTest2 {

	public static void main(String[] args) {//실행메소드
		EncoreGreet en = new EncoreGreet();
		
		en.setEncore("James", "Hello~~", 4, "Java"); // Method calling
		 // 해당 값들이 Greet.java의 필드에 초기화한다.
		// "." = @ = en 즉 EncoreGreet classd의~ 필드 혹은 메소드
		
		System.out.println(en.getEncore());// Method calling & 주입된 값이 리턴됨
		
		en.sayHello();
		
		
		
	}


}
