package Loop;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int game_iter = 5;
		int x, y, ans, myAns;
		int score = 0;
		
//		�����ܰ��� - for
//		for (int i=1; i<=game_iter; i++) {
//			System.out.print("ù��° ���� �Է�: ");
//			x = scan.nextInt();
//			
//			System.out.print("�ι�° ���� �Է�: ");
//			y = scan.nextInt();
//			
//			ans = x * y;
//			
//			System.out.printf("%d * %d = ?\n", x, y);
//			System.out.print("�����Է�: ");
//			myAns = scan.nextInt();
//			
//			if( ans == myAns ) {
//				System.out.println("����!");
//				score+=20;
//				}
//			else { System.out.println("��!!!!!");}
//		}
//		System.out.printf("���� : %d", score);
		
		
//		�����ܰ��� - whlie
		while (game_iter>0) {
			System.out.print("ù��° ���� �Է�: ");
			x = scan.nextInt();
			
			System.out.print("�ι�° ���� �Է�: ");
			y = scan.nextInt();
			
			ans = x * y;
			
			System.out.printf("%d * %d = ?\n", x, y);
			System.out.print("�����Է�: ");
			myAns = scan.nextInt();
			
			if( ans == myAns ) {
				System.out.println("����!");
				score+=20;
				}
			else { System.out.println("��!!!!!");}
			game_iter--;
		}
		System.out.printf("���� : %d", score);
		
		scan.close();
	}

}
