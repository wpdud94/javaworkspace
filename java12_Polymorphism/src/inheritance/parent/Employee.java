package inheritance.parent;

import inheritance.util.MyDate;

public class Employee {
	public static final double BASE_SALARY = 100.0; 
	//이름이 대문자로 된 변수명은 상수값. return 타입 앞에 static final을 붙여야 한다.
	//상수값은 범용적이기에 public이 맞음
	private String name;
	private double salary;
	private MyDate birthdate;
	
	public Employee() {};
	
	public Employee(String name, double salary, MyDate birthdate) {
		this.name = name;
		this.salary = salary;
		this.birthdate = birthdate;
	}
	
	public Employee(String name) {
		this(name, BASE_SALARY, new MyDate(1980,1,1));
	}
	/*
	 * This
	 * 1) 변수 앞에 붙이는 this
	 * 로컬변수와 필드의 이름이 같을 때 둘을 구분하기 위해 필드 앞에 붙임
	 * 2) 생성자 앞에 붙이는 this
	 * 하나의 클래스에서 서로 다른 생성자를 호출할 때 사용
	 * this안의 인자가 풀명시적 생성자로 가서 해당값+기본값으로 함
	 */

	public String getDetails() {
		return name+", "+salary+", "+birthdate;
	}

	public static double getBaseSalary() {
		return BASE_SALARY;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getBirthdate() {
		return birthdate;
	}

}