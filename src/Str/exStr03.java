package Str;

import java.util.Arrays;

public class exStr03 {

	public static void main(String[] args) {
		//����) �̸��� name �迭��, ������ score �迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
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
