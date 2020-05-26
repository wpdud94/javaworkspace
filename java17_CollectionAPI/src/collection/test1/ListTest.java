package collection.test1;

import java.util.ArrayList;
import java.util.List;

/*
 * List에 데이터가 저장되는 특징
 * 1) 중복허용
 * 2) 순서도 있다
 * ArrayList
 */
public class ListTest {
	public static void main(String[] args) {
		List<String> list =new ArrayList<>(); // util에 있는 인터페이스를 써야 함, Polymorphism
		list.add("강호동");
		list.add("이수근");
		list.add("규현");
		list.add("피오");
		list.add("이수근");
		
		System.out.println(list);//Collection은 자동으로 오버라이딩이 되어 있어 데이터가 바로 출력됨.
		/*
		 * 정보 출력 형식 알기
		 * 꺽쇠형태로
		 * 1) 순서로 나오는지 알기
		 * 2) 중복이 되는지 알기
		 * 
		 * 정렬과 순서
		 * 정렬 : Tree
		 * 순서 : Order ==> 넣은 대로 나온다
		 */

	}

}
