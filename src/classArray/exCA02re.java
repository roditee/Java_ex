package classArray;

import java.util.Arrays;
import java.util.Random;

//has-a
//���� ����
//���� 1���� ���� ���� (�����̸��� ����)
class Subject2re {
	String name;
	int score;
}

class Student2re {
	String name;
	
	//���� ���� ���� ������ �迭�� ����
	Subject2re[] subjectArray2;
	
	//������ ���� �� �����ε�
	Student2re() {}
	Student2re(String name) {
		this.name = name;
		this.subjectArray2 = new Subject2re[3];
	}
}

public class exCA02re {
	public static void main(String[] args) {
		//�л� 3���� ������ ���� �� �ִ� �迭�� ����
		Student2re[] studentArr2 = new Student2re[3];
		
		//�л� ������ ���� �� �ִ� ��ü 3���� �����ؼ� �迭�� ��ƺ���
//		for (Student2re student : studentArr2) {
//			student = new Student2re();
//			System.out.println(student);
//		}
		//for�� ���
		for (int i=0; i<studentArr2.length; i++) {
			studentArr2[i] = new Student2re();
		}
		System.out.println(Arrays.toString(studentArr2));
		
		
		//�л� ������ ���� �� �ִ� ��ü 3���� �����ؼ� �迭�� ��ƺ���
		//�л� 1��� ��ü 1
		//�������� Ȱ��
		//�л� ��ü�� ������ �� �̸��� �ʱ�ȭ
		studentArr2[0] = new Student2re("ȫ�浿");
		studentArr2[1] = new Student2re("�̼���");
		studentArr2[2] = new Student2re("�����");
		for (Student2re stu : studentArr2) {
			System.out.printf("�л� : %s\n", stu.name);
		}
		
		//���� �߰�
		//ȫ�浿 �л��� ���ؼ� ����: 50, ����: 60, ����: 90 �߰�
		//����[1] ȫ�浿 �л��� ��ü ��������
		Student2re jdg = null;;
		for (Student2re stu:studentArr2) {
			if (stu.name.equals("ȫ�浿")) {
				jdg = stu;
				break;
			}
		}
		System.out.printf("�л� : %s\n", jdg.name);
		System.out.printf("sbj arr : %s\n", Arrays.toString(jdg.subjectArray2));
		
		//������ ���� �� �ִ� ��ü ����
		for (int i=0; i<jdg.subjectArray2.length; i++) {
			jdg.subjectArray2[i] = new Subject2re();
		}
		System.out.printf("sbj arr : %s\n", Arrays.toString(jdg.subjectArray2));
		
		//���� ���� ����
		jdg.subjectArray2[0].name = "����";
		jdg.subjectArray2[0].score = 50;
		jdg.subjectArray2[1].name = "����";
		jdg.subjectArray2[1].score = 60;
		jdg.subjectArray2[2].name = "����";
		jdg.subjectArray2[2].score = 90;
		
		for (Subject2re sub:jdg.subjectArray2) {
			System.out.printf("���� : %s, ���� : %d\n", sub.name, sub.score );
		}
	}
}
