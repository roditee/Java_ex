package classArray;

import java.util.Arrays;
import java.util.Random;

class Student1 {
	
	// �Ӽ�
	int hakbun;
	int score;
	
	//�й��� ������ �Է¹޴� �޼���
	void setData(int hakbun, int score) {
		this.hakbun = hakbun;
		this.score = score;
	}
	
	//�Ӽ��� ����� �� �ִ� �޼��带 �ۼ�
	void printData() {
		System.out.printf("�й� : %d ���� : %d\n", this.hakbun, this.score);
	}
}

public class exCA01 {

	public static void main(String[] args) {
		// ��ü �迭(�⺻�� Ÿ�Ը� �迭�� �� �� �ִ°��� �ƴմϴ�)
				// �л� ��ü 5���� ���� �� �ִ� �迭
				Student1 [] studentArray = new Student1[5];
				
				// �迭�� ���� ��ü�� ������� �ʽ��ϴ�.
				// ��ü�� ���� �� �ִ� �޸� ������ Ȯ��
				System.out.println(Arrays.toString(studentArray));
				
				// ù��° �л� == �迭�� 0�� �ε���
				studentArray[0] = new Student1();
				
				// �迭���� ù ��° �л��� ��ü�� ��������� �˴ϴ�. 
				System.out.println(Arrays.toString(studentArray));
				
				// ù��° �л��� �迭�� 0�� �ε����� ���ؼ� ����
				System.out.printf("�й�: %d, ����: %d\n", studentArray[0].hakbun, studentArray[0].score);
				
				// 5���� �л� ������ ���� �� �ֵ��� ��ü�� �迭�� ����� ���ô�. 
				for( int i = 1; i < studentArray.length; i++ ) {
					studentArray[i] = new Student1();
				}
				System.out.println(Arrays.toString(studentArray));
				
//				// �й��� �Է�(1001 ~ 1005)
//				int hakbun = 1001;
//				
//				for( Student1 student: studentArray) {
//					student.hakbun = hakbun;
//					hakbun++;
//				}
//				
//				// �Էµ� �й��� Ȯ��
//				for( Student1 student: studentArray) {
//					System.out.printf("�й�: %d, ����: %d\n", student.hakbun, student.score);
//				}
//				
//				// �л����� ������ �����ϰ� �����ؼ� �Է�
//				Random rand = new Random();
//				for( Student1 student: studentArray) {
//					student.score = rand.nextInt(100)+1;
//					System.out.printf("�й�: %d, ����: %d\n", student.hakbun, student.score);
//				}
				
				//������� �޼��带 ���ؼ� �й��� ���� ä������
				//�й��� 1001 ~ 1005 ���������� ����
				//������ �����ϰ� �����ؼ� ����
				Random r = new Random();
				int hakbun = 1001;
				int score;
				for (Student1 student : studentArray) {
					score = r.nextInt(100)+1;
					student.setData(hakbun, score);
					student.printData();
					hakbun++;
					
				}
	}
}
