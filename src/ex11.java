import java.util.Random;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int coin = rand.nextInt(2);
		System.out.print("�ո��� 0, �޸��� 1�� �Է��ϼ���.");
		int answer = scan.nextInt();
		if (answer == coin) System.out.printf("���� = %d. �¾ҽ��ϴ�!", coin);
		else System.out.printf("���� = %d. ��!", coin);
		
		scan.close();
	}

}
