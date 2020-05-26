package exception.user.test;

import java.util.Scanner;

/*
 사용자정의 Exception
 ::
 User Exception
 ::
 1. 기존의 라이브러리 예외 클래스를 사용하지 않고 직접 예외 클래스를 정의해서 씀
 2. 프로그램 상에서 특정한 조건일 때 개발자가 고의적으로 예외를 발생시키는 경우
   ==> 강력한 제어문의 수단으로 사용
   일부러 에러를 만들어 아래 구문이 실행되지 않도록 하여 제어문의 역할을 함
 
 this 
 필드 앞에서 쓰일 때 로컬 변수와 필드를 구분.
 this()
 하나의 클래스에서 또 다른 생성자 호출....인자값 개수가 맞는 곳으로 돌림
 이 생성자는 해당 인자값을 가지는 생성자로 돌립니다.
 ==> 최종적으로 super로 돌린다.
 다만 ()안의 인자값을 그대로 호출한다.
 */

class ZeroBoom extends Exception{
	ZeroBoom(){
		this("This is ZeroBoomException....");
	}
	ZeroBoom(String message) {
		super(message);
	}
	
}

class User{
	public void go(int n) throws ZeroBoom {
		System.out.println("2. go()는 아랫부분에서 연산작용합니다... 분모가 0이 되면 안 됩니다.");
		int j = 111;
		if(n==0) {
			//내가 고의적으로 폭탄을 발생시켜서  연산 .... j/n 을 만나지 못 하도록 해야 함. ArithmeticException
			//이런 객체를 내가 만들 것 instead of JVM
		throw new ZeroBoom();
		//	throw new ZeroBoom("분모가 0이면 터집니다!!!");
		}
		
		
		
		
	}
}

public class UserExceptionTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요>>>>");
		int num = sc.nextInt();
		
		User user = new User();
		try {
			System.out.println("1. go calling....");
			user.go(num); // calling	
		}catch(ZeroBoom e) {
			//e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		
		System.out.println("3. 모든 기능을 수행하고 정상종료 합니다...");
	}

}
