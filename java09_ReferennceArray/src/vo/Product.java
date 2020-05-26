package vo;
// 상품에 대한 정보를 저장하는 vo 클래스
// vo : Value Object
/* [vo 에 대하여]
 * 보통 데이터를 DB에서 가지고 옴
 * DB
 * 
 */
public class Product {
	private String maker;
	private int price;
	private int count;
	
	public Product(String product, int price, int count) {
		super();
		this.maker = product;
		this.price = price;
		this.count = count;
	}
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String product) {
		this.maker = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getProducts() {
		return maker + price + count;
	}
	
	

}
