package Polymorphism;

class Car2 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive~~~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine2 extends Car2 {
	void water() {
		System.out.println("water!!!");
	}
}

public class Casting01 {
	public static void main(String[] args) {
		Car2 c = null;
		FireEngine2 f = new FireEngine2();
		FireEngine2 f2 = null;
		
		f.water();
		c = f; //��ĳ����. ����ȯ ���� ����. f�� �����ϰ� �ִ� �ν��Ͻ��� �ּҰ� �������� c�� �����. �������� c�� ���ؼ� FireEngine2 �ν��Ͻ��� ����� ���� ������, c�� fe�� �޸� Car Ÿ���̹Ƿ� Car Ŭ������ ����� �ƴ� water()�� ����� �� ����.
//		c.water(); //Car Ÿ���� ���������δ� water() ȣ�� �Ұ���
		f2 = (FireEngine2)c;
		f2.water();
	}
}
