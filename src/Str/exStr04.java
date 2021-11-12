package Str;

import java.util.Arrays;

public class exStr04 {

	public static void main(String[] args) {
		//문제) 이름과 성적을 하나의 문자열로 연결
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = "";
		
		String[] student = new String[name.length];
		for (int i=0; i<name.length; i++) {
			student[i] = String.join("/", name[i], Integer.toString(score[i]));
		}
		str = String.join(",", student);
		System.out.println(str);
		
		//포매팅 사용
		str = "";
		for (int i=0; i<name.length; i++) {
			String subStr = String.format("%s/%s", name[i], score[i]);
			if (i != name.length - 1) str += subStr + ",";
			else str += subStr;
		}
		System.out.println(str);
	}
}
