package collection.test1;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties p =System.getProperties();   //static만, 객체 생성이 없은 채로 바로 진행하니
		//properties 객체를 모두 가져와 p에 넣었다.
		
		Enumeration en= p.propertyNames(); //key만 받아서 Enumeration에 가져옴. KeySet도 많이 씀.
		while(en.hasMoreElements()){ // 각각의 키가 해당 키가 맞는지 T/F로 뽑아내는 로직
			String name = (String)en.nextElement(); //해당 키를 뽑아내기
			String value = p.getProperty(name); //키에 해당하는 value 뽑기
			System.out.println((name+"==============="+value)); //Properties 저장 구조를 확인할 수 있음
		}
		
		
		
	}

}
