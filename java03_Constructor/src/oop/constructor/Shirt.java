package oop.constructor;

public class Shirt {
	public String maker;
	public boolean longSleeved;
	public char color;
	
	public Shirt() {} //Default Contstructor
	public Shirt(String m, boolean longs, char c) {
		maker =m;
		longSleeved = longs;
		color = c;
	} //Test에서 인자를 넣었지만 받아주는 게 parameter로 없으니 만들자
		//Field Initialization
	public String getDetails() { //worker method
		return maker+", "+longSleeved+", "+color;
	}
	

}
