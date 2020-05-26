package oop.self;

public class Programmer {
	//필드
	public String name;
	public int age;
	public float salary;
	public int bonus;
	
	//매소드
	public void setProgrammer(String n,int a,float s,int b) {
		//Field initialization : 필드에다가 들어온 값 집어넣기
		name=n;
		age=a;
		salary=s;
		bonus=b;
	}
	
	public String getProgrammer() {
		//Field값 리턴하기
		return name+'\t'+age+'\t'+salary+'\t'+bonus;
	}
	public float getAnnualSalary() {
		return 12*salary+bonus;
	}

}
