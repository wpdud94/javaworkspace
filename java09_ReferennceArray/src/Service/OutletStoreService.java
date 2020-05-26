package Service;

import vo.Customer;
import vo.Product;

/*
 * 대형 아울렛에서 고객이 상품을 사는 기능을 다룸
 * 상품을 구입하는 고객, 상점에 입점된 상품에 대한 기능들을 다루는 서비스 클래스 
 */

public class OutletStoreService {
	/*
	 * getAllProductMaker() : 특정 고객이 산 모든 상품의 이름을 가져오기
	 * getAllCustomer() : 모든 고객에 대한 모든 정보(기본 정보 + 구매 정보)
	 * getACustomer() : 특정 고객에 대한 모든 정보
	 * maxPriceProduct() : 최고가 상품의 가격
	 * getMoreAvgProduct() : 특정한 고객이 구입한 상품들 중에서 평균가 이상의 상품 정보 
	 */
	
	//(1)
		int prosize = 4;
		int custsize = 3;
		
		public Product[ ] getProduct(Customer vo) {// 인자를 일일이 입력하지 않고 단객체 넣음
			return vo.getProducts();
		}
		public String[ ] getAllProductMaker(Customer vo) {
			String[ ] temp = new String[prosize];
			Product[ ] pros=vo.getProducts();
			int cnt = 0;
			for(Product p : pros) {			
				System.out.println(p.getMaker());
				temp[cnt++] = p.getMaker();
			}
			return temp;
		}
		
		
		public Customer[ ] getAllCustomer(Customer[ ] custs) {
			Customer[ ] cs = new Customer[custsize];
			int cnt = 0;
			for(Customer c : custs) {
				cs[cnt++] = c;
			}
			return cs;
		}
		
		public Customer getACustomer(Customer[ ] custs, int ssn) {
			Customer cust = null;
			for(Customer c : custs) {
				if(c.getSsn()==ssn) cust = c;			
			}
			return cust;
		}
		
		public int maxPriceProduct(Customer c) {
			int max = 0;
			System.out.println(c.getName()+" 님이 구매하신 최고가 상품은....");
			Product[ ] pros = c.getProducts();
			for(Product p : pros) {
				if(p.getPrice()>max) max = p.getPrice();
			}
			return max;
		}
		//�߰�
		public int avgPrice(Customer c) {
			int total = 0;		
			Product[ ] pros = c.getProducts();
			for(Product p : pros) {
				total += p.getPrice();
			}
			return total/pros.length;
		}
		public Product[ ] getMoreAvgProduct(Customer c) {
			Product[ ] temp = new Product[prosize];
			Product[ ] pros=c.getProducts();
			int cnt = 0;
			for(Product p : pros) {
				if(p.getPrice()>=avgPrice(c)) 
					temp[cnt++] = p;			
			}
			return temp;
		}
	}
	


