package chatting.step1.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * Ű����� �Է¹��� ����Ÿ�� �о
 * ������ ����Ѵ�.
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
	BufferedReader br;
	PrintWriter pw;	
	
	public void go() {
		try {
			s = new Socket("127.0.0.1", 60000);
			System.out.println("Client Socket Creating....^^");
			
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true);//auto flush
			
			System.out.println("Client strteam Creating....^^");
			
			String line="";
			while((line=br.readLine())!=null) {
				pw.println(line);
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












