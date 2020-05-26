package inheritance.service;

import inheritance.child.Engineer;
import inheritance.child.Manager;
import inheritance.child.Secretary;
import inheritance.parent.Employee;

// 기능만 모아놓은 서비스 클래스

/*
 * 하나하나 기능을 만들면 클래스가 늘어남에 따라 기하급수적으로 늘어남
 * superclass(employee) 타입으로 한 번에 관리하면 공통 관리 가능
 */
public class PolymorphismSerivce {
	//1. step
	/*public void handleManager(Manager m) {
		
	}
	public void handleEngineer(Engineer eg) {
		
	}
	
	public void handleEngineer(Secretary s) {
		
	}*/
	
	//2. step : Overloading 기법
	/*public void handleEmployee(Manager m);
	public void handleEmployee(Engineer eg);
	public void handleEmployee(Secretary s);*/
	
	//3. step : Polymorphism
	public void handleEmployee(Employee[] earr) {//매니저, 엔지니어, 비서 등의 피고용군을 다루니까 배열로
		//1. 만약에 earr에 들어있는 직원이 강호동이라면... 부서를 총무부로 바꾸고...정보출력
		// 여러 객체가 한 타입으로 묶여있을 때는 각 객체를 알아야한다. 이때 instanceof 키워드 알기
		// 개체의 유일한 특성을 테스트할 때
		for(Employee e:earr) {
			if(e instanceof Manager) {//e라는 객체가 Manager 객체라면
				if(e.getName().equals("강호동2")) ((Manager) e).changeDept("총무부");
			}
			if(e instanceof Engineer) {//e라는 객체가 Manager 객체라면
			}
			if(e instanceof Secretary) {//e라는 객체가 Manager 객체라면
			}
	}; 
	
	
	}
}

