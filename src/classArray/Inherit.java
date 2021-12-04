package classArray;

class Bird extends Animal {
	
	void fly() {
		System.out.println("나는 날고 있다.");
	}
}

class Animal {
	void walk() {
		System.out.println("나는 걷고 있다.");
	}
}

//이 코드가 동작할 수 있게 적당한 Animal 클래스를 정의
public class Inherit {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
	}

}
