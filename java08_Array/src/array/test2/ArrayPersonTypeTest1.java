package array.test2;

import java.util.Scanner;

//배열 중 최빈값 구하기

public class ArrayPersonTypeTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 배열의 사이즈
		
		int[] people = new int[num]; // 사이즈 6인 배열 만듦
		
		//1. 배열 초기화 끝
		for(int i=0; i<people.length; i++) {
			people[i] = sc.nextInt();
		}
		
		int[] types = new int[5];
		for(int i=0; i<people.length; i++) {
			switch(people[i]) {
			case 1: //1타입
				types[0]++;
				break;
			case 2: //2타입
				types[1]++;
				break;
			case 3:
				types[2]++;
				break;
			case 4:
				types[3]++;
				break;
			case 5:
				types[4]++;
				break;
			// 1 0 1 3 1 형태로 들어감
			}
		}
		
		int max = 0;
		for(int i=0;i<types.length;i++) {
			if(max<types[i]) max = types[i];
		}
		
		int answer = 0;
		for(int i=0;i<types.length;i++) {
			if(max==types[i]) answer = i+1 ;
		}
		
		System.out.println("정답 :: "+answer);
		

	}

}

/*
 * 6
 * 1 4 4 4 5 3
*/
