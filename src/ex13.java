interface ThisInterface {
	public void thisMethod();
	}

interface ThatInterface {
	public void thatMethod();
	}

class MyClass implements ThisInterface, ThatInterface {
	public void thisMethod() {
		System.out.println("this");
		}
	
	public void thatMethod() {
		System.out.println("that");
		}
}
			
public class ex13 {
	public static void main(String[] args) {
			    MyClass cls = new MyClass();
			    cls.thisMethod();
			    cls.thatMethod();
	}
}