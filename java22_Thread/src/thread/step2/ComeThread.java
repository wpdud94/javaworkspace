package thread.step2;

public class ComeThread implements Runnable {

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
	
	/*public ComeThread(String name){
		super(name);
	}*/

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
