package encore.com.vo;
/**
 * 
 *  @author KJY
 * @since JDK 1.8.5
 * @version 1
 * Sub vo Class
 *
 */
public class Motocycle extends Vehicle{
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
	 * 바퀴 수
	 */
	private int numOfWheel;
	
	public Motocycle() {};
	public Motocycle(int num, String model, double price, int numOfWheel) {
		super(num, model, price);
		this.numOfWheel = numOfWheel;
	}
	public int getlength() {
		return numOfWheel;
	}
	
	public void setlength(int length) {
		this.numOfWheel = length;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+numOfWheel;
	}
	
	
	
	

}
