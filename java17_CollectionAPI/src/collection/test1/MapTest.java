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

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();//<>안에는 각 값의 형태, 여기서는 int(형태)가 아닌 Integer(객체)로
		
		map.put("강호동", 90); // 원래는 integer가 객체니까 new~ 로 해야하는데 알아서 호환해줌
		map.put("이수근", 100);
		map.put("피오", 90);
		map.put("규현", 85);
		
		System.out.println(map); //파이썬에서 딕셔너리처럼 나옴 {k=v,} 형식으로
		//1. 키만 반환... keySet() & 해당 key에 해당하는 value 뽑기
		Set<String> set =map.keySet(); // Key로 이루어진 set
		Iterator<String> it=set.iterator(); // set의 원소를 하나씩 뽑아내기
		while(it.hasNext()) { // element가 set에 더 있는지 확인하는 조건 ==> 더 없으면 멈춘다
			String name = it.next(); //.next() = 공백기준으로 문자를 받는다.
			System.out.println(name+": ===   "+map.get(name)); //2. 키(name)에 해당하는 value를 찾아서 출력
		}
		
		//2. 
		Collection<Integer> col = map.values(); //map 안의 value들이 저장 ==>90 100 90 85 in col
		int total = 0;
		Iterator<Integer> it2 = col.iterator();
		while(it2.hasNext()) total += it2.next();
		System.out.println("총점 : "+total);
		
		//3.
		System.out.println("평균 : "+total/map.size());
		System.out.println("최고 점수 : "+Collections.max(col));//해당 컬렉션에서 최고값 반환
		System.out.println("최고 점수 : "+Collections.min(col));
		
	}

}
