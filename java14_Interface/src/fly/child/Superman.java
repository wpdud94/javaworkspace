package fly.child;

import fly.Flyer;

public class Superman implements Flyer{

	@Override
	public void fly() {
		System.out.println("슈퍼맨이 난다");
		//SIZE = 150; FINAL이라 변경 불가능
		System.out.println("시속 "+SIZE+"km");
		
	}

	@Override
	public void land() {
		System.out.println("슈퍼맨이 착륙한다");
		
	}

	@Override
	public void take_off() {
		System.out.println("슈퍼맨이 이륙한다");
	}
		
	public String stop_Bullet() {
		String temp = "알을 낳는다.";
		
		return temp;
		
	}
		
	}

