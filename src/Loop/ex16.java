package Loop;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = s.nextInt();
		
		while(true) {
			int cnt = 0; //re - cnt 위치 주의
			for (int i=1; i<=n; i++) {
				if (n%i == 0) { cnt++; }
			}
			if (cnt == 2) {
				System.out.println(n);
				break; //re - if문은 for문 다 돌고 난 후에 와야함 = for문 밖에 와야함
			}
			n++; //n++ 왜 해주지?
		}
		
		s.close();
	}
}