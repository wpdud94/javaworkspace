/*
실행클래스 = 하나의 프로세스
이 안에는 Main Thread 존재
------------------------------
BeepPrintTest2는 하나의 프로세스
이 안에 메인Thread + 작업Thread 하나 더 추가
1) 메인스레드 : beep()를 5번 발생
2) 작업스레드 - BeepPrintThread : sysout("띵")을 5번 발생
 */
package thread.step3.test;

import java.awt.Toolkit;

class BeepPrintThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) { // 소리와 프린트가 동시에 작동하지 않고 하나 끝내고 하나 함. 이는 프로세스 작업. 
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
						
			}
		}
	}
}

public class BeepPrintTest2 {

	public static void main(String[] args) {
		
		BeepPrintThread beepT = new BeepPrintThread();
		beepT.start(); // 이때 병렬 작업이 작동. 하나는 run으로 다른 하나는 main의 밑으로 진행
		
		Toolkit tool = Toolkit.getDefaultToolkit(); //static
		
		for(int i=0;i<5;i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}
	}
	
	public static void BeepThread(String[] args) {
		for(int i=0;i<5;i++) { // 소리와 프린트가 동시에 작동하지 않고 하나 끝내고 하나 함. 이는 프로세스 작업. 
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
						
			}
		}
		
	}

}
