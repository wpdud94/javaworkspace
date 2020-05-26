package collection.test1;
/*
 * Set
 * ::
 * k.w = unique
 * 중복 안 됨 // 순서 없다
 */

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("강호동");
		set.add("이수근");
		set.add("규현");
		set.add("피오");
		set.add("이수근");
		
		System.out.println(set);
		System.out.println(set.size()); // set 사이즈 확인
		boolean find = set.contains("김혜수"); //return type 중요
		System.out.println(find); //flase
		
		set.remove("규현"); // boolean으로 반환. 삭제. index 없다 => 순서없다
		System.out.println(set);
		
		set.clear();// = .removeAll
		System.out.println("비었나요? "+set.isEmpty()); //비어있는지 T/F로 반환
		System.out.println(set);
		
		

	}

}
