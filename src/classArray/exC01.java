package classArray;

//사람이라는 클래스 정의
class Person {
	//클래스변수(정적변수)
	static int share = 10;
	
	//객체 변수(인스턴스 변수)
	String name;
	int age;
	
	//생성자
	//반환타입 없음
	//클래스의 이름과 같아야 함
	// 객체를 생성할 때, 자동으로 호출
	//생성자를 통한 객체변수의 초기화
	Person(String name, int age) {
		System.out.println("생성자의 실행");
		this.name = name;
		this.age = age;
	}
	
	//인스턴스 메서드
	//객체를 통해서 호출 ex) p1.method();
	void method() {
		int a = 10;
		a++;
		System.out.println(a);
	}
	
	//클래스 메서드 (static method)
	//객체를 생성하지 않아도 클래스를 통해서 호출 가능한 메서드
	static void get_share() {
		//static이 붙은 변수에만 접근 가능
		System.out.println(share);
		
		// 객체변수에 대한 접근은 불가능
		// System.out.println(this.name);
		// System.out.prinln(name);
	}
	
	// 객체의 속성을 출력해주는 메서드를 정의
	void info() {
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
	}
	
	// setter
	// 메서드의 이름 앞에 set을 붙여서 표현
	void set_name(String name) {
		// 전달받은 매개변수로 객체변수를 초기화
		this.name = name;
	}
}
public class exC01 {

	public static void main(String[] args) {
		
		//클래스메서드 호출 (객체 생성하지 않아도 클래스를 통해 호출 가능)
		Person.get_share();
				
		// 정의된 객체를 생성(메모리에 만들어 줌)
		// new 연산자를 이용해서 클래스를 호출
		// 이렇게 객체를 생성하면, 이후에 객체에 접근할 수 있는 방법이 없음
		// 그렇기 때문에 아래와 같이 참조 변수를 통해 객체 생성
		System.out.println( new Person("김철수", 20) );
		
		// 변수(참조변수)를 통해서 객체에 접근
		Person p1 = new Person("장동건", 20);
		Person p2 = new Person("원빈", 22);
		p1.info();
		p2.info();
		
		// 아래의 두 객체는 같은 객체가 된다.
		// 얕은 복사(주소 복사)
		Person p3 = p1;
		System.out.println(p1); //두 코드 실행 결과
		System.out.println(p3); //p1과 p3가 가리키는 주소 같음
		
		// .을 통해서 객체의 속성(객체변수)에 접근
		// 객체.속성
		// 객체.기능()
		p1.name = "임종혁";
		p1.age = 20;
		System.out.printf("이름: %s, 나이: %d\n", p1.name, p1.age);
		
		// 객체변수는 공유되지 않음
		System.out.printf("이름: %s, 나이: %d\n", p2.name, p2.age);
		
		// 객체내의 메서드를 호출하는 경우에도 동일하게 .으로 접근
		p1.method();
		p2.method();
		
		// 메서드내에 정의된 변수 a는 접근할 수 없음 = 지역변수(매서드 내에서만 사용 가능)
		// p1.a;
	}
}
