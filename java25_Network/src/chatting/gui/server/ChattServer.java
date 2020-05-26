package chatting.gui.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//Process
import java.util.ArrayList;

public class ChattServer {
	ServerSocket server;
	Socket s;
	ArrayList<ChattThread> list;
	
	public ChattServer(){
		list = new ArrayList<>();
	}
	
	public void broadcast(String message) {
		for(ChattThread t : list) {
			t.sendMessage(message);
		}
	}
	
	public void go() {
		try {
			server = new ServerSocket(60000);
			System.out.println("Server Ready......");
			
			while(true) {//����~~
				s = server.accept();
				ChattThread ct = new ChattThread(s, this);
				list.add(ct);
				ct.start(); //run()
			}
		}catch(Exception e) {
			
		}
	}
	
	
	public static void main(String[] args) {		
		ChattServer cs = new ChattServer();
		cs.go();		
	}
}

class ChattThread extends Thread{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChattServer chattServer;
	
	ChattThread(Socket s, ChattServer chattServer){
		this.chattServer = chattServer;
		this.s = s;
		System.out.println(s.getInetAddress()+" ���� �����ϼ̽��ϴ�...");
		chattServer.broadcast(s.getInetAddress()+" ���� ä�ù濡 �����̽��ϴ�.");
	}
	public void sendMessage(String str){
		pw.println(str);
	}
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);
			
			while(true) {
				String line = br.readLine();
				chattServer.broadcast(line);
			}
		}catch(IOException e) {
			//������ ���������� �̰����� �̵��Ѵ�..
			System.out.println(s.getInetAddress()+" ���� ������ �����̽��ϴ�..");
			chattServer.broadcast(s.getInetAddress()+" ���� ä�ù��� �����̽��ϴ�..");
			chattServer.list.remove(this);
		}
	}
}











