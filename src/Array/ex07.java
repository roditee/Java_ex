package Array;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		while(true) {
			for(int i = 0; i < game.length; i++) {
				if (game[i] == 2) {
					System.out.print("��");
				} else {
					System.out.print("_");
				}
			}
			System.out.println();
			System.out.print("����[1], ������[2]: ");
			int mov = sc.nextInt();
			
			if( mov == 1) {
				// �����̵�
				// ���� game �迭���� ĳ������ ��ġ�� Ȯ��
				for( int i = 0; i < game.length; i++ ) {
					if (game[i] == 2) {
						// �迭�� ���� ���� ������ �Դٸ�, �� �̻� �̵� �Ұ�
						if (i == 0) { continue; }
						
						// ĳ������ ���� ���� �迭�� �־��ݴϴ�
//						game[i-1] = game[i];
//						game[i] = 0;
						int tmp = game[i-1];
						game[i-1] = game[i];
						game[i] = tmp;
					}
				}
//				for( int i = 0; i < game.length; i++ ) {
//					System.out.printf("%d, ", game[i]);
//				}
				
			} else if( mov == 2 ) {
				// ������ �̵�
				for( int i = 0; i < game.length; i++ ) {
					if( game[i] == 2 ) {
						if( i == game.length - 1 ) { continue; }
						game[i+1] = game[i];
						game[i] = 0;
						break;
					}
				}
				
			}
			System.out.println();
			
			sc.close();
		}
	}
}
