package Loop;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iter = 3;
		int max=0;
		
		while(iter>0) {
			System.out.print("숫자 입력: ");
			int n = scan.nextInt();
			if (n>max) max = n;
			iter--;
		}
		System.out.print(max);
	}

}
