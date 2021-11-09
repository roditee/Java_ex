package method;

import java.util.Random;
import java.util.Scanner;

class Ex03 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//���� 1)
	void setRandomValuesinArray(int [] scores) {
		for (int i=0; i<scores.length; i++) scores[i] = ran.nextInt(100)+1;
	}
	
	//���� 2)
	void printSumAndAverage (int [] scores) {
		int total = 0;
		for (int i=0; i<scores.length; i++) total += scores[i];
		//for each�� ���
//		for (int score:scores) total+=score;
		System.out.printf("����(%d) ���(%.1f)\n", total, (float)(total/scores.length));
	}
	
	//���� 3)
	void printWinner (int [] scores) {
		int cnt = 0;
		for (int i=0; i<scores.length; i++) {
			if(scores[i] >= 60) cnt++;
		}
		System.out.println(cnt + "��");
	}
	
	//���� 4)
	void printScore1 (int [] scores) {
		int idx = scan.nextInt();
		System.out.printf("�ε��� �Է� : %d ���� : %d\n", idx, scores[idx]);
	}
	
	//���� 5)
	void printScore2 (int [] scores) {
		int score = scan.nextInt();
		int idx = 0;
		for (int i=0; i<scores.length; i++) {
			if (scores[i] == score) idx = i;
		}
		System.out.printf("���� �Է� : %d �ε��� : %d\n", score, idx);
	}
	
	//���� 6)
	void printScore3(int [] hakbuns, int [] scores) {
		int hak = scan.nextInt();
		int idx = 0;
		for (int i=0; i<hakbuns.length; i++) {
			if (hakbuns[i] == hak) {
				idx = i;
				break;
			}
			if (i == hakbuns.length) System.out.println("�������� �ʴ� �й��Դϴ�.");
		}
		System.out.printf("�й� �Է� : %d ���� : %d\n", hak, scores[idx]);
	}
	
	//���� 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		int idx = 0;
		int max = -1;
		for (int i=0; i<scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
				idx = i;
			}
		}
		System.out.printf("%d��(%d��)\n", hakbuns[idx], max);
	}
	
}

public class exM03 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex03 e = new Ex03();
		
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� �����ϴ� �޼���
		// �� 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);
		
		// ����2) �������� ������ ��� ����ϴ� �޼���
		// �� 2) ����(251) ���(50.2)
		e.printSumAndAverage(scores);
		
		// ����3) ������ 60�� �̻��̸� �հ��̸� �հݻ� ���� ����ϴ� �޼���
		// �� 3) 2��
		e.printWinner(scores);
		
		// ����4) �ε����� �Է¹޾� ���� ����ϴ� �޼���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		e.printScore1(scores);

		// ����5) ������ �Է¹޾� �ε��� ����ϴ� �޼���
		// ����5) ���� �Է� : 11 �ε��� : 1
		e.printScore2(scores);

		// ����6) �й��� �Է¹޾� ���� ����ϴ� �޼��� // ��, �����й� �Է� �� ����ó��
	    // ��, �����й� �Է� �� ����ó��
		// ����6) �й� �Է� : 1003 ���� : 45��
		e.printScore3(hakbuns, scores);

		// ����7) 1���л��� �й��� ���� ����ϴ� �޼���
		// ����7) 1004��(98��)
		e.printNumberOne(hakbuns, scores);
	}

}