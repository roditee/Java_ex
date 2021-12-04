package multidimentionalArray;

import java.util.Scanner;

public class exMA02 {
//����2439
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[][] star = new String[n][n];
		
		//�迭 �ʱ�ȭ
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				star[i][j] = " ";
			}
		}
		
		for (int i=n-1; i>=0; i--) {
			for (int j=n-1; j>=n-1-i; j--) {
				star[i][j] = "*";
			}
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(String.join("", star[i]));
		}
		
		sc.close();
	}

}
