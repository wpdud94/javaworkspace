package encore.com.service;

import encore.com.vo.Vehicle;

/**
 * 
 * @author KJY
 * @since JDK 1.8.5
 * @version 1
 * Interface
 */
public interface VehicleManager {
	/**
	 * 렌트 차량을 추가하는 메소드
	 * @param v 차량 정보
	 */
	public void addVehicle(Vehicle v);
	/**
	 * 목록에서 해당 차랑번호를 가진 차량을 삭제하는 메소드
	 * @param num 차량번호
	 */
	public void deleteVehicle(int num);
	/**
	 * 목록의 모든 차량 정보 리턴하는 메소드
	 * @return 모든 차량의 배열
	 */
	public Vehicle[] searchVehicle();
	/**
	 * 목록의 모든 차량 중 해당 차량번호를 가진 차량의 정보 리턴하는 메소드
	 * @param num 차량 번호
	 * @return 해당 차량 정보
	 */
	public Vehicle searchvehicle(int num);
	
	/**
	 * 목록의 모든 차량 중 해당 모델명을 가진 차량의 정보 리턴하는 메소드
	 * @param model 모델명
	 * @return 해당 차량들의 배열
	 */
	public Vehicle[] searchvehicle(String model);
	/**
	 * 목록의 모든 차량 중 해당 가격을 가진 차량의 정보 리턴하는 메소드
	 * @param price 가격
	 * @return 해당 차량들의 배열
	 */
	public Vehicle[] searchvehicle(double price);
	/**
	 * 목록에서 해당 차량번호를 가진 차량의 정보를 업데이트하는 메소드
	 * @param num 차량번호
	 * @param v 새로운 차량 정보
	 */
	public void updateVehicle(int num, Vehicle v);
	/**
	 * 목록의 모든 차량 가격의 합을 리턴하는 메소드
	 * @return 모든 차량 가격의 합
	 */
	
	public double sumPrice();
	/**
	 * 등록된 차량의 평균 가격을 리턴하는 메소드
	 * @return 평균 가격
	 */
	public double avgPrice();
	/**
	 * 최대 가격의 차량 정보를 리턴하는 메소드
	 * @return 최대 가격의 차량 정보
	 */
	public Vehicle maxPriceVehicle();
	/**
	 * 최소 가격의 차량 정보를 리턴하는 메소드
	 * @return 최소 가격의 차량 정보
	 */
	public Vehicle minPriceVehicle();
	
	

}
