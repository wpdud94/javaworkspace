package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTest4 {
	public static void main(String[] args) {
		String path="c:\\kjy\\poem.txt";
		FileReader fr = null;
		try{
			System.out.println("1. FileReader 클래스 생성....");
			fr = new FileReader(path); //수도꼭지를 연다. ==> FileReader라는 관으로 데이터라는 자원을 읽는다.
		
		
		System.out.println("2. 파일의 내용을 읽어들입니다....");
		fr.read();
		//수도꼭지를 잠근다... close()
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			fr.close(); //try이랑 다른 블록이므로 위에서 미리 선언해야 쓸 수 있다.
			}catch(IOException e) {}
		}
	}

}
