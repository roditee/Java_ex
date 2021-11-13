package Str;

import java.util.Arrays;

public class exStr03 {

	public static void main(String[] args) {
		//문제) 이름은 name 배열에, 성적은 score 배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		String[] student = new String[3];
		
		String[] studentArr = str.split(",");
		
		String[] name = new String[studentArr.length];
		int[] score = new int[studentArr.length];
		
		for (int i=0; i<studentArr.length; i++) {
			student = studentArr[i].split("/");
			name[i] = student[0];
			score[i] = Integer.parseInt(student[1]);
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}

}
