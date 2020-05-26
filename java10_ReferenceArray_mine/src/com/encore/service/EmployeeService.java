package com.encore.service;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeService {
	Manager[ ] ms;
	int midx;
	
	Engineer[ ] egs;
	int egidx;
	
	public EmployeeService(int size) {//access modifier와 비슷
		ms = new Manager[size];
		egs = new Engineer[size];
		
	}
	
	public void addManager(Manager m) {
		ms[midx++] = m;
	}
	
	public void printmidx() {
		System.out.println(midx);
	}
	public void addEngineer(Engineer eg) {	
		egs[egidx++] = eg;
	}
	public void deleteManager(String name) {	
		for(int i=0; i<midx; i++) {
			if(ms[i].getName().equals(name)) {
				for(int j=i; j<midx; j++) {
					ms[j] = ms[j+1];
				}
				ms[midx] = null;
				midx--;
			}
		}
	}
	public void deleteEngineer(String name) {
		for(int i=0;i<egidx;i++) {
			if(egs[i].getName().equals(name)) {
				for(int j=i;j<egidx;j++) {
					egs[j]=egs[j+1];
				}
				
				egidx--;
			}
		}
	}
	public void updateManager(Manager m) {		
	}
	public void updateEngineer(Engineer eg) {		
	}	
	//Method Overloading
	/*
	 * 하는일은 똑같은데...처리하는 데이타를 달리할때 쓰는 기법
	 * 메소드의 통일감을 강조하면서도 서로다른 데이타를 처리할수 있게끔 해준다.
	 */
	public Manager findManager(String name) {
		Manager m = null;
		
		return m;
	}
	public Manager[ ] findManager(int deptno) {
		Manager[ ] mst = new Manager[ms.length]; // add나 delete에 의해서 이미 형태는 갖춰짐
		
		return mst;
	}
	public Engineer findEngineer(String name) {
		Engineer eg = null;
		
		return eg;
	}
	//추가
	public void printManager() {
		for(Manager m : ms) {
			if(m!=null) {
				System.out.println(m.getDetails());
			}
		}
	}
	
	public void printEngineer() {
		for(Engineer eg : egs) {
			if(eg!=null) {
				System.out.println(eg.getEngineer());
			}
		}
	}
}
