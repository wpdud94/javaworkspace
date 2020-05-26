package com.encore.vo;

import com.encore.util.MyDate;

public class Engineer {
	private String name;
	private double salary;
	private String tech;
	private double bonus;
	//
	private MyDate birthdate;
	
	public Engineer(String name, double salary, String tech, double bonus, MyDate birthdate) {
		this.name = name;
		this.salary = salary;
		this.tech = tech;
		this.bonus = bonus;
		this.birthdate = birthdate;
	}
	
	
	
	public String getName() {
		return name;
	}



	public String getEngineer() {
		return name+" "+salary+" "+tech+" "+bonus+" "+birthdate.getMyDate();
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getTech() {
		return tech;
	}



	public void setTech(String tech) {
		this.tech = tech;
	}



	public double getBonus() {
		return bonus;
	}



	public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	public MyDate getBirthdate() {
		return birthdate;
	}



	public void setBirthdate(MyDate birthdate) {
		this.birthdate = birthdate;
	}
	
}
