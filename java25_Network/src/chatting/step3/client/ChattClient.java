package chatting.step3.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattClient {
	Socket s;
	BufferedReader br; 
	PrintWriter pw;	
	
	public void go() {
		try {
			s = new Socket("192.168.0.33", 60000);
			System.out.println("Client Socket Creating....^^");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true);//auto flush
			
			//�߰�
			ClientThread ct= new ClientThread(s);
			ct.start(); //---> run()
			
			while(true) {
				String line = br.readLine();//Ű����� �Է¹�������Ÿ �о..
				pw.println(line); //������ ����...
				
			}
		}catch(Exception e) {
			System.out.println("�������� ���ῡ �����߽��ϴ�...");
		}
	}
	public static void main(String[] args) {
		
		ChattClient cc = new ChattClient();
		cc.go();
	}
}

class ClientThread extends Thread{ //������ ���� ����Ÿ�� �������� �о���̴� ������
	Socket s;
	BufferedReader br2; 
	String str;
	
	ClientThread(Socket s){
		this.s=  s;
	}
	
	public void run() {
		try {
			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while(true) {
				str = br2.readLine();
				System.out.println("�����޼��� : "+str);
			}
		}catch(Exception e) {
			
		}
	}	
}










