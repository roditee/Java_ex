package excpetionEx;

class Sub {
		public int convToInt(String strs) {
			return Integer.parseInt(strs); //예외 발생하는 곳
		}
}
class Other extends Object {
	public int middleMethod(String strs) {
		Sub s = new Sub();
		try {
			return s.convToInt(strs);
		} catch (ArithmeticException e) {
			System.out.println("middleMethod에서 예외가 처리됨");
		}
		return s.convToInt(strs);
	}
}

public class exE02 {
	public static void main(String[] args) {
		Other exam = new Other();
		int num = 0;
		try {
			num = exam.middleMethod("a");
		}
		catch (Exception e) {
			System.out.println("결국 예외가 여기서 처리됨"); //예외가 처리되는 곳
		}
		System.out.println(num);
	}
	

}
