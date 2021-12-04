package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		int[] arr = {10, 20, 0, 0, 0};
//		int cnt = 2;
//		
//		//값을 입력받아 배열에 원소를 저장
//		while(true) {
//			System.out.println("추가할 값 입력 : ");
//			int n = s.nextInt();
//			
//			if(cnt < arr.length) {
//				arr[cnt] = n;
//				cnt++;
//			}
//			else {
//				System.out.println("배열 크기를 초과하여 더 이상 입력이 불가능합니다.");
//				break;
//			}
//			System.out.println(Arrays.toString(arr));
		
		
		
//		//값을 입력받아 배열에서 원소를 삭제
//		int[] arr = {10, 20, 30, 40, 0};
//		int cnt = 3;
//		
//		while(true) {
//			System.out.println("삭제할 값 입력 : ");
//			int n = s.nextInt();
//			
//			int delIdx = 0;
//			for (int i=0; i<arr.length; i++) {
//				if (arr[i]==n) delIdx = i;
//			}
//			
//			//arr.length-1인 이유 = arr[i+1]에서 인덱스 범위를 초과하지 않도록 해주기 위해
//			for (int i = delIdx; i<arr.length-1; i++) arr[i] = arr[i+1];
//			
//			System.out.println(Arrays.toString(arr));
//				}
		
		
		//값을 입력받아 배열에 원소를 삽입(insert) - 풀었음!!!
		int[] arr = {10, 20, 30, 40, 0};
		int cnt = 0;
		
		System.out.println("삽입할 값 입력 : ");
		int val = s.nextInt();
		System.out.println("삽입할 위치 입력 : ");
		int idx = s.nextInt();
		
		for (int i=arr.length-1; i>idx; i--) {
			arr[i] = arr[i-1];
		}
		arr[idx] = val;
		System.out.println(Arrays.toString(arr));
		
		s.close();
	}
}