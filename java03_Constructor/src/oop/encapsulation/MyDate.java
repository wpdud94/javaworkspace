package oop.encapsulation;

public class MyDate {
	private int month;
	private int day;
	
	// 로컬변수와 필드의 이름이 같을 때 구분하기 위해서 필드 앞에 this.을 붙인다
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	

}
