import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		int a, b, c, max;
		Scanner scan = new Scanner(System.in);
		System.out.print("����1 �Է� : ");
		a = scan.nextInt();
		System.out.print("����2 �Է� : ");
		b = scan.nextInt();
		System.out.print("����3 �Է� : ");
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
//		�̷��Ե� ����
		System.out.print(max);
	}
}