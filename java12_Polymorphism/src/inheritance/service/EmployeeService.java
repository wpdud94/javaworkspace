package inheritance.service;

import inheritance.child.Engineer;
import inheritance.parent.Employee;

public class EmployeeService {
	public void printInfo(Employee e) {
		System.out.println(e.getDetails());
	}
	
	public void printAllInfo(Employee[] earr) {
		for(Employee e : earr) System.out.println(e.getDetails());
	}
	
	//이름에 해당하는 employee 찾아오는
	public Employee findEmployeeByName(Employee[] earr, String name) {
		Employee emp = null; //리턴 타입이 void가 아니면 항상 선언하기. 배열의 경우 사이즈까지
		//
		for(Employee e:earr) {
			if(e.getName().equals(name)) emp = e;
		}
		return emp;
	}
	
	//
	public int getAnnualSalary(Employee e) {
		int annualSalary = 0;
		annualSalary= (int) (e.getSalary() * 12);
		if(e instanceof Engineer) {
			Engineer eg = (Engineer)e;
			annualSalary = (int) (eg.getSalary() * 12 + eg.getBonus()); // double인데 int로 변환하는 식
		}
		
		return annualSalary;
	}
	
	// 모든 직원의 연봉
	public int getTotalCost(Employee[] earr) {
		int total = 0;
		for(Employee e: earr) total += getAnnualSalary(e);
		return total;
	};
}
