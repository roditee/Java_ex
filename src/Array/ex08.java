package Array;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] game = new int[9];
		
		int win = 0;
		int turn = 0;
		
		while(true) {
			System.out.println("=== ∆Ω≈√≈‰ ===");
			for (int i=0; i<game.length; i++) {
				if (game[i] == 0) System.out.print("[ ]");
				else if (game[i] == 1) System.out.print("[O]");
				else System.out.print("[X]");
				
				if (i%3 == 2) System.out.println();
			}
			
			if (win == 1) {
				System.out.println("P1 Ω¬∏Æ");
				break;
			}
			else if (win == 2) {
				System.out.println("P2 Ω¬∏Æ");
				break;
			}
			else if(win==0) {
				boolean flag = true;
				for (int i = 0; i<game.length; i++) {
					if (game[i] == 0) flag = false;
				}
				if (flag) {
					System.out.println("π´Ω¬∫Œ");
					break;
				}
			}
			
			if (turn%2 == 0) {
			System.out.print("[P1] ¿Œµ¶Ω∫ ¿‘∑¬ : ");
			int idx = s.nextInt();
			idx--;
			if (game[idx] == 0) {
				game[idx] = 1;
				turn++;
			}
			}
			else if (turn%2 != 0) {
				System.out.println("[P2] ¿Œµ¶Ω∫ ¿‘∑¬ : ");
				int idx = s.nextInt();
				idx--;
				if (game[idx] == 0) {
					game[idx] = 2;
					turn++;
				}
			}
			
			//Ω¬∏Æ ∞ÀªÁ ∞°∑Œ
			for (int i=0; i<game.length; i+=3) {
				if (game[i] == 1 && game[i+1] == 1 && game[i+2] == 1) win= 1;
				if (game[i] == 2 && game[i+1] == 2 && game[i+2] == 2) win= 2;
			}
			//Ω¬∏Æ ∞ÀªÁ ºº∑Œ
			for (int i=0; i<3; i++) {
				if (game[i] == 1 && game[i+3] == 1 && game[i+6] == 1) win= 1;
				if (game[i] == 2 && game[i+3] == 2 && game[i+6] == 2) win= 2;
			}
			//Ω¬∏Æ ∞ÀªÁ ¥Î∞¢º±
			if (game[0] == 1 && game[4] == 1 && game[8] == 1) win= 1;
			if (game[0] == 2 && game[4] == 2 && game[8] == 2) win= 2;
			if (game[2] == 1 && game[4] == 1 && game[6] == 1) win= 1;
			if (game[2] == 2 && game[4] == 2 && game[6] == 2) win= 2;
		} //whlie
		
		s.close();
	}
}
