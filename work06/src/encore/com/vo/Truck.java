package encore.com.vo;
/**
 * 
 *  @author KJY
 * @since JDK 1.8.5
 * @version 1
 * Sub vo Class
 *
 */
public class Truck extends Vehicle{
	/**
	 * 차량번호
	 */
	private int num;
	/**
	* 모델명
	**/
	private String model;
	/**
	* 가격
	**/
	private double price;
	/**
	 * 화물용량
	 */
	private int capacity;
	
	public Truck() {};
	public Truck(int num, String model, double price, int capacity) {
		super(num, model, price);
		this.capacity = capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+capacity;
	}
	
	
	
	

}
