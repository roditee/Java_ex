package Str;

import java.util.Scanner;

public class exStr06 {

	public static void main(String[] args) {
		//���ڿ� �� ���� �˻�
		
		Scanner s = new Scanner(System.in);
		char ch;
		int cnt = 0;
		
		System.out.println("�Է�");
		String text = s.next();
		for (int i=0; i<text.length(); i++) {
			ch = text.charAt(i);
			if (48<=ch && ch<=57) cnt++;
		}
		if (cnt == 0) System.out.println("���ڸ� �ֽ��ϴ�.");
		else if (cnt == text.length()) System.out.println("���ڸ� �ֽ��ϴ�.");
		else System.out.println("���ڿ� ���ڰ� �����ֽ��ϴ�.");
		
		s.close();
	}

}
