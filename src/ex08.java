import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbid = 1111;
		int dbpw = 1234;
		
		System.out.print("ID�� �Է��ϼ���: ");
		int id = scan.nextInt();
		
		if (id == dbid) {
			System.out.print("PW�� �Է��ϼ���: ");
			int pw = scan.nextInt();
			if (pw == dbpw) {
				System.out.print("�α��� ����");
			}
			else System.out.print("PW�� Ȯ�����ּ���");
		}
		else System.out.print("ID�� Ȯ�����ּ���");
	}

}
