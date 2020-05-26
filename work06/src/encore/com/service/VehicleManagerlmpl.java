package encore.com.service;

import org.omg.CORBA.VersionSpecHelper;

import encore.com.vo.Truck;
import encore.com.vo.Vehicle;

/**
 * 
 * @author KJY
 * @since JDK 1.8.5
 * @version 1
 * service
 */
public class VehicleManagerlmpl implements VehicleManager{
	//기본 변수 생성
	Vehicle[] vehi = new Vehicle[100];
	Vehicle[] veh;
	int index = 0;
	
	//싱글톤 적용
	private static VehicleManagerlmpl mgr = new VehicleManagerlmpl();
	private VehicleManagerlmpl() {};
	public static VehicleManagerlmpl getInstance() {
		return mgr;
	};
	/**
	 * 새로운 차량을 목록에 저장하는 메소드
	 * @param v 차량 정보
	 */
	public void addVehicle(Vehicle v) {
	
		System.out.println("======="+"차랑번호가 "+v.getNum()+" 인 차량을 목록에 추가합니다.");
		vehi[index++] = v;
		veh = new Vehicle[index];
		System.arraycopy(vehi, 0, veh, 0, index);
	
	};
	
	/**
	 * 목록에서 차량을 삭제하는 메소드
	 * @param num 차량 번호
	 */
	public void deleteVehicle(int num) {
		for(int i=0;i<veh.length;i++) {
			if(veh[i]== null) continue;
			if(veh[i].getNum() == num) {
				for(int j=i;j<veh.length;j++) {
					if(j+1 == veh.length) continue;
					veh[j] = veh[j+1];
				}
				System.out.println("======="+num+" 에 해당하는 차량을 삭제합니다.");
				veh[index-1] = null;
				index--;
			}
			
		}
	};
	
	/**
	 * 목록의 모든 차량을 검색하는 메소드
	 * @return 차량 배열
	 */
	public Vehicle[] searchVehicle() {
		System.out.println("======="+" 모든 차량 정보를 출력합니다.");
		return veh;
	}
	/**
	 * 차량 번호로 해당 차량을 검색하는 메소드
	 * @param num 차량 번호
	 * @return 해당 차량 정보
	 */
	public Vehicle searchvehicle(int num) {
		System.out.println("======="+num+"에 해당하는 차량을 출력합니다.");
		for(Vehicle v:veh) {
			if(v==null) continue;
			if(v.getNum() == num) return v; 
		}
		return null;
	}
	/**
	 * 차량 모델로 차량을 검색하는 메소드
	 * @param model 차량 모델명
	 * @return 해당 차량 배열
	 */
	public Vehicle[] searchvehicle(String model) {
		Vehicle[] temp = new Vehicle[index];
		int idx=0;
		System.out.println("======="+model+"에 해당하는 차량을 출력합니다.");
		for(Vehicle v:veh) {
			if(v==null) continue;
			if(v.getModel().contains(model)) temp[idx++] = v; 
		}
		return temp;
	}
	/**
	 * 가격으로 차량을 검색하는 메소드
	 * @param price 차량 가격
	 * @return 해당 차량 배열
	 */
	public Vehicle[] searchvehicle(double price){
		Vehicle[] temp = new Vehicle[index];
		int idx=0;
		System.out.println("======="+price+"에 해당하는 차량을 출력합니다.");
		for(Vehicle v:veh) {
			if(v==null) continue;
			if(v.getPrice() == price) temp[idx++] = v; 
		}
		return temp;
	}
	/**
	 * 해당 차량 번호에 해당하는 정보를 수정하는 메소드
	 * @param num 차량정보
	 * @param v 새로운 차량 정보
	 */
	public void updateVehicle(int num, Vehicle v) {
		System.out.println(num+" 에 해당하는 차량 정보를 수정합니다.");
		for(int i=0;i<index;i++) {
			if(veh[i]==null) continue;
			if(veh[i].getNum() == num) {
				veh[i] = v;
			}
		}
	}
	/**
	 * 모든 차량 가격의 합
	 * @return 차량 가격의 합
	 */
	public double sumPrice() {
		double total = 0.0;
		for(Vehicle v : veh) {
		if(v==null) continue;
		total += v.getPrice();
		}
		return total;
	}
	/**
	 * 평균가격을 계산하는 메소드0
	 * @return 평균가격
	 */
	public double avgPrice() {
		double avg = 0.0;
		System.out.println("===== 등록된 차량의 평균 가격을 출력합니다.");
		avg = sumPrice()/index;
		return avg;
	}
	/**
	 * 가격이 제일 높은 차량 정보를 검색하는 메소드
	 * @return 가격이 제일 높은 차량 정보
	 */
	public Vehicle maxPriceVehicle() {
		System.out.println("===== 가격이 제일 높은 차량 정보를 출력합니다.");
		double max = veh[0].getPrice();
		for(int i=0;i<index;i++) {
			if(max<veh[i].getPrice()) max = veh[i].getPrice();
		}
		for(Vehicle v : veh) if(v.getPrice()==max) return v;
		
		return null;
	}
	/**
	 * 가격이 제일 낮은 차량 정보를 검색하는 메소드
	 * @return 가격이 제일 낮은 차량 정보
	 */
	public Vehicle minPriceVehicle() {
		System.out.println("===== 가격이 제일 낮은 차량 정보를 출력합니다.");
		double min = veh[0].getPrice();
		for(int i=0;i<index;i++) {
			if(min>veh[i].getPrice()) min = veh[i].getPrice();
		}
		for(Vehicle v : veh) if(v.getPrice()==min) return v;
		
		return null;
	}
	
	
	
	
}
