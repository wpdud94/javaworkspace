package inheritance.test;

import inheritance.child.Manager;
import inheritance.parent.Employee;
import inheritance.util.MyDate;

public class EmployeeTest {

	public static void main(String[] args) {
		// 자식 객체 생성
		Manager m = new Manager("James", 2300.0, new MyDate(1995,06,01),"개발부");
		
		//부모객체생성 for 생성자 overriding
		Employee e1 = new Employee("이수근");
		Employee e2 = new Employee("강호동", 23000.0, new MyDate(1993,2,4));
		
		System.out.println(m.getDetails());
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
	}

}
