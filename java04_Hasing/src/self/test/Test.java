package self.test;

import self.MyDate;
import self.NoteBook;
import self.Programmer;

public class Test {

	public static void main(String[] args) {
		Programmer pro = new Programmer("James", 3000, "Java", new MyDate(1995, 06, 01));
		System.out.println("==========Programmer Information============");
		System.out.println(pro.getProgrammer()); //클래스 간 지정 시 주소값만 출력한다. 그렇기 때문에 주소값이 가리키는 클래스의 필드를 출력해야 하므로 위와 같이 하다.
		
		System.out.println(pro.getName()+" 님이 구매한 NoteBook Information===========");
		
		pro.buyNoteBook(new NoteBook("Samsung", 1500000)); // 구매
		
		NoteBook JamesNoteBook=pro.getNoteBook(); // 작동 
		System.out.println(JamesNoteBook.getNoteBook());

	}

}
