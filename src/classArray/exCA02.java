package classArray;

import java.util.Arrays;

//has-a
//���� ����
//���� 1���� ���� ���� (�����̸��� ����)
class Subject2 {
	String name;
	int score;
}

class Student2 {
	String name;
	
	//���� ���� ���� ������ �迭�� ����
	Subject2[] subjectArray;
	
	//������ ����
	//Ư¡ - ����Ÿ�� ����. Ŭ������ �̸��� ����
	//�̹� ���� �� ���̴� ����Ʈ �����ڰ� ����������, �����ڸ� �������ָ� ����Ʈ �����ڴ� �������.
	//������ �����ε�
	Student2() {}
	Student2(String name) {
		this.name = name;
		this.subjectArray = new Subject2[3];
	}
}
public class exCA02 {
	public static void main(String[] args) {
		
		//�л� 3���� ������ ���� �� �ִ� �迭�� ����
		Student2[] arr = new Student2[3];
		
		//�л� ������ ���� �� �ִ� ��ü 3���� �����ؼ� �迭�� ��ƺ���
		for (int i=0; i<arr.length; i++) {
			arr[i] = new Student2();
		}
		System.out.println(Arrays.toString(arr));
		
		//�л� ������ ���� �� �ִ� ��ü 3���� �����ؼ� �迭�� ��ƺ���
		//�л� 1��� ��ü 1
		//�������� Ȱ��
		//�л� ��ü�� ������ �� �̸��� �ʱ�ȭ
		arr[0] = new Student2("�嵿��");
		arr[1] = new Student2("����");
		arr[2] = new Student2("������");
		for (Student2 stu:arr) {
			System.out.printf("�л� : %s\n", stu.name);
		}
		
		//���� �߰�
		//�嵿�� �л��� ���ؼ� ����: 50, ����: 60, ����: 90 �߰�
		//����[1] �嵿�� �л��� ��ü ��������
		Student2 jang = null;
		for (Student2 stu:arr) {
			if (stu.name.equals("�嵿��")) {
				jang = stu;
				break;
			}
		}
		System.out.printf("�л� : %s\n", jang.name);
		System.out.printf("sbj arr : %s\n", Arrays.toString(jang.subjectArray));
		
		//������ ���� �� �ִ� ��ü ����
		for (int i=0; i<jang.subjectArray.length; i++) {
			jang.subjectArray[i] = new Subject2();
		}
		System.out.printf("sbj arr : %s\n", Arrays.toString(jang.subjectArray));
		
		//���� ���� ����
		jang.subjectArray[0].name = "����";
		jang.subjectArray[0].score = 50;
		jang.subjectArray[1].name = "����";
		jang.subjectArray[1].score = 60;
		jang.subjectArray[2].name = "����";
		jang.subjectArray[2].score = 90;
		
		for (Subject2 sub:jang.subjectArray) {
			System.out.printf("���� : %s, ���� : %d\n", sub.name, sub.score );
		}
		//�� 3������ ������ �Է¹ޱ� ���ؼ� �̸� �迭 ����
		//�л� ��ü���� ������ ������ �� �ִ� �޸� ����
		//��ü �ϳ��� �����ͼ� ó��
//		for (Student2 student : arr) {
//			student.subjectArray
//		}
	}

}
