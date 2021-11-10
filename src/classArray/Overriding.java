package classArray;

class PersonOverriding {

	static int share = 10;
	
	String name;
	int age;	
	
	// ������ �����ε�
	PersonOverriding() {}
	PersonOverriding(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static void get_share() {
		System.out.println(share);
	}
	
	void info() { 
		System.out.printf("�̸�: %s, ����: %d\n", this.name, this.age);
	}
	
	void set_name(String name) {
		this.name = name;
	}
	
	String get_name() {
		return this.name;
	}
}

// PersonOverriding Ŭ������ ��� �޴� StudentOverriding Ŭ���� ����
class StudentOverriding extends PersonOverriding{
	
	String school;
	
	//������ �����ε�
	StudentOverriding() {};
	StudentOverriding( String name, int age, String school ) {
		super(name, age);
		this.school = school;
	}
	
	//�������̵�
	void info() {
		super.info();
		System.out.printf("�б��̸�: %s\n", this.school);
	}
}

public class Overriding {
	public static void main(String[] args) {
		StudentOverriding s1 = new StudentOverriding("�嵿��", 20, "��Ƽķ�۽�");
		s1.info();
	}
}
