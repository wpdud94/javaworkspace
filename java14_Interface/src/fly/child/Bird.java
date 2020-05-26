package fly.child;

import fly.Flyer;

/*
 * Flyer(인터페이스)를 상속받은 자식 클래스...
 * 인터페이스를 부모로 둔 자식(Bird) 반드시 부모가 가진 모든 추상메소드를 다 구현해야한다.
 */
public abstract class Bird implements Flyer {// extend 대신 implements

	@Override
	public void fly() {
		System.out.println("새가 난다");
		
	}

	@Override
	public void land() {
		System.out.println("새가 착륙한다");
		
	}

	@Override
	public void take_off() {
		System.out.println("새가 이륙한다");
		
	}
	//추가 함수
	public String layEggs() {
		String temp = "알을 낳는다.";
		
		return temp;
	}
	
	
}
