package array.test2;

import java.util.Random;

/*
 * 정렬
 * ::
 * 배열과 같은 자료구조에 대해서는 정렬에 대한 요구사항이 빈번하게 일어난다
 * 정렬을 구현하기 위한 알고리즘 중 가장 대표적인 버블정렬에 대해서 살펴보겠다
 * 
 * {2,5,3,9} 배열이 있다. 기본이 오름차순 --> {2,3,5,9}
 * 
 * 버블정렬
 * ::
 * 인접한 두 수를 비교해서 큰 수를 뒤로 보내는 방법
 * 2, 5 두 수를 비교 --> 정렬을 안 하다 = 2, 5를 유지
 * 5,3 두 수를 비교 --> 정렬을 한다 --> 
 * 1) temp라는 임시변수(5) 만든다
 * 2) 뒤의 수를 앞으로 가져온다 : 3, 3(5를 3으로 덮어쓰기)
 * 3) temp에서 꺼내온 5를 뒷 자리에 할당 ==> 3, 5
 * 이처럼 두 수의 자리를 바꾸는 방법을 swap이라 한다.
 * 이 방법 전체를 Bubble sorting이라 함
 * 
 * 주의점!!!
 * 
 */

public class ArrayBubbleSortingTest3 {

	public static void main(String[] args) {
		/*int[] arr = {2,3,5,9};
		int temp = 0;
		for(int j=0;j<arr.length-1;j++) { //비교는 총 3개니까
			if(arr[j]>arr[j+1]) {// 앞의 수가 뒤의 수보다 크다면
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}	
		
		System.out.println("============정렬 완료 ==============");
		for(int i : arr) {
			System.out.println(i+" ");
			
		}*/
		
		//위대로 하면 {2,3,1,5,9} 배렬은 안 됨
		Random r = new Random();
		// random class에서는 20억개 수가 있어서 바운더리 설정 필요
		int[] arr = new int[10];
		for (int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(10); // 0~9까지 난수값 추출
		}//초기화 끝
		System.out.println("====초기화 완료====");
		for(int i : arr) System.out.println(i+" ");
		
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {//outer for 부분을 한 번  더 해야 함
			for(int j=0;j<arr.length-1;j++) { //비교는 총 3개니까
				if(arr[j]>arr[j+1]) {// 앞의 수가 뒤의 수보다 크다면
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
		
		}	
	}
	}
		
		System.out.println("============정렬 완료 ==============");
		for(int i : arr) {
			System.out.println(i+" ");
		

	}

}
	
	
}
