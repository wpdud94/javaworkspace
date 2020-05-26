/*
 * Thread를 만드는 방법
 * 1. 상속 : extends Thread
 * 2. implements Runnable : Runnable이라는 인터페이스를 구현하는 방법
 * (권장) 2번
 * 왜냐? 다중 상속은 불가능하지만 다중 구현은 가능
 * api에서 Runnable 인터페이스 확인하기 --> start() 메소드가 없다. 
 * 해결법 : test에서 Thread 타입 객체에 우리가 만든 Runnable 내용 넣기  by 생성자
 * 
 */
package thread.step2;

public class GoThread implements Runnable {
	
	/*public GoThread(String name){
		super(name);
	}*/

	@Override
	public void run() {
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000); 
			}catch(InterruptedException e){
				
			}
			String name = Thread.currentThread().getName();
			System.out.println("CurrentThread :: "+name+", "+i);
			i++;
			if(i==20) break;
		}
		
	}
	
	/*public void run() {
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000); 
			}catch(InterruptedException e){
				
			}
			String name = Thread.currentThread().getName();
			System.out.println("CurrentThread :: "+name+", "+i);
			i++;
			if(i==20) break;
		}
	}*/
}
