package Str;

import java.util.Arrays;

public class exStr02 {

	public static void main(String[] args) {
		String str = "11/100/89"; //split()
		
		//����1 arr �迭�� �� ������ �����ϰ� ���� ���
		int total = 0;
		int[] arr = new int[3];
//		System.out.println(Arrays.toString(str.split("/"))); //���ڿ� �迭
		String[] strs = str.split("/");
		
		for (int i=0; i<strs.length; i++) {
//			System.out.println(strs[i]);
			arr[i] = Integer.parseInt(strs[i]);
//			System.out.println(arr[i]);
			total += arr[i];
		}
		System.out.println("���� : " + total);
		
		
		//����2 scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ���� join (�迭�� �ϳ��� ���ڿ��� ��ȯ)
		int[] scores = {11, 100, 89};
		String text = "";
		
		//���ڿ� Ÿ������ ��ȯ
		String[] strScores = new String[scores.length];
		for (int i=0; i<scores.length; i++) {
			strScores[i] = Integer.toString(scores[i]);
		}
		
		System.out.println(String.join("/", strScores));
	}

}
