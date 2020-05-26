package oop.greet;
// EncoreGreet 
/* 
 * EncoreGreet��
 * Encore �������� �������鿡�� ���ϴ� �λ縻�� �����ϰ� �ִ� Ŭ����
 */
public class EncoreGreet {
	//Variable : Field
	public String name; //Initialization
	public String message;
	// 필드 추가...
	public int classRoom;
	public String subject;
/*위는 필드 아래는 메소드 */
	//Method / void는 자신이 일을 시작하고 마무리 함. field에 값을 집어넣기.
	public void sayHello() {
		System.out.println(name+", "+message);
	}
	//메소드 추가 / return은 일의 중간 계산을 처리하고 이를 반환함
	public String getEncore( ) {
		return name+"\t"+message+"\t"+classRoom+"\t"+subject;
	}
	//함수추가. 여러 개의 값을 한 번에 필드에 주입하는 기능을 구현
	// 이를 메소드 정의 = 두 개로 나뉜. 1. 메소드 선언부(중괄호 전) + 2. 메소드 구현부(중괄호 안)
	//getEncore는 값을 가져옴. return type은 string. 인자는 필드 개수만큼 있어야 함.
	//다만 putEncore는 값을 필드에 주입함. 반드시 인자값이 있어야 함.
	// 필드에 값을 집어넣을 때는 주로 set&void, 필드의 값을 받아올 때는 주로 get&String
	public void setEncore(String n, String m, int c, String s) {
		name=n; // field 초기화(새로운 값으로 할당하는 것)
		message  =m;
		classRoom  =c;
		subject  =s;
	}
}
