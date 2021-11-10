package classArray;

class PersonOverriding {

	static int share = 10;
	
	String name;
	int age;	
	
	// 생성자 오버로딩
	PersonOverriding() {}
	PersonOverriding(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static void get_share() {
		System.out.println(share);
	}
	
	void info() { 
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
	}
	
	void set_name(String name) {
		this.name = name;
	}
	
	String get_name() {
		return this.name;
	}
}

// PersonOverriding 클래스를 상속 받는 StudentOverriding 클래스 정의
class StudentOverriding extends PersonOverriding{
	
	String school;
	
	//생성자 오버로딩
	StudentOverriding() {};
	StudentOverriding( String name, int age, String school ) {
		super(name, age);
		this.school = school;
	}
	
	//오버라이딩
	void info() {
		super.info();
		System.out.printf("학교이름: %s\n", this.school);
	}
}

public class Overriding {
	public static void main(String[] args) {
		StudentOverriding s1 = new StudentOverriding("장동건", 20, "멀티캠퍼스");
		s1.info();
	}
}
