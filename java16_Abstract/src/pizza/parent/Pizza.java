package pizza.parent;
/*
 * 추상클래스의 용도
 * 1. 공통적인 부분은 성질 그대로 물려주고
 * 2. 서로 다르게 적용되는 부분은 추상으로 물려주어 자식이 구현하도록 한다.
 */
public abstract class Pizza {
	protected int price;
	protected String storename;
	
	public Pizza(int price, String storename) {
		super();
		this.price = price;
		this.storename = storename;
	}
	
	public Pizza() {};//상속 시 명시적 생성자 중요. 자식클래스에서 super();가 생략되기에
	
	public void makePizza() {//순서대로~
		dough();
		topping();
		bake();
		cut();
		box();
	}
	public void dough() {
		System.out.println("피자 반죽과 함께 도우를 빚다");
	}
	public void box() {
		System.out.println("피자 boxing");
	}
	public void bake() {
		System.out.println("피자를 180도에서 10분간 구워냅니다");
	}
	public void cut() {
		System.out.println("피자를 8등분으로 자른다");
	};
	//이까지는 공통적인 부분
	
	public abstract void topping();

	@Override
	public String toString() {
		return storename + " "+price+" 원";
	}
	
	
	
}
