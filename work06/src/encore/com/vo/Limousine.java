package encore.com.vo;
/**
 * 
 *  @author KJY
 * @since JDK 1.8.5
 * @version 1
 * Sub vo Class
 *
 */
public class Limousine extends Vehicle{
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
	 * 길이
	 */
	private int length;
	
	public Limousine() {};
	public Limousine(int num, String model, double price, int length) {
		super(num, model, price);
		this.length = length;
	}
	public int getlength() {
		return length;
	}
	
	public void setlength(int length) {
		this.length = length;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+length;
	}
	
	
	
	

}
