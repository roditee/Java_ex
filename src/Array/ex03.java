package Array;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = {87, 11, 45, 98, 23};
		
		//1��
		System.out.print("�ε��� �Է� : ");
		int n = s.nextInt();
		System.out.println("���� : " + arr[n]);
		
		//2��
		System.out.print("���� �Է� : ");
		int v = s.nextInt();
		for (int i=0; i<arr.length; i++) {
			if (v == arr[i]) System.out.print("�ε��� : " + i);
		}
		
		//3��
		int[] H = {1001, 1002, 1003, 1004, 1005};
		int[] score = {87, 11, 45, 98, 23};
		int i;
		
		System.out.print("�й� �Է� : ");
		int h = s.nextInt();
		for (i=0; i<H.length; i++) {
			if (H[i] == h) System.out.println(score[i]);
		}
	}
}
