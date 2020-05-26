/*
 * 해당코드에서 별도의 Thread를 작성하지 않고 실행
 * 경고음을 발생시키고 동시에 경고음을 컨솔로 프린팅하는 작업
 * 두 가지 일을 main 아래에서 처리하도록 할 것 ==> 병렬적 작업
 * 
 * 이때까지 만든 test.class는 프로세스. Single Thread
 * 프로세스에는 main이 있어야 함(이게 있어야 실행된다)
 * main 하나로 끝냄 ==> main = Thread ==> 병렬 작업 불가
 *  
 */
package thread.step3.test;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit(); //static
		
		for(int i=0;i<5;i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}

		// 프린트
		for(int i=0;i<5;i++) { // 소리와 프린트가 동시에 작동하지 않고 하나 끝내고 하나 함. 이는 프로세스 작업. 
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}
	}

}
