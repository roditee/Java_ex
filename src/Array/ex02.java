package Array;

import java.util.Random;

public class ex02 {

	public static void main(String[] args) {
		Random r = new Random();
		int i;
		int sum = 0;
		int cnt = 0;
		int[] arr = new int[5];
		
		//1�� ���� ���� 5�� ����
		for (i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
			sum += arr[i];
			System.out.print(arr[i] + " ");
			
			if (arr[i] >= 60) cnt++;
		}
		
		System.out.println();
		//2�� ������ ��� ���
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (float)(sum/arr.length));
		
		//3�� ���� 60�� �̻��̸� �հ�. �հݻ� �� ���
		System.out.println("�հݻ� �� : " + cnt);
	}

}
