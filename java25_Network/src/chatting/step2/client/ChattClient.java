package chatting.step2.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * Ű����� �Է¹��� ����Ÿ�� �о
 * ������ ������
 * ------------------------------
 * �ٽ� ������ ���� �޼����� �޾Ƽ�
 * Ŭ���̾�Ʈ �ڽ��� �ܼ�â�� ����Ѵ�.
 * ::
 * �Է� 2
 * ��� 2...socket
 * ::
 * Client�� ����
 * 1. ���� ����
 * 2. ��Ʈ��..
 */
public class ChattClient {
	Socket s;
	BufferedReader br, br1; //�߰�
	PrintWriter pw;	
	
	public void go() {
		try {
			s = new Socket("192.168.0.33", 60000);
			System.out.println("Client Socket Creating....^^");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true);//auto flush
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			System.out.println("Client strteam Creating....^^");
			
			while(true) {
				String line = br.readLine();//Ű����� �Է¹�������Ÿ �о..
				pw.println(line); //������ ����...
				
				//////////////////////////////////////////
				String serverMsg=br1.readLine();
				System.out.println("������ ���� �޼��� "+serverMsg);				
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












