package encore.com.test;

import encore.com.service.VehicleManager;
import encore.com.service.VehicleManagerlmpl;
import encore.com.vo.Limousine;
import encore.com.vo.Motocycle;
import encore.com.vo.Truck;
import encore.com.vo.Vehicle;

public class VehicleManagerTest {

	public static void main(String[] args) {
		VehicleManagerlmpl mgr = VehicleManagerlmpl.getInstance();
		
		mgr.addVehicle(new Truck(2022, "트럭짱", 2000.0, 1000));
		mgr.addVehicle(new Limousine(3024, "리무진", 10400.0, 10));
		mgr.addVehicle(new Motocycle(4001, "CG125", 3500.0, 2));
		
		mgr.deleteVehicle(3024);
		
		Vehicle[] temp1 =  mgr.searchVehicle();
		for(Vehicle v : temp1) if(v!=null)System.out.println(v);
		
		System.out.println(mgr.searchvehicle(2022));
		System.out.println(mgr.searchvehicle(3024));
		
		Vehicle[] temp2 =  mgr.searchvehicle("CG");
		for(Vehicle v : temp2) if(v!=null) System.out.println(v);
		
		Vehicle[] temp3 =  mgr.searchvehicle(2000.0);
		for(Vehicle v : temp3) if(v!=null) System.out.println(v);
		
		mgr.updateVehicle(2022, new Truck(2022, "트럭짱", 3200, 1000));
		
		System.out.println("===== 등록된 차량 가격의 총합을 출력합니다.");
		System.out.println(mgr.sumPrice());
		System.out.println(Math.round(mgr.avgPrice())+" 원");
		System.out.println(mgr.maxPriceVehicle());
		System.out.println(mgr.minPriceVehicle());
		
	}

}
