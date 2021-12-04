package Str;

import java.util.Scanner;

public class exStr06 {

	public static void main(String[] args) {
		//문자열 속 숫자 검사
		
		Scanner s = new Scanner(System.in);
		char ch;
		int cnt = 0;
		
		System.out.println("입력");
		String text = s.next();
		for (int i=0; i<text.length(); i++) {
			ch = text.charAt(i);
			if (48<=ch && ch<=57) cnt++;
		}
		if (cnt == 0) System.out.println("문자만 있습니다.");
		else if (cnt == text.length()) System.out.println("숫자만 있습니다.");
		else System.out.println("문자와 숫자가 섞여있습니다.");
		
		s.close();
	}

}
