package inheritance.util;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	//주입
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/*
	 * 1.Object의 기능을 그대로 받아서
	 * 2.그 기능을 자식 본인에게 맞도록 고쳐쓰기
	 */
	@Override
	public String toString() {
		return year+", "+month+", "+day; // 이 클래스의 부모가 없기에 부모클래스는 자동으로 Object
		//주소값을 리턴 ==> getDetail 같은 거 필없음 알아서 주소값을 리턴하니까
	}
}
