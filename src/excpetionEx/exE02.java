package excpetionEx;

class Sub {
		public int convToInt(String strs) {
			return Integer.parseInt(strs); //���� �߻��ϴ� ��
		}
}
class Other extends Object {
	public int middleMethod(String strs) {
		Sub s = new Sub();
		try {
			return s.convToInt(strs);
		} catch (ArithmeticException e) {
			System.out.println("middleMethod���� ���ܰ� ó����");
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
			System.out.println("�ᱹ ���ܰ� ���⼭ ó����"); //���ܰ� ó���Ǵ� ��
		}
		System.out.println(num);
	}
	

}
