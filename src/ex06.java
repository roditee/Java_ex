import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int score = scan.nextInt();
		
		if (score>=60 && score<=100) System.out.print("�հ��Դϴ�.");
		else if (score<=60 && score>=0) System.out.print("���հ��Դϴ�.");
		else System.out.print("������ �߸� �Է��߽��ϴ�.");
	}
}
