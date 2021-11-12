package Str;

import java.util.Arrays;

public class exStr03 {

	public static void main(String[] args) {
		//문제) 이름은 name 배열에, 성적은 score 배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		String[] name = new String[3];
		int[] score = new int[3];
		
		String[] student = str.split(",");
		for (int i=0; i<student.length; i++) {
			String[] name1 = student[i].split("/");
			name[i] = name1[0];
			System.out.println(name1[0]);
//			score[i] = Integer.parseInt(name[0]);
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}

}
