package exception.runtime.test;
/*
 * NullPointerException :
 * 객체 생성하지 않고(null) 객체의 매법에 접근하려고(pointer) 할 때 발생하는 예외
 * null을 만나는 line 찾기.
 * 객체 생성하는 line이 어디인지 찾으면 됨.
 * 
 * catch는 여러 번 할 수 있다.
 * 단, 그 중에서 단 한 번만 수행된다.
 * 
 * fianally
 * ::
 * 예외와 상관없이 무조건 수행되어져야 하는 코드가 있다며
 * 이 안에다가 넣어야 한다.
 */
public class RuntimeExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("==============NullPointerException==============");
		String str = new String("Encore");
		//String str = "Encore"; 이 방법도 있음 다만 메모리가 다름. Literal Pool. as local 변수
		System.out.println(str);//주소값이 나와야 하지만 String Class에서 toString이 오버리이딩 되어 있음. 
		
		str = null; //
		try {
		System.out.println("str의 데이터 값 ::  "+str);
		System.out.println("str 문자열 길이 :: "+str.length());//오버라이딩으로 null.length가 되어 NPE 발생
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잡았다....1");
		}catch(NullPointerException e) {
				System.out.println("잡았다....2");
		}catch(Exception e) {
			System.out.println("잡았다....3");
		}finally {
			System.out.println("Always Print");
		}
	}

}
/*
경우의 수
1. 예외 발생 가능성 코드 작성 + 예외 발생 안 함
	try & finally 수행
2. 예외 발생 가능성 코드 작성 + 예외 발생 함 + 예외 잘 잡음
	catch & finally
3. 예외 발생 가능성 코드 작성 + 예외 발생 함 + 예외 못 잡음
	finally
	
finally에 주로 넣는 코드
--> 자원을 반납하는 코드 ... close()
--> 무슨 난리가 났든지 코드로 자원을 열었으면 닫아주기

finally가 동작하는 않는 경우
1) finally 직전에 컴퓨터 꺼짐
2) finally 안에서 또 다른 예외가 발생할 때
--> 또 예외처리 :: finally를 try ~ catch로 감싸주기
*/