package pizza.child;

import pizza.parent.Pizza;

public class PotatoPizza extends Pizza {
	
	public PotatoPizza(int price, String storename) {
		//부모의 필드가 protected로 지정되어서 super 안 사용해도 된다.'
		this.price = price;
		this.storename = storename;
	}
	
	@Override
	public void topping() {
		System.out.println("토핑을 감자로~");
	}
}
