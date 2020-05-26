package exception.runtime.test;

public class RuntimeExceptionTest3 {
	public static void main(String[] args) {
		System.out.println("==============NullPointerException==============");
		String str = new String("Encore");
		System.out.println(str);
		str = null;
		try {
		System.out.println("str의 데이터 값 ::  "+str);
		System.out.println("str 문자열 길이 :: "+str.length());
		}catch(NullPointerException e) {
				System.out.println("잡았다....NullPointerException");
		}catch(Exception e) {
			System.out.println("잡았다....Exception");
		}finally {
			System.out.println("Always Print");
		}
	}

}