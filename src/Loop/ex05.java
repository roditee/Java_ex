package Loop;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int game_iter = 5;
		int x, y, ans, myAns;
		int score = 0;
		
//		구구단게임 - for
//		for (int i=1; i<=game_iter; i++) {
//			System.out.print("첫번째 숫자 입력: ");
//			x = scan.nextInt();
//			
//			System.out.print("두번째 숫자 입력: ");
//			y = scan.nextInt();
//			
//			ans = x * y;
//			
//			System.out.printf("%d * %d = ?\n", x, y);
//			System.out.print("정답입력: ");
//			myAns = scan.nextInt();
//			
//			if( ans == myAns ) {
//				System.out.println("정답!");
//				score+=20;
//				}
//			else { System.out.println("땡!!!!!");}
//		}
//		System.out.printf("점수 : %d", score);
		
		
//		구구단게임 - whlie
		while (game_iter>0) {
			System.out.print("첫번째 숫자 입력: ");
			x = scan.nextInt();
			
			System.out.print("두번째 숫자 입력: ");
			y = scan.nextInt();
			
			ans = x * y;
			
			System.out.printf("%d * %d = ?\n", x, y);
			System.out.print("정답입력: ");
			myAns = scan.nextInt();
			
			if( ans == myAns ) {
				System.out.println("정답!");
				score+=20;
				}
			else { System.out.println("땡!!!!!");}
			game_iter--;
		}
		System.out.printf("점수 : %d", score);
		
		scan.close();
	}

}
