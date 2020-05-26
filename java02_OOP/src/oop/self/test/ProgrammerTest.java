package oop.self.test;

import oop.self.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		Programmer p = new Programmer();  //여기서(new!!) 프로그램의 모든 것을 메모리에 올림
		
		p.setProgrammer("강제영", 26, 3000.0F, 500); // "." : ~에, ~의'
		// argument가 passing 할 때, 인자 개수 순서 타입까지 다 지켜야 함.
		
		System.out.println("==========정보를 출력합니다.===========\n");
		
		System.out.println(p.getProgrammer()); //리턴 되는 것을 출력해야 볼 수 있음
		
		System.out.println("==========당신의 연봉은...===========\n");
		
		System.out.println(p.getAnnualSalary());
				
	}

}
