package com.encore.service;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
/**
 * @version1 Array[] 사용
 * @version2 싱글톤 사용
 * @version3 ArrayList<> 사용
 * @version3 Exception 사용
 */

import com.encore.exception.DupilcateNameException;
import com.encore.exception.RecordNotFoundException;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;
// Manager[ ]을 ArrayList<Employee> 사용
public class EmployeeService {
	
	//추가...
	private ArrayList<Employee> list;
	
	//싱글톤
	private static EmployeeService service = new EmployeeService();	
	private EmployeeService(){
		list = new ArrayList<>();
	}
	public static EmployeeService getInstance() {
		return service;
	}
	
	
	public void addEmployee(Employee e) throws DupilcateNameException {	//DupilcateNameException 발생
		boolean find = false;
		for(Employee emp : list) {
			if(e.getName().equals(emp.getName())) {//이미 그런 사람이 있다면?
				find = true; //flag값 밑에서 for을 돌 필요 없다.
				throw new DupilcateNameException(emp.getName()+" 님은 이미 회원이십니다.");
			}
		}
		if(find == false) {
			list.add(e);// 기존재가 없다.
			System.out.println(e.getName()+"님이 회원으로 등록되셨습니다. ");
		}
	}	
	public void deleteEmployee(String name) throws RecordNotFoundException {	//record~exception 발생
		boolean find = false;
		for(Employee emp : list) {
			if(emp.getName().equals(name)) {//삭제하려는 대상이 있다.
				find = true;
				System.out.println(emp.getName()+" 님을 삭제합니다.");
				list.remove(emp);
				break;
			}
		}
		if(find == false) throw new RecordNotFoundException("삭제할 대상 없음");
		
	}	
	public void updateEmployee(Employee e) {	
		boolean find = false;
		
		//index를 이용해서 활용 가능 list.get(i).getName 활용
		
		for(Employee e1 : list) {
			if(e1.getName().equals(e.getName() )) {
				find = true;
				System.out.println(e.getName()+" 님의 정보를 수정합니다.");
				e1.setName(e.getName());
				e1.setBirthDate(e.getBirthDate());
				e1.setSalary(e.getSalary());
				if(e1 instanceof Manager && e instanceof Manager) {
					((Manager) e1).setDept(((Manager)e).getDept());
					((Manager) e1).setDeptno((((Manager)e).getDeptno()));
				}
				if(e1 instanceof Engineer && e instanceof Engineer) {
					((Engineer) e1).setTech(((Engineer)e).getTech());
					((Engineer) e1).setBonus(((Engineer)e).getBonus());
				}
				break;
			}
		}
		if(find == false) System.out.println("입려하신 대상이 없습니다.");
	}
	public ArrayList<Employee> findEmployee(double sal) {
		ArrayList<Employee> temp = new ArrayList<>();
		for(Employee e : list) {
			if(temp == null) continue;
			if(e.getSalary() == sal) temp.add(e);
		}
		return temp;
	}	
	//추가
	public void getEmployee() {
		for(Employee e : list) System.out.println(e);
	}	
}







