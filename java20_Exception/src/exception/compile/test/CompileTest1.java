package exception.compile.test;
//try~catch 처리법
import java.io.FileNotFoundException;
import java.io.FileReader;

class fileReading{
	public void readFile(String fileName) {
		try {
		FileReader fileReader = new FileReader(fileName);//현 에러가 컴파일 exception
		System.out.println("FileReader Creating....");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
public class CompileTest1 {
	public static void main(String[] args) {
		fileReading fr = new fileReading();
		//readFile 호출
		String path ="c:\\kjy\\poem.txt";
		fr.readFile(path);
		System.out.println("readFile calling....");
	}

}
