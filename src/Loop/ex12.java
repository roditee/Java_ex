package Loop;

import java.util.Random;
import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		int i, score;
		int max_num = 0;
		int max_score = -1;
		Random rand = new Random();
		
		for (i=1; i<=10; i++) {
			score = rand.nextInt(100) + 1;
			sum += score;
			if(score>=60) { cnt++; }
			
			if(score>=max_score) {
				max_score = score;
				max_num = i;
			}
		}
		System.out.printf("총점 : %d, 평균 : %.2f 입니다.\n", sum, (float)(sum / 10));
		System.out.printf("합격자 수는 %d명 입니다.\n", cnt);
		System.out.printf("%d번째 학생이 %d점으로 1등입니다.\n", max_num, max_score);
	}
}