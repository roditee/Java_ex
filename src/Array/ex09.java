package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		int[] arr = {10, 20, 0, 0, 0};
//		int cnt = 2;
//		
//		//���� �Է¹޾� �迭�� ���Ҹ� ����
//		while(true) {
//			System.out.println("�߰��� �� �Է� : ");
//			int n = s.nextInt();
//			
//			if(cnt < arr.length) {
//				arr[cnt] = n;
//				cnt++;
//			}
//			else {
//				System.out.println("�迭 ũ�⸦ �ʰ��Ͽ� �� �̻� �Է��� �Ұ����մϴ�.");
//				break;
//			}
//			System.out.println(Arrays.toString(arr));
		
		
		
//		//���� �Է¹޾� �迭���� ���Ҹ� ����
//		int[] arr = {10, 20, 30, 40, 0};
//		int cnt = 3;
//		
//		while(true) {
//			System.out.println("������ �� �Է� : ");
//			int n = s.nextInt();
//			
//			int delIdx = 0;
//			for (int i=0; i<arr.length; i++) {
//				if (arr[i]==n) delIdx = i;
//			}
//			
//			//arr.length-1�� ���� = arr[i+1]���� �ε��� ������ �ʰ����� �ʵ��� ���ֱ� ����
//			for (int i = delIdx; i<arr.length-1; i++) arr[i] = arr[i+1];
//			
//			System.out.println(Arrays.toString(arr));
//				}
		
		
		//���� �Է¹޾� �迭�� ���Ҹ� ����(insert) - Ǯ����!!!
		int[] arr = {10, 20, 30, 40, 0};
		int cnt = 0;
		
		System.out.println("������ �� �Է� : ");
		int val = s.nextInt();
		System.out.println("������ ��ġ �Է� : ");
		int idx = s.nextInt();
		
		for (int i=arr.length-1; i>idx; i--) {
			arr[i] = arr[i-1];
		}
		arr[idx] = val;
		System.out.println(Arrays.toString(arr));
		
		s.close();
	}
}