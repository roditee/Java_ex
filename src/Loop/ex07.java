package Loop;

import java.util.Random;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int com = rand.nextInt(100) + 1; // 1 ~ 100
		int score = 100;
		
		
		while (true) {
			System.out.print("���� �Է�: ");
			int me = scan.nextInt();
			
			if (me < com) { 
				System.out.println("Up!");
				score -= 5;
			}
			else if(me > com) { 
				System.out.println("Down!"); 
				score -= 5;
			}
			else { 
				System.out.println("Bingo!"); 
				break;
			}
		} // while
		System.out.printf("�� �����¿� %d�� �Դϴ�\n", score);
		
		scan.close();
	}
}