import java.util.Scanner;
public class ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x, y, ans, myAns;
		System.out.print("ù��° ���� �Է�: ");
		x = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�: ");
		y = scan.nextInt();
		
		ans = x * y;
		
		System.out.printf("%d * %d = ?\n", x, y);
		System.out.print("�����Է�: ");
		myAns = scan.nextInt();
		
		if( ans == myAns ) { System.out.println("����!");}
		else { System.out.println("��!!!!!");}
	}
}