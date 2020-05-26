package fly.child;

import fly.Flyer;

public class Airplane implements Flyer{

	@Override
	public void fly() {
		System.out.println("비행기 난다");
		
	}

	@Override
	public void land() {
		System.out.println("비행기 착륙한다");
		
	}

	@Override
	public void take_off() {
		System.out.println("비행기 이륙한다");
		
	}

}
