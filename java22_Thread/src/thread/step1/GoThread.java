package thread.step1;
//Thread 클래스...
public class GoThread extends Thread {
	
	public GoThread(String name){
		super(name);
	}

//Thread가 작동하는 부분... run메소드 안에
//내부적을 호출되기 때문에 인자값과 산출값 어느 것도 바꾸면 안 되고 그대로 해야함
	public void run() {
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000); // static이므로 이 형태. 1000 = 1초 동안 잠
			}catch(InterruptedException e){
				
			}
			String name = Thread.currentThread().getName();
			System.out.println("CurrentThread :: "+name+", "+i);
			i++;
			if(i==20) break;
		}
	}
}
