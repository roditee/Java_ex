package classArray;

class PersonOverloading {

	static int share = 10;
	
	String name;
	int age;	
	
	//기본 생성자
	PersonOverloading() {
		
	}
	
	//생성자 오버로딩
	PersonOverloading(String name, int age) {
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

// Person 클래스를 상속 받아서 Student 클래스 정의
class StudentOverloading extends PersonOverloading{
	// 정의된게 없어도 
	// 물려받은 속성과 기능을 사용할 수 있음

	// 메서드 오버로딩
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
		// 생성자 오버로딩을 이용하면 객체를 다양하게 생성 가능
		PersonOverloading p1 = new PersonOverloading();
		p1.info();
		
		PersonOverloading p2 = new PersonOverloading("장동건", 20);
		p2.info();
				
		//메서드 오버로딩
		StudentOverloading s1 = new StudentOverloading();

		System.out.println( s1.add());
		System.out.println( s1.add(10));
		System.out.println( s1.add(10, 20) );
		System.out.println( s1.add(10, 20, 30));
		System.out.println( s1.add("Hello", "Java"));
	}

}
