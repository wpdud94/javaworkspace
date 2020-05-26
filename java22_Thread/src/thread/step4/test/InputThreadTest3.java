package thread.step4.test;
import javax.swing.JOptionPane;
/*
 * 카운트작업 - CountThread
 * 숫자입력작업 - InputThread
 * ::
 * 두 스레드 간 커뮤니케이션은 프로세스의 자원으로 해야 한다.
 * 자원은 프로세스에. 각 스레드는 그 자원을 해징하여 차용한다. 그 자원을 활용하여 원하는 코드 구성
 * 
 */
class CountThread implements Runnable{
	private InputThreadTest3 process;
	CountThread(InputThreadTest3 process){
		this.process= process;
	}
	

	@Override
	public void run() {
		//2. 일종의 카운팅 작업 흉내...
		for(int i=10;i>0;i--) {
			
			if(process.inputCheck) break;
			System.out.println(i);
			try {
				Thread.sleep(600);
			}catch(InterruptedException e) {
				
			}
		}// for 다 끝나도 false면 
		if(!process.inputCheck) {
			System.out.println("10초 경과되었습니다... 값입력 시간 초과");
			System.exit(0);// 모든 코드 도는 것을 정상종료
		}
		
	}
	
}

class InputThread implements Runnable{
	private InputThreadTest3 process;
	InputThread(InputThreadTest3 process){
		this.process= process;
	}

	@Override
	public void run() {
		//1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로도 번호를 입력하세요..."); //스케너와 비슷. 콘솔이 아닌 form에 다가. swing 기법
		System.out.println("입력하신 숫자는 "+input+" 입니다.");
		
		process.inputCheck = true;
		}		
}

//Process... 이 안에서 2개 스레드가 돈다
public class InputThreadTest3 {
	boolean inputCheck = false; //프로세스의 자원 공유. static으로 해도 됨
	
	public static void main(String[] args) {
		InputThreadTest3 process = new InputThreadTest3();
		
		InputThread input = new InputThread(process); // 프로세스 통으로 넣느다 = 해징(스레드가 프로세스를 가지는) = 자원공유
		Thread tinput = new Thread(input);
		CountThread count = new CountThread(process); // static 영역 안에서 절대 this 못 씀 ==> 어차피 객체를 넣는 것이니 참조변수 활용
		Thread tcount = new Thread(count);
		
		tcount.start();
		tinput.start();
		
		

	}

}
