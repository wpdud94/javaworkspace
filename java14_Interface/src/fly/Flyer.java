package fly;
//완벽한 추상화 ... 구현된 것이 하나도 없기 때문
// 인터페이스 구성요소 :: 추상메소드 + 상수
public interface Flyer {
	//날으는 것과 관련된 기능의 Template을 선언...
	public static final int SIZE = 100;
	
	void fly(); // = public abstract void fly() ==> public abstract이 생략됨
	void land();
	void take_off();
	
}
