package excpetionEx;

class MyExcetion extends Exception {
	MyExcetion() {
		System.out.println("내가 만든 예외");
	}
}

class Sub3 {
	public int convToInt(String strs) {
		try { return Integer.parseInt(strs); //예외 발생하는 곳
		} catch(Exception e) {
			System.out.println("예외가 발생한 곳에서 처리");
			//예외도 객체
			throw new ArithmeticException();
		}
//		return 0;
	}
}

class Other3 extends Object {
public int middleMethod(String strs) throws MyExcetion{
	Sub3 s = new Sub3();
	try {
		return s.convToInt(strs);
	} catch (ArithmeticException e) {
		System.out.println("middleMethod에서 예외가 처리됨");
		throw new MyExcetion();
	}
}
}
//	return s.convToInt(strs);


public class exE03 {

	public static void main(String[] args) {
		Other3 exam = new Other3();
		int num = 0;
		try {
			num = exam.middleMethod("a");
		} catch(Exception e) {
			System.out.println("결국 여기까지 오고야 말았구나");
		}
		System.out.println(num);
	}

}
