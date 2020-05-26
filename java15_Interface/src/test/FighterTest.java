package test;

import test.Attackable.Fighter;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		if (f instanceof Unit) {
			System.out.println("f는 Unit의 자손입니다.");
		}
		
		if (f instanceof Movable) {
			System.out.println("f는 Unit의 자손입니다.");
		}
		
		if (f instanceof Attackable) {
			System.out.println("f는 Unit의 자손입니다.");
		}
	}

}

class Unit{
	int currentHP; //유닛의 체력
	int x; // 유닛의 위치(x좌표)
	int y; // 유닛의 위치(y좌표)
	
}

interface Movable{
	void move(int x, int y);
	
}

interface Attackable{
	void attack(Unit u);
	
interface Fightable extends Movable, Attackable{//인터페이스를 부모에 뒀다고 무조건 구현하면 안 됨. 그냥 상속받을 수 있음
	
}

class Fighter extends Unit implements Fightable{
	
	@Override
	public void move(int x, int y) {};
	
	@Override
	public void attack(Unit u) {};
}

}






