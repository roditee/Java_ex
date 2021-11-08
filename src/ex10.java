import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		int a, b, c, max;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		a = scan.nextInt();
		System.out.print("정수2 입력 : ");
		b = scan.nextInt();
		System.out.print("정수3 입력 : ");
		c = scan.nextInt();
		
		if (a>b) {
			max = a;
			if (a<c) max = c;
			}
		else {
			max = b;
			if (b<c) max = c;
		}
//		max = -1;
//		if (max < x) {max = x;}
//		if (max < y) {max = y;}
//		if (max < z) {max = z;}
//		이렇게도 가능
		System.out.print(max);
	}
}