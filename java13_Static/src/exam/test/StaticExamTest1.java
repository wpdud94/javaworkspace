package exam.test;

/*
 * 1. static한 멤버는 객체 생성없이 사용할 수 있다 에 해당하는 코드
 */

class Member{
	static String name = "길똥이";
	static int age = 22; //static V, calss V , 전역변수
	int count = 1; // 필드, 멤버 변수
	
	public static void getMember() {
		System.out.println("우/유/빛/깔 " + name);
		System.out.println("count : "+count);
	}
	
	//non static
	public void getMember2() {
		System.out.println("우/유/빛/깔 " + name);
	}
}

public class StaticExamTest1 {

	public static void main(String[] args) {
		/*Member m = new Member();
		m.getMember();*/ // new를 통해 객체생성했으므로 멤버 클래스를 활용할 수 있게 됨.
		
		Member.getMember(); // 미리 메모리에 올려놨기에 어느 클래스인지만 알려주면 사용 가능
		
		//static은 static끼리 통한다. Main 안에서 static끼리
		//Member.getMember2(); // static이 아니므로 객체 생성을 해야 한다.
	}

}
