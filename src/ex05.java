import java.util.Scanner;
public class ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x, y, ans, myAns;
		System.out.print("첫번째 숫자 입력: ");
		x = scan.nextInt();
		
		System.out.print("두번째 숫자 입력: ");
		y = scan.nextInt();
		
		ans = x * y;
		
		System.out.printf("%d * %d = ?\n", x, y);
		System.out.print("정답입력: ");
		myAns = scan.nextInt();
		
		if( ans == myAns ) { System.out.println("정답!");}
		else { System.out.println("땡!!!!!");}
	}
}