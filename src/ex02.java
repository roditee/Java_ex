import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int me = s.nextInt();
		int com = 1;
		
		if (com>me) System.out.println("���� ����.");
		else if (com<me) System.out.println("���� �̰��.");
		else System.out.println("����.");

	}

}
