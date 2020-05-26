package exception.compile.test;
//throws처리법
import java.io.FileNotFoundException;
import java.io.FileReader;

class fileReading2{
	fileReading2(){};
	public void readFile(String fileName) throws FileNotFoundException {
		FileReader fileReader = new FileReader(fileName);
		System.out.println("FileReader Creating....");
	}
}
public class CompileTest2 {
	public static void main(String[] args) {
		fileReading2 fr = new fileReading2();
		//readFile 호출
		String path ="c:\\kjy\\poem.txt";
		try{
			fr.readFile(path);	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("readFile calling....");
	}

}
