package inheritance.child;

import inheritance.parent.Employee;
import inheritance.util.MyDate;

/*'
 * 자식, child, sub
 */
public class Engineer extends Employee { // 상속받았다는 코드
	private String tech;
	private double bonus;
	
	
	
/*
 * 에러는 Manager 생성자에서 남
 * Manager, 자식객체 생성에서 문제
 * 자식이 생성될려면 부모가 먼저 생성 즉, 메모리에 올려야 한다.
 * 자식 객체생성 시 부모 기본생성자 기본 호출
 * 
 * 부모 지칭 : super
 * super() = employee() : 기본생성자 => test에서도 값이 안 들어감
 * 어디든, 메소드 등 다 쓸 수 있다.
 */
	public Engineer(String name, double salary, MyDate birthDate, String nameOfBoss, double bonus) {
		super(name, salary, birthDate);
		this.tech = nameOfBoss;
		this.bonus = bonus;
	}
	
	public void changeTech(String tech) {
		this.tech = tech;
	}

	public double getBonus() {
		return bonus;
	}

	public String getDetails() {
		return super.getDetails()+", "+tech+", "+bonus; // employee의 getDetails 호출
	}
}
