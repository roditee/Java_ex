import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	    int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int menu_num, money, charge;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.���� ���� : " + price2 + "��");
		System.out.println("3.�� �� : " + price3 + "��");
		
		System.out.print("�ֹ��ϰ���� �޴� ��ȣ�� �Է��ϼ���: ");
		menu_num = scan.nextInt();
		System.out.print("������ �ִ� ���� �ݾ��� �Է��ϼ���: ");
		money = scan.nextInt();
		
		if (menu_num==1) charge = money - price1;
		else if (menu_num==2) charge = money - price2;
		else charge = money - price3;
		
		if (charge>=0) System.out.printf("%d�� �޴� �ֹ�. �ܵ��� %d�� �Դϴ�.", menu_num, charge);
		else System.out.print("������ �����մϴ�.");
	}

}
