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
		System.out.printf("���� : %d, ��� : %.2f �Դϴ�.\n", sum, (float)(sum / 10));
		System.out.printf("�հ��� ���� %d�� �Դϴ�.\n", cnt);
		System.out.printf("%d��° �л��� %d������ 1���Դϴ�.\n", max_num, max_score);
	}
}