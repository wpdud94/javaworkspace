package Service;

import vo.Product;

/*
 * ProductStore에 있는 다양한 상품들을 다루는 기능을 모아놓은 서비스 클래스
 * 다루는 기능
 * 1) 다양한 상품들의 maker를 출력
 * 2) 상품들의 총 금액을 리턴
 * 3) 상품들의 평균가를 리턴
 * 4) 특정 금액 이상되는 상품의 정보를 출력
 * 5) 특정 회사 제품을 리턴
 */

public class ProductStoreService {
	public void printAllProductMaker(Product[] pros ) {//이름은 명료히, 모든 상품이니까 s or all 쓰기. []빼면 product클래스를 지칭하는 거고 모든 인자값이니까 [] 넣기
		//즉, Product 인자값을 해징
		for(Product pro : pros) System.out.println(pro.getMaker());
	}
	
	public int getTotalPrice(Product[] pros) {
		int total = 0;
		for(Product pro : pros) total += pro.getPrice();
		return total;
	}
	
	public int getAvgPrice(Product[] pros) {
		return getTotalPrice(pros)/pros.length; // ***위에서 정의된 함수를 재호출하는 게 좋다. 어떤 공통된 기능을 생각하고 잘 뽑아내야 한다.***
	}
	
	public void printMorePrice(Product[] pros, int price) {
		for(Product pro : pros) {
			if(pro.getPrice()>=price) {
				System.out.println(pro.getMaker()+", "+pro.getPrice());
			}
		}
		
	}
	/*
	 * 리턴 타입이 일반이면 선언하고 그것을 리턴하는 게 편함
	 * 리턴 타입이 배열이면 생성을 해여 함
	 */
	public Product[] getCertainMaker(Product[] pros, String maker) {
		Product[] products = new Product[pros.length]; // 일단 배열 사이즈를 옆과 같이 하자.
		int idx = 0;
		for(Product pro : pros) {
			if(pro.getMaker().equals(maker)) {
				products[idx++]=pro; //if문을 한 번 돌릴 때마다 인덱스 증가
			}
		}
		return products;
		
	}
	
}
