package classArray;

class PersonEncap {

	static int share = 10;
	
	private String name;
	private int age;	
	
	PersonEncap(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static void get_share() {
		System.out.println(share);
	}
	
	void info() { 
		System.out.printf("�̸�: %s, ����: %d\n", this.name, this.age);
	}
	
	// setter
	void set_name(String name) {
		this.name = name;
	}
	
	// getter
	String get_name() {
		return this.name;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		PersonEncap.get_share();
		
		PersonEncap p1 = new PersonEncap("�嵿��", 20);
		PersonEncap p2 = new PersonEncap("����", 22);
		 
		p1.info();
		p2.info();
		
		// private �Ӽ��̳� �޼��忡 ���ؼ��� �ܺ� ������ �Ұ�
//		p1.name;
		
		// ����� �Ӽ��� ��� Ŭ�������� �����ϴ� �޼��带 ���ؼ� ����
		System.out.println(p1.get_name());
	}

}
