package classArray;

import java.util.Arrays;
import java.util.Random;

class Student1re {
	//�Ӽ�
	int id;
	int score;
	
	//�й��� ������ �Է¹޴� �޼���
	void setData(int id, int score) {
		this.id = id;
		this.score = score;
	}
	
	//�Ӽ��� ����� �� �ִ� �޼��� �ۼ�
	void printInfo() {
		System.out.printf("�й� : %d, ���� : %d\n", this.id, this.score);
	}
}

public class exCA01re {

	public static void main(String[] args) {
		// ��ü �迭(�⺻�� Ÿ�Ը� �迭�� �� �� �ִ°��� �ƴմϴ�)
		// �л� ��ü 5���� ���� �� �ִ� �迭
		Student1re[] studentArr = new Student1re[5];
		
		// �迭�� ���� ��ü�� ������� �ʽ��ϴ�.
		// ��ü�� ���� �� �ִ� �޸� ������ Ȯ���� ����.
		System.out.println(Arrays.toString(studentArr));
		
		// ù��° �л� == �迭�� 0�� �ε���
		studentArr[0] = new Student1re();
		
		// �迭���� ù ��° �л��� ��ü�� ��������� �˴ϴ�. 
		System.out.println(Arrays.toString(studentArr));
		
		// ù��° �л��� �迭�� 0�� �ε����� ���ؼ� ����
		System.out.printf("�й�: %d, ����: %d\n", studentArr[0].id, studentArr[0].score);
		
		// 5���� �л� ������ ���� �� �ֵ��� ��ü�� �迭�� ����� ���ô�. 
		for (int i=0; i<studentArr.length; i++) {
			studentArr[i] = new Student1re();
		}
		System.out.println(Arrays.toString(studentArr));
		
		// �й��� �Է�(1001 ~ 1005)
		int id = 1001;
		for (Student1re student : studentArr) {
			student.id = id;
			id++;
		}
		
		// �Էµ� �й��� Ȯ��
		for (Student1re student : studentArr) {
			System.out.printf("�й�: %d, ����: %d\n", student.id, student.score);
		}
		
		// �л����� ������ �����ϰ� �����ؼ� �Է�
		Random rand = new Random();
		for (Student1re student : studentArr) {
			student.score = rand.nextInt(100)+1;
			System.out.printf("�й�: %d, ����: %d\n", student.id, student.score);
		}
		
		//������� �޼��带 ���ؼ� �й��� ���� ä������
		//�й��� 1001 ~ 1005 ���� ����
		//���� ���� ����
		Random r = new Random();
		id = 1001;
		int score;
		
		Student1re[] studentArr2 = new Student1re[5];
		for (int i=0; i<studentArr2.length; i++) {
			studentArr2[i] = new Student1re();
			score = r.nextInt(100)+1;
			studentArr2[i].setData(id, score);
			studentArr2[i].printInfo();
			id++;
		}
		//for each ���
		id = 1001;
		Student1re[] studentArr3 = new Student1re[5];
		for (Student1re student : studentArr3) {
			student = new Student1re();
			score = r.nextInt(100)+1;
			student.setData(id, score);
			student.printInfo();
			id++;
		}
	}

}
