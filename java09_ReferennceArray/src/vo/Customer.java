package vo;
/*
 * 상품을 구입하는 소비자에 대한 정보를 담고 있는 클래스
 * 상품을 구매하는 고객
 * 상품을 구매하지 않은 고객
 * Product <-------- Customer
 * 고객이 상품을 가짐 <=> 고객이 상품을 필요, 의존
 * =======================
 * 
 */
public class Customer {
	private int ssn; // 각각의 고객을 구분하는 유니크한 key
	private String name;
	private String address;
	// 아래는 hasing
	private Product[] products; // 상품을 가질 수 있고 안 가질 수 있기에(값이 달라질 수 있음) 배열로 해야 함
	
	// 생성자 주입
	public Customer(int ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	//setter 주입
	public void buyProducts(Product[] products) { // 해징(일어나는 것은 test에서) = 필요로 한다 = 구매이니까
		this.products = products;
	}

	//getter 파트
	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Product[] getProducts() {
		return products;
	}
	
	public String getCustomer() {
		return name+address+ssn;
	}
	
	
	
	

}
