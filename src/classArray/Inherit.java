package classArray;

class Bird extends Animal {
	
	void fly() {
		System.out.println("���� ���� �ִ�.");
	}
}

class Animal {
	void walk() {
		System.out.println("���� �Ȱ� �ִ�.");
	}
}

//�� �ڵ尡 ������ �� �ְ� ������ Animal Ŭ������ ����
public class Inherit {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
	}

}
