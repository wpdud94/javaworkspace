package step4.test;

import Service.OutletStoreService;
import vo.Customer;
import vo.Product;

public class OutletStoreServiceTest {

	public static void main(String[] args) {
		//1. 고객을 먼저 생성... 2명
		Customer[] customers = new Customer[3]; // 입력할 백터 혹은 행렬이 다수니까 배열로
		customers[0] = new Customer(123, "이나영", "방배동");
		customers[1] = new Customer(321, "김태희", "서초동");
		customers[2] = new Customer(444, "원빈", "방배동");
		
		//2. 고객이 구매할 상품정보
		Product[] pros1 = {
				new Product("진라면", 8000, 2),
				new Product("엘라스틴샴푸", 18000, 1),
				new Product("달걀", 5000, 1),
		};

		Product[] pros2 = {
				new Product("맥심커피", 32000, 3),
				new Product("스파게티 소스푸", 55000, 1),
				new Product("달걀", 6000, 2),
				new Product("공기청정기", 450000, 1),
		};
				
		//3. 이나영이 커피, 스파게트, 달걀, 공기청정기 구매 | 김태의가 진라면,,삼푸, 달걀을 구마해도록 연결
		// 이 부분에서 Customer와 Product와의 해징이 일어남. Has a relation
		customers[0].buyProducts(pros2);
		customers[1].buyProducts(pros1);
		
		
		//4. Service 객체를 생성....메소드를 호출...
				OutletStoreService service  = new OutletStoreService();
				
				String[ ] str=service.getAllProductMaker(customers[0]);
				System.out.println(customers[0].getName()+" 님이 구매하신 제품명 입니다.");
				for(String s : str) {
					if(s==null) continue;
					System.out.print(s+" ");
				}
				
				System.out.println("\n========= 2. 고객정보 출력 ==============");
				Customer[ ] retCust=service.getAllCustomer(customers);		
				for(Customer c : retCust) {
					System.out.println(c.getCustomer());
					if(c.getProducts()!=null) {
						System.out.println("고객님이 구매하신 상품정보입니다.");
						for(Product p : c.getProducts()) 
							System.out.println(p.getProduct());					
					}	
					System.out.println("-----------------------------------");
				}
				
				System.out.println("\n======  3. 특정 고객 검색 =============");
				Customer aCust=service.getACustomer(customers, 123);
				System.out.println(aCust.getCustomer());
				
				System.out.println("\n======  4. 특정 고객의 최고가 상품 검색 =============");
				int retMax=service.maxPriceProduct(customers[0]);
				System.out.println(retMax+" 원입니다.");
				
				System.out.println("\n======  5. 평균가 이상되는 상품 검색 =============");
				Product[ ] avgPro=service.getMoreAvgProduct(customers[0]);
				System.out.println("해당 상품의 평균가는 "+service.avgPrice(customers[0])+"원 입니다");
				System.out.println(customers[0].getName()+" 님의 상품중에 평균가 이상되는 상품입니다.");
				for(Product p : avgPro) {
					if(p==null)continue;
					System.out.println(p.getProduct());
				}			
			}
		}

		


