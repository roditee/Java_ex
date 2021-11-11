package AbstractInterface;

//인터페이스 : 추상메서드만을 가지는 추상클래스

interface Interface {
	public abstract void abstractMethod1();
	public abstract void abstractMethod2();
	public abstract void abstractMethod3();
}

//인터페이스의 상속 implements
//여러 개의 인터페이스를 상속받아 구현 가능.
//자바는 다중상속을 허용하지 않지만, 한 개의 클래스(일반.추상) 여러 개의 인터페이스 상속 가능
class Sample implements Interface {
	public void abstractMethod1() {}
	public void abstractMethod2() {}
	public void abstractMethod3() {}
}

public class exInter01 {
	public static void main(String[] args) {
		Sample s = new Sample();
	}
}
