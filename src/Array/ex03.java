package Array;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = {87, 11, 45, 98, 23};
		
		//1번
		System.out.print("인덱스 입력 : ");
		int n = s.nextInt();
		System.out.println("성적 : " + arr[n]);
		
		//2번
		System.out.print("성적 입력 : ");
		int v = s.nextInt();
		for (int i=0; i<arr.length; i++) {
			if (v == arr[i]) System.out.print("인덱스 : " + i);
		}
		
		//3번
		int[] H = {1001, 1002, 1003, 1004, 1005};
		int[] score = {87, 11, 45, 98, 23};
		int i;
		
		System.out.print("학번 입력 : ");
		int h = s.nextInt();
		for (i=0; i<H.length; i++) {
			if (H[i] == h) System.out.println(score[i]);
		}
	}
}
