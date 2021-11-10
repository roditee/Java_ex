package classArray;

class PersonOverloading {

	static int share = 10;
	
	String name;
	int age;	
	
	//�⺻ ������
	PersonOverloading() {
		
	}
	
	//������ �����ε�
	PersonOverloading(String name, int age) {
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

// Person Ŭ������ ��� �޾Ƽ� Student Ŭ���� ����
class StudentOverloading extends PersonOverloading{
	// ���ǵȰ� ��� 
	// �������� �Ӽ��� ����� ����� �� ����

	// �޼��� �����ε�
	int add() {
		return 10 + 20;
	}
	int add(int a) {
		return a + 30;
	}
	int add(int a, int b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b + c;
	}
	String add(String c, String d) {
		return c + d;
	}
}

public class Overloading {

	public static void main(String[] args) {
		// ������ �����ε��� �̿��ϸ� ��ü�� �پ��ϰ� ���� ����
		PersonOverloading p1 = new PersonOverloading();
		p1.info();
		
		PersonOverloading p2 = new PersonOverloading("�嵿��", 20);
		p2.info();
				
		//�޼��� �����ε�
		StudentOverloading s1 = new StudentOverloading();

		System.out.println( s1.add());
		System.out.println( s1.add(10));
		System.out.println( s1.add(10, 20) );
		System.out.println( s1.add(10, 20, 30));
		System.out.println( s1.add("Hello", "Java"));
	}

}
