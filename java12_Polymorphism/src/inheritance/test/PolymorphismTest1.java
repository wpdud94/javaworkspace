package inheritance.test;

import inheritance.child.Engineer;
import inheritance.child.Manager;
import inheritance.child.Secretary;
import inheritance.parent.Employee;
import inheritance.util.MyDate;

/*
 * Polymorphism
 * 직역 ::
 * poly(여러 개) + morphism(형태)
 * 의미 : 하나의 객체변수가 여러 가지 모양과 모습을 가지는 능력. 다형성
 * 의역 ::
 * 부모타입으로 자식객체 생성하는 것
 * 
 * 부모타입을 만들 때 어떤 이점이 있는지 알자
 */

/* Virtual Methods Invocation 원리
 * 왜 subclass에서 정의된 getDeatails가 나오는 건가?
 * 오버라이딩된 메소드는 polymorphism에서 가상의 메소드 호출 원리
 * 이때 가상의 메소드가 subclass 메소드
 * 상속 + 오버라이딩된 메소드에서 나타나는 성질
 * 1) 컴파일 시점 메소드 -- superclass(Employee)의 getDetails()호출
 * 2) 실행 시점 메소드 -- subclass의 getDetails()에서 호출
 * 1) 과 2)가 서로 다른 것을 이야기함
 * 
 * Object Casting
 * 따라서 자식클래스에만 있는 필드, 메소드는 변경 불가
 * 이때 자식타입으로 casting해서 써야 함
 * 아래에
 */
public class PolymorphismTest1 {

	public static void main(String[] args) {
		Employee e1 = new Employee("이수근", 12000.0, new MyDate(1995,06,01));
		Manager m1 = new  Manager("강호동", 15000.0, new MyDate(1990,01,01), "체육부");
		Engineer eg1 = new Engineer("박나라", 56000.0, new MyDate(1987, 06, 13), "R", 500.0);
		Secretary s1=  new Secretary("박보검", 34000.0, new MyDate(1992,02,02), "R");
		
		//강호동  기획부로 전출
		//기존 방식
		m1.changeDept("기획부");
		
		
		
		
		System.out.println("====정보를 출력합니다====");
		System.out.println(e1.getDetails());
		System.out.println(m1.getDetails());
		System.out.println(eg1.getDetails());
		System.out.println(s1.getDetails());
		////////////////////////////////////////////////////////////////////////////////
		//Polymorphism으로 수정
		//상속 때문에 가능해짐
		Employee e2 = new Manager("강호동2", 15000.0, new MyDate(1990,01,01), "체육부");
		Employee e3 = new Engineer("박나라2", 56000.0, new MyDate(1987, 06, 13), "R", 500.0);
		Employee e4 = new Secretary("박보검2", 34000.0, new MyDate(1992,02,02), "R");
		
		//추가
		((Engineer) e3).changeTech("Java"); // 아래 구문을 줄인 것
		
		/*Engineer eg3=(Engineer)e3;
		eg3.changeTech("Java");*/
		
		System.out.println("====정보를 출력합니다2====");
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());
		System.out.println(e4.getDetails());
		
		
		
	}

}
