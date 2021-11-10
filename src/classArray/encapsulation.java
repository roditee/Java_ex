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
		System.out.printf("이름: %s, 나이: %d\n", this.name, this.age);
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
		
		PersonEncap p1 = new PersonEncap("장동건", 20);
		PersonEncap p2 = new PersonEncap("원빈", 22);
		 
		p1.info();
		p2.info();
		
		// private 속성이나 메서드에 대해서는 외부 접근이 불가
//		p1.name;
		
		// 비공개 속성인 경우 클래스에서 제공하는 메서드를 통해서 접근
		System.out.println(p1.get_name());
	}

}
