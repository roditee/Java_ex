package Loop;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		//에라토스테네스의 체
		Scanner s = new Scanner(System.in);
		int remain = 0;
		int cnt = 0;
		
		System.out.printf("정수를 입력하세요.");
		int n = s.nextInt();
		
		for (int i=1; i<=n; i++) {
			remain = n%i;
			if (remain == 0) cnt++;
		}
		if (cnt == 2) System.out.printf("%d는 소수입니다.", n);
		else System.out.printf("%d는 소수가 아닙니다.", n);
		
		s.close();
	}
}
