package step2.test;

import vo.Product;

public class PersonArrayTest {

	public static void main(String[] args) {
		//1.배열의 생성과 초기호를 한번에
		Product[] pros = {
				new Product("HP", 120000, 2),
				new Product("SAMSUNG", 230000, 3),
				new Product("LG", 500000, 13),
		};
		
		//2. Product 제품들의 기능을 출력... 제품명
		System.out.println("상품 메이커정보를 출력합니다");
		for(Product pro : pros) System.out.println(pro.getMaker()+" ");
		
		//3. 제품들 중에서 가격대가 20만원을 호가하는 제품의 메이커와 가격을 출력
		System.out.println("20만원 이상하는 상품들입니다.");
		for(Product pro : pros)
			if(pro.getPrice()>=200000) {
				System.out.println(pro.getMaker()+", "+pro.getPrice());
			}
		
		//4. 전체 상품의 총가격의 합을 출력
		System.out.println("상품들의 총가격");
		int total = 0;
		for(Product pro : pros) {
			total += pro.getPrice();
		}
		System.out.println("상품들의 총가격은 "+total+" 원입니다.");
	}

}
