package test;

import java.util.Scanner;

public class OperationAlgoAppTest2 {
	
	static int halfDistance(int kim, int lim) {
		int cnt = 0;
		/*
		 * kim과 lim의 절반이 같지 ㅇ낳다면
		 * 절반씩 줄어드는 로직
		 * 이때마다 cnt가 1씩 증가
		 */
		while(kim/2 != lim/2) {
			kim=kim/2;
			lim=lim/2;
			cnt++;
		}
				
		return cnt; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kims = sc.nextInt()-1; // 1-2-3-4-5-6-7-8
		int lims = sc.nextInt()-1;// 1-2-3-4-5-6-7-8-9
		
		int result = halfDistance(kims,lims);
		System.out.println(result);
		
	};

}
