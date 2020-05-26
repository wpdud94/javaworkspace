package collection.test2;

import java.util.ArrayList;

public class PersonListTest {

	public static void main(String[] args) {
		//List 안에 여러 명의 Person들을 저장
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("이순신", "여의도", 67));
		list.add(new Person("강감찬", "순천", 45));
		list.add(new Person("을지문덕", "구미", 27));
		list.add(new Person("이순신1", "여의도", 67));
		list.add(new Person("강감찬1", "순천", 45));
		list.add(new Person("을지문덕1", "여의도", 27));
		
		System.out.println(list);
		
		//1. 두 번째 장군을 찾아서 정보를 출력
		System.out.println(list.get(1));
		//2. 리스트에 들어있는 장군들의 숫자 출력
		System.out.println(list.size());
		//3. 리스트에 저장된 장군들의 평균 연령 출력
		int total = 0;
		for(int i = 0; i<list.size();i++) {
			total += list.get(i).getAge();
		}
		int Avgage = total/list.size();
		System.out.println(Avgage);
		
		//4. 저장된 장군들의 이름만 출력
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
		//5. 여의도 사는 장군 출력
		for(Person p : list) {
			if(p.getAddr().equals("여의도")) System.out.println(p);
		}

	}

}
