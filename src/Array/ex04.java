package Array;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int[] H = {1001, 1002, 1003, 1004, 1005};
		int[] score = {87, 11, 45, 98, 23};
		int i;
		
		System.out.print("�й� �Է� : ");
		int h = s.nextInt();

		for (i=0; i<H.length; i++) {
			if (H[i] == h) {
				System.out.println("���� : " + score[i] + "��");
				break;
			}
		}
		//���� �й� �Է� �� ����ó�� -> for���� ���鼭 i�� ���� �ε��� ��ȸ�ϴµ�,
		//���� ã���� �ϴ� ���� �迭 �ȿ� ���ٸ� i�� ���� �迭�� �ε��� �ִ밪�� �ʰ��� ����.
		if (i>=H.length) System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		
		
//		�Ǵ�
//		boolean flag = true;
//		if (H[i] == h) {
//			System.out.println("���� : " + score[i] + "��");
//			flag = false;
//		}
//		if( flag ) {
//			System.out.println("�ش� �й��� �������� �ʽ��ϴ�");
//		}
	}

}
