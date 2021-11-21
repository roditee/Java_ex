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
		c = f; //업캐스팅. 형변환 생략 가능. f가 참조하고 있는 인스턴스의 주소가 참조변수 c에 저장됨. 참조변수 c를 통해서 FireEngine2 인스턴스를 사용할 수는 있지만, c는 fe와 달리 Car 타입이므로 Car 클래스의 멤버가 아닌 water()는 사용할 수 없음.
//		c.water(); //Car 타입의 참조변수로는 water() 호출 불가능
		f2 = (FireEngine2)c;
		f2.water();
	}
}
