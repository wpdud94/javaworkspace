package chatting.gui.client;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ButtonHandler implements ActionListener {
	
	ChattingService service;
	ButtonHandler(ChattingService service){
		this.service = service;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//��ư Ŭ���ϸ� FileDilogâ ���� � ��ο� � ��¿� ������ ������ ���ΰ��� �Է�
		//������ ����� ���Ϸ� TextArea�� �Է³����� �� �Ѹ���.
		FileDialog fd = new FileDialog(service.f, "��������",FileDialog.SAVE);
		fd.setVisible(true);
			
		String fileName = fd.getDirectory()+fd.getFile();
		try{
			fileWriting(fileName);
		}catch(IOException ioe){}
	}
	
	public void fileWriting(String fileName) throws IOException{
		//TextArea�� �Էµ� ������ �� �޾ƿͼ�
		//������ ��ο� ����ϴ� ������ �ۼ�..
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(service.ta.getText());
		bw.newLine();
		bw.close();
	}	
}





















