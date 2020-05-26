/*package test;

 * Field V와 Local V의 차이점  
 * 1. 선언된 위치에 따라서 나뉜다. => Field V는 클래스 바로 밑, 메소드 바깥 | Local V는 메소드 안
 * 2. 기본값 여부 : F(여) vs L(부, 반드시 초기화(값할당)하고 사용해야 함)
 * 3. 메모리 내 위치 : F(Heap) vs L(Stack)
 * 4. 별칭 : F(Member V, 인스턴스 변수, 갹체변수) vs L(지역변수, Temporary V, Automatically V)
 * 
 *  
 

public class OperatorAppTest1 {

	public static void main(String[] args) {
		//Locak Variable 선언
		int i=5;
		int j=3;
		
		Operator o1 = new Operator();
		Operator o2 = new Operator(); // 다른 개체, 다른 주소값
		
		o1=o2; //= "할당" 주소값이 o2로 동일해진다(컴퓨터는 뒤에서 읽기 때문)
		
		System.out.println("o1주소값 : "+01);
		System.out.println("o1주소값 : "+02);
		System.out.println(o1==o2); // == "equal"
		
		System.out.println("연사자% :"+i%j); //% "나머지"
		// ! "not",
		boolean flag = false;
		System.out.println(!flag); // true
		
		int k = 10;
		System.out.println(k++); //나중에 1씩 증가 10
		System.out.println(k); //여기서부터 증가 11
		
		int m = 10;
		System.out.println(++m);//먼저 1씩 증가 11
		System.out.println(m);//11
		// - 도 마찬가지
		
		// short circuit " | || 차이가 없음 || &&을 쓰면
		// 성능 good. or : 앞에서 t 하나만 나오면 무조건 t. and : f 하나 나오면 무조건 f 뒤값에 상관없이 뒤 연산 실행조차 아 함
		// 정확도 : 뒤에 복잡한 연산 시 예외가 있을 수 있기에 그냥~
		System.out.println(o1.test1() || o2.test2()); // || "or"  t or f = t
		System.out.println(o1.test1() && o1.test2());

	

} //

class Operator{//클래스 연달아 달아서 쓸 경우 클래스 앞에 public 붙이지 않는다.
				// public은 main method가 있는 클래식에 붙인다.
				// 이름 저장도 public이 붙은 클래스로
	public boolean test1() {
		System.out.println("test1() call.....");
		return true;
	}
		
	public boolean test2() {
		System.out.println("test2() call.....");
		return true;
	}
}
*/