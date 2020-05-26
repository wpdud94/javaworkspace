package oop.constructor.test;

import oop.constructor.Shirt;
/*
 * ShirtTest
 * 에서는 서로 다른 셔츠 객체를 3개를 만들었다.
 * 그래서 서로 다른 주소값을 나타내지만...
 * 객체가 생성될 때 인자값을 넣어주지 않았기 때문에
 * 명시적인 값을 가지지 않는 디폴트 객체로 생성되었다.
 * ::
 * 생성자를 통해서 값을 입력 +
 * 객체가 생섬됨과 동시에 값을 가지도록 로직을 수정하자
 */

public class ShirtTest {

	public static void main(String[] args) {
		/*Shirt roundT = new Shirt(); // shirt class의 Shirt()을 calling한다
		Shirt jumpa = new Shirt();
		Shirt banpalT = new Shirt();*/ // 명시적인 값이 없는 생성자
		
		//메모리에 올라가서 우리가 사용할 수 있는 객체... Instance... 명시적값으로 할당
		Shirt roundT = new Shirt("유니클로",true,'B');
		Shirt jumpa = new Shirt("베네똥",true,'B');
		Shirt banpalT = new Shirt("aaa",false,'W');
		
		//서로 다른 셔츠객체가 만들어졌다면 Heap영역에 객체 3개가 load되어 있을 것이고
		// 각각의 위치는 서로 다르기 때문에 참조변수이 주소값들은 서로 다르게 나와야 한다.
		
		System.out.println(roundT);
		System.out.println(jumpa);
		System.out.println(banpalT);
		System.out.println("++++++++++++++++++++");
		System.out.println(roundT.getDetails());
		System.out.println(jumpa.getDetails());
		System.out.println(banpalT.getDetails());

	}

}
