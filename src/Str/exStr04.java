package Str;

import java.util.Arrays;

public class exStr04 {

	public static void main(String[] args) {
		//����) �̸��� ������ �ϳ��� ���ڿ��� ����
		String[] name = {"��ö��", "�̸���", "�̿���"};
		int[] score = {87, 42, 95};
		
		String str = "";
		
		String[] student = new String[name.length];
		for (int i=0; i<name.length; i++) {
			student[i] = String.join("/", name[i], Integer.toString(score[i]));
		}
		str = String.join(",", student);
		System.out.println(str);
		
		//������ ���
		str = "";
		for (int i=0; i<name.length; i++) {
			String subStr = String.format("%s/%s", name[i], score[i]);
			if (i != name.length - 1) str += subStr + ",";
			else str += subStr;
		}
		System.out.println(str);
	}
}
