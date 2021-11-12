package Str;

import java.util.Arrays;

public class exStr02 {

	public static void main(String[] args) {
		String str = "11/100/89"; //split()
		
		//문제1 arr 배열에 각 점수를 저장하고 총점 출력
		int total = 0;
		int[] arr = new int[3];
//		System.out.println(Arrays.toString(str.split("/"))); //문자열 배열
		String[] strs = str.split("/");
		
		for (int i=0; i<strs.length; i++) {
//			System.out.println(strs[i]);
			arr[i] = Integer.parseInt(strs[i]);
//			System.out.println(arr[i]);
			total += arr[i];
		}
		System.out.println("총점 : " + total);
		
		
		//문제2 scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결 join (배열을 하나의 문자열로 변환)
		int[] scores = {11, 100, 89};
		String text = "";
		
		//문자열 타입으로 변환
		String[] strScores = new String[scores.length];
		for (int i=0; i<scores.length; i++) {
			strScores[i] = Integer.toString(scores[i]);
		}
		
		System.out.println(String.join("/", strScores));
	}

}
