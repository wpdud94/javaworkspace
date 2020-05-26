package exam.test;
/*
 * Final 키워드
 * Static 키워드와 같이 쓰임
 * 내가 마지막이야~ 라는 뜻
 * 
 * final + 변수 : 내가 마지막 변수야
 * ⇒ 상수(더 이상 바꾸지마)
 * static final int COUNTER = 1;
 * 
 * final+클래스 : 내가 마지막 클래스
⇒ 상속 금지
 *
 * # final + 메소드 : 내가 마지막 메소드
	⇒ 오버라이딩 금지

 */

class A{
	public final static int BASE_SALARY = 300;
	public final String test() {
		return "Overriding 금지";
	}
}

final class B {//상속금지
	
}

/*class C extends B {//에러 뜸
	
}*/

class D extends A {
	/*public final String test() {//그냥 가져오면 고치겠다는 의미라서 overriding
		return "Overriding 금지";*/
	// 밑에서 쓸 수 있음
	}
	
}

public class StaticExamTest3 {
	static int i;
	
	public static void main(String[] args) {
		System.out.println("1. main method static block..."+i);
		

	}
}
