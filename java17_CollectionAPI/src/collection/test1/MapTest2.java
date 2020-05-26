package collection.test1;
/*
 * Map
 * ::
 * Key와 Value를 쌍으로 저장하는 특징을 가진다.
 */

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();//<>안에는 각 값의 형태, 여기서는 int(형태)가 아닌 Integer(객체)로
		
		map.put("강호동", 90); // 원래는 integer가 객체니까 new~ 로 해야하는데 알아서 호환해줌
		map.put("이수근", 100);
		map.put("피오", 90);
		map.put("규현", 85);
		
		System.out.println(map); //파이썬에서 딕셔너리처럼 나옴 {k=v,} 형식으로
		//1. 키만 반환... keySet() & 해당 key에 해당하는 value 뽑기
		Set<String> key = map.keySet();
		// for
		for(String name : key) {
			System.out.println((map.get(name)));
		}
	}

}
