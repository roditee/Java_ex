package Str;

import java.util.Arrays;

public class exStr03 {

	public static void main(String[] args) {
		//����) �̸��� name �迭��, ������ score �迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
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
