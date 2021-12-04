package Array;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		while(true) {
			for(int i = 0; i < game.length; i++) {
				if (game[i] == 2) {
					System.out.print("옷");
				} else {
					System.out.print("_");
				}
			}
			System.out.println();
			System.out.print("왼쪽[1], 오른쪽[2]: ");
			int mov = sc.nextInt();
			
			if( mov == 1) {
				// 왼쪽이동
				// 현재 game 배열에서 캐릭터의 위치를 확인
				for( int i = 0; i < game.length; i++ ) {
					if (game[i] == 2) {
						// 배열의 가장 왼쪽 끝까지 왔다면, 더 이상 이동 불가
						if (i == 0) { continue; }
						
						// 캐릭터의 값을 왼쪽 배열로 넣어줍니다
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
				// 오른쪽 이동
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
