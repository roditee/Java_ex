package classArray;

import java.util.Scanner;

class Subject3 {
	String name;
	int score;
}

class Student3 {
	
	String name;
	Subject3[] subjectArray;
}

public class exCA03re {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		// # �л� �߰� ���� ��Ʈ�ѷ�
		//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
		//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
		//   �̸��� : ����2�� ���� 20 ���� 30 
		//   �̿��� : ����1�� ���� 100
		
		Student3 [] stdList = new Student3[3];
		int stdCnt = 0;	// �л� ��
				
		while (true) {
			System.out.println("[1]�л� �߰��ϱ�");		// �̸� �Է¹޾� �߰�
			System.out.println("[2]���� �߰��ϱ�");		// �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3]���� �߰��ϱ�");		// �̸��� ���� �׸��� ���� �Է¹޾� �߰�
			System.out.println("[4]�����ϱ�");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				for (int i=0; i<3; i++) {
					String name = scan.nextLine();
				}
				stdCnt++;
				}
			else if (choice == 2) {}
			else if (choice == 3) { if(stdCnt == 3) System.out.println("�� �̻� �߰��� �� �����ϴ�.");}
		}//whlie
	}

}
