package exam.test;
//싱글톤 패턴
/*1. 객체 하나 무조건 만들기
 * 2. 외부에서 생성자를 쓸 수 없도록 생성자에 private을 붙여버리기
 * 3. 만들어 놓은 것을 외부에서 쓸 수 있도록 static으로 getInstance 만들기
 * 
 */
class Factory{
	private static Factory factory = new Factory();
	private Factory() {
		System.out.println("Car Factory.... Creating ...");
	}
	public static Factory getInstance() { // 꼭 static붙이기
		return factory;
	}
}


public class StaticExamTest5 {	
	public static void main(String[] args) {
		//Factory f = new Factory(){};
		Factory factory1 = Factory.getInstance();
		Factory factory2 = Factory.getInstance();
		Factory factory3 = Factory.getInstance();
	}
}
