package array.test2;

public class ArrayMaxAndMinTest2 {

	public static void main(String[] args) {
		int[] score = {79,88,91,44,100,55,95};
		
		//배열 중 최대, 최소값 뽑기
		int min = score[0]; //모든 수가 0이 작을 수 없기 때문에 기준을 첫 번째 값으로 최소값 초기화 ... 79 => 왜냐하면 비교를 통해 작은 수를 찾아낼 거니까
		int max = score[0];
		
		/*for(int i=0;i<score.length;i++) {
			if(score[i]<min) min = score[i];
			if(score[i]>max) max = score[i];
		}
		*/
	/*	System.out.println("최소값 : "+min);
		System.out.println("최소값 : "+max);*/
		
		//알고리즘은 위와 같이 풀지만 java에서는 아래처럼
		
		//Advanced for..... ForEach
		for(int s : score) {
			if(s<min) min = s;
			if(s>max) max = s;
		}
		
		System.out.println("최소값 : "+min);
		System.out.println("최소값 : "+max);
		
		/*
		 * 나중에 객체를 handling 함
		 * 상품의 최대 매출 품목, 연봉이 제일 높은 직원들을 뽑는 데 사용
		 * 이를 기능설계. Class와 연관하는 게 중요
		 */
		
	}

}
