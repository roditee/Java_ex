package AbstractInterface;

abstract class Abstract {
	//선언만 되어 있고 내부 기능이 정의되지 않은 메서드
	abstract void abstractMethod();
	
	//정의된 메서드가 있어도 상관없음
	void generalMethod() {
		System.out.println("일반 메서드");
	}
}

class General extends Abstract {
	//메서드 재정의(오버라이딩)을 통해 완성
	void abstractMethod() {
		System.out.println("완성");
	}
}
public class exAbs01 {

	public static void main(String[] args) {
		//추상클래스가 아닌 클래스로 상속을 해주어야만 객체 생성 가능
		General ogj = new General();
	}
}
