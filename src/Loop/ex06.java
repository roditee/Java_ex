package Loop;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 [EXIT -100] : ");
			int n = s.nextInt();
			
			if (n==-100) break;
//			if (n==-100) return; //main메서드의 종료는 프로그램의 실행 종료와 동일
//			if (n==-100) System.exit(0);; //main메서드의 종료는 프로그램의 실행 종료와 동일. exit의 매개변수 = 종료코드
		}
		
		s.close();
	}

}
