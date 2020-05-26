package inheritance.test;

import inheritance.child.Engineer;
import inheritance.child.Manager;
import inheritance.child.Secretary;
import inheritance.parent.Employee;
import inheritance.service.PolymorphismSerivce;
import inheritance.util.MyDate;

/*
 * Polymorphism의 장점
 * Heterogeneous Collection
 * 여러 가지 subclass를 배열로 한 번에 객체 생성 가능하다
 * 다른 클래스를 같은 타입으로 묶어 배열 객체 생성
 * 
 */
public class PolymorphismTest2 {

	public static void main(String[] args) {
		System.out.println("==== Polymorphism 방식으로 객체 생성 ====");
		Employee e2 = new Manager("강호동2", 15000.0, new MyDate(1990,01,01), "체육부");
		Employee e3 = new Engineer("박나라2", 56000.0, new MyDate(1987, 06, 13), "R", 500.0);
		Employee e4 = new Secretary("박보검2", 34000.0, new MyDate(1992,02,02), "R");
		Employee e5 = new Manager("강호동3", 15000.0, new MyDate(1990,01,01), "체육부");
		
		Employee[] emps = {e2,e3,e4,e5};
		
		PolymorphismSerivce service = new PolymorphismSerivce();
		service.handleEmployee(emps);
		
		for(Employee emp : emps) {
			System.out.println(emp.getDetails());
		}
	}
}

