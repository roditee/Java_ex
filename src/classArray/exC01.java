package classArray;

//����̶�� Ŭ���� ����
class Person {
	//Ŭ��������(��������)
	static int share = 10;
	
	//��ü ����(�ν��Ͻ� ����)
	String name;
	int age;
	
	//������
	//��ȯŸ�� ����
	//Ŭ������ �̸��� ���ƾ� ��
	// ��ü�� ������ ��, �ڵ����� ȣ��
	//�����ڸ� ���� ��ü������ �ʱ�ȭ
	Person(String name, int age) {
		System.out.println("�������� ����");
		this.name = name;
		this.age = age;
	}
	
	//�ν��Ͻ� �޼���
	//��ü�� ���ؼ� ȣ�� ex) p1.method();
	void method() {
		int a = 10;
		a++;
		System.out.println(a);
	}
	
	//Ŭ���� �޼��� (static method)
	//��ü�� �������� �ʾƵ� Ŭ������ ���ؼ� ȣ�� ������ �޼���
	static void get_share() {
		//static�� ���� �������� ���� ����
		System.out.println(share);
		
		// ��ü������ ���� ������ �Ұ���
		// System.out.println(this.name);
		// System.out.prinln(name);
	}
	
	// ��ü�� �Ӽ��� ������ִ� �޼��带 ����
	void info() {
		System.out.printf("�̸�: %s, ����: %d\n", this.name, this.age);
	}
	
	// setter
	// �޼����� �̸� �տ� set�� �ٿ��� ǥ��
	void set_name(String name) {
		// ���޹��� �Ű������� ��ü������ �ʱ�ȭ
		this.name = name;
	}
}
public class exC01 {

	public static void main(String[] args) {
		
		//Ŭ�����޼��� ȣ�� (��ü �������� �ʾƵ� Ŭ������ ���� ȣ�� ����)
		Person.get_share();
				
		// ���ǵ� ��ü�� ����(�޸𸮿� ����� ��)
		// new �����ڸ� �̿��ؼ� Ŭ������ ȣ��
		// �̷��� ��ü�� �����ϸ�, ���Ŀ� ��ü�� ������ �� �ִ� ����� ����
		// �׷��� ������ �Ʒ��� ���� ���� ������ ���� ��ü ����
		System.out.println( new Person("��ö��", 20) );
		
		// ����(��������)�� ���ؼ� ��ü�� ����
		Person p1 = new Person("�嵿��", 20);
		Person p2 = new Person("����", 22);
		p1.info();
		p2.info();
		
		// �Ʒ��� �� ��ü�� ���� ��ü�� �ȴ�.
		// ���� ����(�ּ� ����)
		Person p3 = p1;
		System.out.println(p1); //�� �ڵ� ���� ���
		System.out.println(p3); //p1�� p3�� ����Ű�� �ּ� ����
		
		// .�� ���ؼ� ��ü�� �Ӽ�(��ü����)�� ����
		// ��ü.�Ӽ�
		// ��ü.���()
		p1.name = "������";
		p1.age = 20;
		System.out.printf("�̸�: %s, ����: %d\n", p1.name, p1.age);
		
		// ��ü������ �������� ����
		System.out.printf("�̸�: %s, ����: %d\n", p2.name, p2.age);
		
		// ��ü���� �޼��带 ȣ���ϴ� ��쿡�� �����ϰ� .���� ����
		p1.method();
		p2.method();
		
		// �޼��峻�� ���ǵ� ���� a�� ������ �� ���� = ��������(�ż��� �������� ��� ����)
		// p1.a;
	}
}
