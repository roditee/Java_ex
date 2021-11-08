import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int me = s.nextInt();
		int com = 1;
		
		if (com>me) System.out.println("내가 졌다.");
		else if (com<me) System.out.println("내가 이겼다.");
		else System.out.println("비겼다.");

	}

}
