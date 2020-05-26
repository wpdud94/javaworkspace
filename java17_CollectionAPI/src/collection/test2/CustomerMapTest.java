package collection.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CustomerMapTest {

	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<>();
		
		map.put("111", new Customer("kim", "김제동", 40));
		map.put("222", new Customer("seung", "성유리", 35));
		map.put("333", new Customer("Lee", "이경규", 55));
		
		//1. 222에 해당하는 사람의 정보 출력
		Set<String> set = map.keySet();
		Iterator<String> it =set.iterator();
		while(it.hasNext()) {
			String keynum = it.next();
			System.out.println(keynum+" =====   "+map.get(keynum));
		}
		//2. id가 kim인 사람을 찾아서 그 사람의 이름을 출력
		Set<String> set1 = map.keySet();
		Iterator<String> it1 =set1.iterator();
		while(it1.hasNext()) {
			String keynum = it1.next();
			if(map.get(keynum).getId().equals("kim")) System.out.println(map.get(keynum).getName());
		}
		//3. map에 저장된 모든 key값을 출력
			Set<String> set2 = map.keySet();
			System.out.println(set2);
		
		//4. 모든 사람 나이의 총합과 평균연령을 출력
			int total = 0;
			Set<String> set3 = map.keySet();
			Iterator<String> it3 =set3.iterator();
			while(it3.hasNext()) {
				String keynum1 = it3.next();
				total += map.get(keynum1).getAge();
			}
			System.out.println(total);
}
}