package thread.step6;
/*
 * MegaBoxUser는 MegaBox에서 좌석을 예매하는 일을 전담하는 스레드라고 간주
 * reserve()라는 기능하나 작성.. 예매로직을 작성...
 */
public class MegaBoxUser implements Runnable{
	private boolean seat = false; // 좌석 예매 시 true 할당
	
	@Override
	public void run() {
		//예매하는 기능을 적어도 되고
		try {
			reserve();
		}catch(InterruptedException e) {
			
		}
		
		
	}
	
	public synchronized void reserve() throws InterruptedException {
		String tName = Thread.currentThread().getName();
		System.out.println(tName+" 님, 예매하러 오셨습니다.");
		
		if(seat==false) { //좌석이 비었다면
			Thread.sleep(2000); // run이 아닌 곳에서는 예외 처리 안 하고 오직 run에서만
			System.out.println(tName+" 님, 좌석 예매 완료");
			seat = true;
		}else {//좌선이 이미 찼다면, 
			System.out.println(tName+" 님, 해당 좌석은 이미 예매 완료된 자리입니다.");
		}
	}
}
