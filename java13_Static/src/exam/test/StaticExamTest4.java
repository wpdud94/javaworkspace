package exam.test;
//static block

public class StaticExamTest4 {
	static int i;
	
	public static void main(String[] args) {
		System.out.println("1. main method static block..."+i);
		
		//객체 생성 ... (); ---> (){//}
	}
	
	static {
		i=300;
		System.out.println("1. main method static block..."+i);
	}

}
