package Str;

import java.util.Arrays;

public class exStr05 {

	public static void main(String[] args) {
		//���� ���ڿ��� ���� ����
		String str = "DBCA";
		char[] strArr = str.toCharArray();
		Arrays.sort(strArr);
		System.out.println(strArr);
		
		//���������� ����
		String[] names = {"ȫ�浿", "������", "������", "�ڹ�ŷ", "������"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}
}
