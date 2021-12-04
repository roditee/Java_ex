package Loop;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int n = scan.nextInt();
		
		for (int j=1; j<=n; j++) {
			int cnt = 0; //cnt 초기화 위치 주의
			for (int i = 1; i<=j; i++) {
				if (j % i == 0) { cnt++; }
		}
		if (cnt == 2) { System.out.print(j+" "); }
		}
		
		scan.close();
	}
}
