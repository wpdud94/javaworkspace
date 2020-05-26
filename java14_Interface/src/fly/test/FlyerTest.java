package fly.test;

import fly.Flyer;
import fly.child.Airplane;
import fly.child.Bird;
import fly.child.Superman;

public class FlyerTest {

	public static void main(String[] args) {
		//Flyer f0 = new Flyer();//이대로 하면 객체 생성불가능하다. 추상화가 하나라도 있으면 Instantiate(객체 생성)이 안 됨
		Flyer f1 = new Bird() {};		
		Flyer f2 = new Airplane();
		Flyer f3 = new Superman();
		
		//1.
		f1.fly(); // Virtual Method Invocation 원리.. 오버라이딩된 것만 나타남
		
		//2.
		String ret = ((Bird) f1).layEggs(); //casting
		System.out.println(ret);
	}

}
