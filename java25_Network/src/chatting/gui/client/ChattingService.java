package chatting.gui.client;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
/*
 * ä�� ����...�Է¹��� TextArea�� ������ Ư���� ���丮�� ���Ϸ� ����ϴ� ����
 * ���� ��ư�� Ŭ���ϸ� Ž��â �߰� Ư���� ���丮�� ��������� �����Ҽ� �ִ�.
 * --> FileDialog Ŭ���� �̿�!!
 * ::
 * GUI + EventHandler + FileStream
 */
public class ChattingService {
	//1.gui�ۼ�
	Frame f;
	Panel p;
	TextField tf;
	TextArea ta;
	Button save;
	String nickName;
	
	//���� ��� �߰�...
	Socket s;
	BufferedReader br1;
	PrintWriter pw;
	
	ChattingService(String nickName){ //��ü ������ �г��� �־��ش�.
		this.nickName = nickName;
		f = new Frame("Chatting Room");
		tf = new TextField(30);
		ta = new TextArea();
		save = new Button("����");
		p = new Panel();		
	}
	
	public void launchFrame() throws Exception{
		f.setSize(300, 200);
		p.add(tf);
		p.add(save);
		f.add(ta,"Center");
		f.add(p,"South");
		
		f.setResizable(false);
		ta.setEditable(false);		
		ta.setText("["+nickName+"] ���� �����ϼ̽��ϴ�\n");		
		f.setVisible(true);
		
		tf.requestFocus(); //�ݵ�� f.setVisible() �ؿ� ������Ѿ� �Ѵ�.
		
		//������� ����...
		s = new Socket("127.0.0.1", 60000);
		System.out.println("Client Socket....");
		
		br1 = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(s.getOutputStream(), true);
		
		//2.Listener ����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		tf.addActionListener(new EventHandler(this));
		save.addActionListener(new ButtonHandler(this));		
	}
	
	//�߰�
	public void threadGo(){
		ClientThread ct = new ClientThread(s,this);
		ct.start();
	}
	public static void main(String[] args)throws Exception {
		ChattingService service = new ChattingService("�Ϲٸ�");
		System.out.println("Client Process Ready.....");
		service.launchFrame();
	}
}

class ClientThread extends Thread{
	Socket s;
	ChattingService service;
	BufferedReader br2;
	String line;
	
	ClientThread(Socket s, ChattingService service){
		this.s = s;
		this.service = service;
	}
	public void run(){
		try{
			br2  =  new BufferedReader(new InputStreamReader(s.getInputStream()));
			while(true){
				line = br2.readLine();
				service.ta.append(line+"\n");
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
}
























