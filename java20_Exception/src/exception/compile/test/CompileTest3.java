package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

class fileReading3{
	fileReading3(){};
	public void readFile(String fileName) throws FileNotFoundException {
		FileReader fileReader = new FileReader(fileName);
		System.out.println("FileReader Creating....");
	}
}
public class CompileTest3 {
	public static void main(String[] args) throws FileNotFoundException {
		fileReading3 fr = new fileReading3();
		//readFile 호출
		String path ="c:\\kjy\\poem.txt";
		fr.readFile(path);	
		System.out.println("readFile calling....");
	}

}
