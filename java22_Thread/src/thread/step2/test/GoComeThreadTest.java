package thread.step2.test;

import thread.step2.ComeThread;
import thread.step2.GoThread;

public class GoComeThreadTest {

	public static void main(String[] args) {
		GoThread go2 = new GoThread();
		ComeThread come2 = new ComeThread();
		
		Thread tgo = new Thread(go2, "GoThread");// Thread 타입에 우리가 만든 Runnable 내용 넣기
		Thread tcome = new Thread(come2, "ComeThread");
		
		tgo.start();
		tcome.start();
	}
}
