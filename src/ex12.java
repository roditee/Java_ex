import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int account = 1234;
		int myMoney = 10000;
		int yourMoney = 12000;
		
		System.out.print("���¹�ȣ�� �Է��ϼ���: ");
		int inputAccount = scan.nextInt();
		
		if(inputAccount == account) {
			System.out.print("��ü �ݾ��� �Է��ϼ���: ");
			int amount = scan.nextInt();
			if (amount <= myMoney) {
				myMoney-=amount;
				yourMoney+=amount;
				System.out.printf("%d�� ��ü�� �Ϸ�Ǿ����ϴ�. ���� �ܾ� %d��", amount, myMoney);
			}
			else {System.out.println("�ܾ� �������� ��ü�� �Ұ����մϴ�.");}
		}
		else {System.out.print("���¹�ȣ�� ��ġ���� �ʽ��ϴ�.");}
		
		scan.close();
	}

}