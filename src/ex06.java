import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요: ");
		int score = scan.nextInt();
		
		if (score>=60 && score<=100) System.out.print("합격입니다.");
		else if (score<=60 && score>=0) System.out.print("불합격입니다.");
		else System.out.print("성적을 잘못 입력했습니다.");
	}
}
