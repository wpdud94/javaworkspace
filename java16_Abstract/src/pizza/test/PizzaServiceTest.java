package pizza.test;

import java.util.Vector;

import pizza.child.ComPizza;
import pizza.child.PotatoPizza;
import pizza.child.SweetpotatoPizza;
import pizza.parent.Pizza;
import pizza.service.PizzaService;

public class PizzaServiceTest {

	public static void main(String[] args) {
		PizzaService service = new PizzaService();
		Vector<Pizza> v = new Vector<>();
		//pizza는 다 들어감. 뒤의 제너릭은
		
		v.add(new PotatoPizza(120000, "Pizza Hut"));
		v.add(new ComPizza(220000, "Domino 피자"));
		v.add(new SweetpotatoPizza(270000, "미스터 피자"));
		v.add(new ComPizza(250000, "오구 피자"));
		
		System.out.println("Vector 안에 저장된 피자의 수 : "+v.size());// 저장된 데이터 개수
		System.out.println("Vector의 Capcity : "+v.capacity());// 벡터의 용량
		System.out.println("Pizza Information : "+v);  // 객체 정보. 벡터 자체가 값을 출력하도록 오버라이딩 됨. 쉼표로 구분
		
		service.allMakePizza(v);

	}

}
