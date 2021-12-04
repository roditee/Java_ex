import java.util.Random;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int coin = rand.nextInt(2);
		System.out.print("앞면은 0, 뒷면은 1을 입력하세요.");
		int answer = scan.nextInt();
		if (answer == coin) System.out.printf("정답 = %d. 맞았습니다!", coin);
		else System.out.printf("정답 = %d. 땡!", coin);
		
		scan.close();
	}

}
