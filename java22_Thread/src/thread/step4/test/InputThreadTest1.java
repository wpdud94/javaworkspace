package thread.step4.test;
/*
 * 메인스레드만 가동되는 로직...
 * 동시 작업이 안 됨
 * 로또 번호를 입력받는 작업과 카운팅 작업이 병렬적으로 진행되어야 한다.
 * ---------------------------------
 * 10초 안에 최종적인 로또 번호가 입력되어야 한다.
 * 
 */
import javax.swing.JOptionPane;

public class InputThreadTest1 {

	public static void main(String[] args) {
		//1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로도 번호를 입력하세요..."); //스케너와 비슷. 콘솔이 아닌 form에 다가. swing 기법
		System.out.println("입력하신 숫자는 "+input+" 입니다.");
		
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
