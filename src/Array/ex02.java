package Array;

import java.util.Random;

public class ex02 {

	public static void main(String[] args) {
		Random r = new Random();
		int i;
		int sum = 0;
		int cnt = 0;
		int[] arr = new int[5];
		
		//1번 랜덤 정수 5개 저장
		for (i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
			sum += arr[i];
			System.out.print(arr[i] + " ");
			
			if (arr[i] >= 60) cnt++;
		}
		
		System.out.println();
		//2번 총점과 평균 출력
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)(sum/arr.length));
		
		//3번 성적 60점 이상이면 합격. 합격생 수 출력
		System.out.println("합격생 수 : " + cnt);
	}

}
