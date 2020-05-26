package array.test3;

import java.util.Arrays;
import java.util.Scanner;

public class FlattenBoxTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 10;
		int boxlen = 100;
		for(int tcn = 1 ; tcn <= tc ; tcn++) {
			int dump = sc.nextInt();
			int[] boxes = new int[boxlen];
			for(int i=0 ; i < boxlen ; i++) {
				boxes[i] = sc.nextInt();
			}// 초기화 완료
			
			int heightDiff = flatten(boxes, dump);
			System.out.printf("#%d %d%n", tcn, heightDiff);
			
		}//for
	} //main

	/* 내코딩
	 * private static int flatten(int[] boxes, int dump) {
		for(int i=0;i<dump;i++) {
				Arrays.sort(boxes);
				boxes[0] += 1;
				boxes[boxes.length-1] -= 1;
		}
		return boxes[boxes.length-1]-boxes[0];
		
		
	}*/
	//강사님 코딩
	private static int flatten(int[] boxes, int dump) {
		for(int i=0; i<dump ;i++) {
			Arrays.sort(boxes);
			int diff = boxes[boxes.length-1] - boxes[0];
			if(diff<=1) {
				return diff;
			}
			boxes[0]++;
			boxes[boxes.length-1]--;
		}
		// 반드시 추가해야하는 부분 :
		Arrays.sort(boxes);
		
		return boxes[boxes.length-1]-boxes[0];
	}
}
