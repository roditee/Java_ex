import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���: ");
		int h = scan.nextInt();

		if (h>=120) { System.out.println("���̱ⱸ �̿��� �����մϴ�."); }
		else { 
			System.out.print("�θ�԰� �Բ� ���̳���? (yes==1 no==0)");
			int parent = scan.nextInt();
			if (parent == 1) {
				System.out.println("���̱ⱸ �̿��� �����մϴ�.");
			}
			else System.out.println("���̱ⱸ �̿��� �Ұ����մϴ�.");
		}
		scan.close();
	}

}
