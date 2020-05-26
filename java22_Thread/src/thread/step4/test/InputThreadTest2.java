package thread.step4.test;
import javax.swing.JOptionPane;
/*
 * step 2
 * ::
 * 카운팅 작업은 카운팅 작업대로
 * 팝업창 입력은 팝업창 입력대로
 * 병렬적으로 작업을 진행
 * ::
 * 메인스레드 -- 팝업창 입력
 * 작업스레드 -- 카운팅 --- CountineThread(implements Runnable)
 * 
 * -------------------------------
 * 메인스레드는 작업을 위한 스레드가 아님
 * 메인은 작업스레드 간 조율하는 역할
 * ==> count스레드와 input 스레드 만들기
 * ==> 같은 프로세스 안에서 도는 작업스레드의 커뮤니케이션 돕기 
 */
class CountingThread implements Runnable{

	@Override
	public void run() {
		//2. 일종의 카운팅 작업 흉내...
		for(int i=10;i>0;i--) {
			try {
				Thread.sleep(600);
			}catch(InterruptedException e) {
				
			}
			System.out.println(i);
		}
		
	}
	
}

public class InputThreadTest2 {

	public static void main(String[] args) {
		//1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로도 번호를 입력하세요..."); //스케너와 비슷. 콘솔이 아닌 form에 다가. swing 기법
		System.out.println("입력하신 숫자는 "+input+" 입니다.");
		
		CountingThread count = new CountingThread();
		Thread tcount = new Thread(count);
		
		tcount.start();

	}

}
