package classArray;

import java.util.Scanner;

class Subject3re {
	String name;
	int score;
}

class Student3re {
	static int stdCnt = 0;	// �л� �� = ��ü�� ��
	String name;
	Subject3re[] subjectArray;
	
	Student3re(String name) {
		this.name = name;
	}
	
	Student3re(String name, String subject) {
		int sbjNum = 0;
		this.name = name;
		this.subjectArray[sbjNum].name = subject;
		sbjNum++;
	}
}

public class exCA03re {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		// # �л� �߰� ���� ��Ʈ�ѷ�
		//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
		//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
		//   �̸��� : ����2�� ���� 20 ���� 30 
		//   �̿��� : ����1�� ���� 100
		
		Student3re [] stdList = new Student3re[3];
				
		while (true) {
			System.out.println("[1]�л� �߰��ϱ�");		// �̸� �Է¹޾� �߰�
			System.out.println("[2]���� �߰��ϱ�");		// �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3]���� �߰��ϱ�");		// �̸��� ���� �׸��� ���� �Է¹޾� �߰�
			System.out.println("[4]�����ϱ�");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				if(Student3re.stdCnt == 3) System.out.println("�� �̻� �߰��� �� �����ϴ�.");
				System.out.println("�̸� �Է�");
				String name = scan.next();
				stdList[Student3re.stdCnt] = new Student3re(name);
				System.out.printf("[�߰��Ϸ�] �̸� : %s\n", stdList[Student3re.stdCnt].name);
				Student3re.stdCnt++;
				}
			else if (choice == 2) {
				System.out.println("�̸� �Է�");
				String name = scan.next();
				System.out.println("���� �Է�");
				String subject = scan.next();
				//���� ��ü ����? -> 3�� ���鼭 3���� �л� �� �Է��� �̸��� ��ġ�ϴ� ��ü�� ���� �߰�
				for (int i=0; i<stdList.length; i++) {
//					if (stdList[i].name == name) {
//						stdList[i] = new Student3re(name, subject);
//					}
				}
			}
			else if (choice == 3) {
				System.out.println("�̸� �Է�");
				String name = scan.next();
				System.out.println("���� �Է�");
				String subject = scan.next();
				System.out.println("���� �Է�");
				String score = scan.next();
//				for (int i=0; i<stdList.length; i++) {
//					if (stdList[i].name == name && ) stdList[stdCnt] = new Student3re(name, subject);
//				}
				}
			else break;
		}//whlie
	}

}
