package classArray;

class PersonInherit {
	String name;
	int age;	
	
	void info() { 
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
	}
}

// Person 클래스를 상속 받아서 Student 클래스 정의
class Student extends PersonInherit{
	// 정의된게 없어도 
	// 물려받은 속성과 기능을 사용할 수 있다. 
}

public class Inheritance {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.info();
	}

}
