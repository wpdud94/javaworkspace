package com.encore.vo;

import com.encore.util.MyDate;

public class Manager {
	private String name;
	private double salary;
	private String dept;
	private int deptno;
	//
	private MyDate birthdate;
	
	public Manager(String name, double salary, String dept, int deptNo, MyDate birthdate) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.deptno = deptNo;
		this.birthdate = birthdate;
	}
	
	
	
	public String getName() {
		return name;
	}



	public MyDate getBirthdate() {
		return birthdate;
	}



	public String getDetails() {
		return name+" "+salary+" "+dept+" "+deptno+" "+birthdate.toString(); 
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public int getDeptno() {
		return deptno;
	}



	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}



	public void setBirthdate(MyDate birthdate) {
		this.birthdate = birthdate;
	}
	
	
}
