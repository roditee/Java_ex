package Array;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int[] H = {1001, 1002, 1003, 1004, 1005};
		int[] score = {87, 11, 45, 98, 23};
		int i;
		
		System.out.print("학번 입력 : ");
		int h = s.nextInt();

		for (i=0; i<H.length; i++) {
			if (H[i] == h) {
				System.out.println("성적 : " + score[i] + "점");
				break;
			}
		}
		//없는 학번 입력 시 예외처리 -> for문을 돌면서 i를 통해 인덱스 순회하는데,
		//만약 찾고자 하는 값이 배열 안에 없다면 i의 값이 배열의 인덱스 최대값을 초과할 것임.
		if (i>=H.length) System.out.println("해당 학번은 존재하지 않습니다.");
		
		
//		또는
//		boolean flag = true;
//		if (H[i] == h) {
//			System.out.println("성적 : " + score[i] + "점");
//			flag = false;
//		}
//		if( flag ) {
//			System.out.println("해당 학번은 존재하지 않습니다");
//		}
	}

}
