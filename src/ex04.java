import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId, dbPw;
		int myId, myPw;
		
		System.out.println("==== ȸ������ ====");
		System.out.print("������ ID �Է�: ");
		dbId = scan.nextInt();
		
		System.out.print("������ PW �Է�: ");
		dbPw = scan.nextInt();
		
		System.out.println("==== �α��� ====");
		System.out.print("ID �Է�: ");
		myId = scan.nextInt();
		
		System.out.print("PW �Է�: ");
		myPw = scan.nextInt();
		
		if( dbId == myId && dbPw == myPw ) { System.out.println("�α��� ����"); }
		else { System.out.println("�α��� ����"); }
		//���ڿ� �񱳿��� equlas ���. dbId.equals(myId)�� ��

	}
}
