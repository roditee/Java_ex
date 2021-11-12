package Str;

import java.util.Arrays;

public class exStr05 {

	public static void main(String[] args) {
		//단일 문자열에 대한 정렬
		String str = "DBCA";
		char[] strArr = str.toCharArray();
		Arrays.sort(strArr);
		System.out.println(strArr);
		
		//사전순으로 정렬
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}
}
