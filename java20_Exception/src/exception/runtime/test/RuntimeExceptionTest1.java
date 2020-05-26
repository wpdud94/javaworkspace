package exception.runtime.test;
/*
 * 예외 발생 안 하면 ... try
 * 예외 발생 하고 발생한 예외로 객체를 잘 잡으면 ... catch 
 */
public class RuntimeExceptionTest1 {
	public static void main(String[] args) {
		String[] str = {
			"Hello Java",
			"No I mean it",
			"Nice to meet you"
		};
		/*
		 * 위에서 버그가 발생하는데 i가 3을 만났을 때 버그가 나옴
		 * 전체가 돌아가지만 정상적인 종료가 되지 않음(비정상적인 종료)
		 * Block으로 버그를 이해하지 말고 버그로 이해하기. 12번째 줄
		 * ArrayIndexOutOfBoundsException라는 객체가 발생.
		 * 위의 객체의 부모는 Exception. Exception이라는 부모 객체로 크게 잡을 수 있음. 
		 * 하지만 배우고 경험이 쌓이면 어떻게 해야할지 자동으로 알게 됨.
		 * 
		 * Runtime계열은 명시적으로 수정할 필요없다. 코들만 수정하면 됨.
		 * 
		 * 근데 배우는 중이니 명시적으로 처리해보자.
		 * 예외가 발생 안 하면 try를 실행
		 * 예외가 발생하면 catch를 실행. 이때 터진 사건으로 객체를 잘 잡으면 수행
		 */
		
		int i=0;
		while(i<=3) { 
			try{
				System.out.println(str[i]); //0,1,2, --> try
			}catch(ArrayIndexOutOfBoundsException e) {//3-->catch. 
				System.out.println("Nice Catch!!");
			}
			i++;
		}
		
		
		
		
	}

}
