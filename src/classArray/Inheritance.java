package classArray;

class PersonInherit {
	String name;
	int age;	
	
	void info() { 
		System.out.printf("�̸�: %s, ����: %d\n", this.name, this.age);
	}
}

// Person Ŭ������ ��� �޾Ƽ� Student Ŭ���� ����
class Student extends PersonInherit{
	// ���ǵȰ� ��� 
	// �������� �Ӽ��� ����� ����� �� �ִ�. 
}

public class Inheritance {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.info();
	}

}
