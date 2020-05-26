package com.encore.test;

import com.encore.service.EmployeeService;
import com.encore.util.MyDate;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		//1. Service 객체를 생성
		EmployeeService service = new EmployeeService(5); // 생성자 호출. 5칸 짜리 매너지, 엔지니어 배열 만듦
		
		//2. Method를 각각 호출... 하나씩
		
		//(1) add
		System.out.println("====매니저를 추가합니다.====");
		service.addManager(new Manager("관하나",1500,"기획부",10, new MyDate(1991,01,01)));
		service.addManager(new Manager("관둘",1700,"영업부",20, new MyDate(1992,02,02)));
		service.addManager(new Manager("관셋",1900,"코딩부",30, new MyDate(1993,03,03)));
		service.addManager(new Manager("관넷",1500,"영업부",20, new MyDate(1993,03,03)));
		//service.addManager(new Manager("관다섯",1200,"코딩부",30, new MyDate(1995,05,05)));
		service.printManager();
		
		System.out.println("====기술자를 추가합니다.====");
		service.addEngineer(new Engineer("기하나",1500,"Java",500, new MyDate(2001,01,01)));
		service.addEngineer(new Engineer("기둘",1600,"Python",700, new MyDate(2002,02,02)));
		service.addEngineer(new Engineer("기셋",1300,"C++",300, new MyDate(2003,03,03)));
		service.addEngineer(new Engineer("기넷",1700,"Java",700, new MyDate(2004,04,04)));
		//service.addEngineer(new Engineer("기다섯",2000,"Python",1200, new MyDate(2005,05,05)));
		
		//(2) delete
		System.out.println("====매니저를 추가합니다.====");
		service.deleteManager("관셋");
		service.printManager();
		service.deleteEngineer("기둘");
		service.printEngineer();
		
		

	}

}
