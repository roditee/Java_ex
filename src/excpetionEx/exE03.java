package excpetionEx;

class MyExcetion extends Exception {
	MyExcetion() {
		System.out.println("���� ���� ����");
	}
}

class Sub3 {
	public int convToInt(String strs) {
		try { return Integer.parseInt(strs); //���� �߻��ϴ� ��
		} catch(Exception e) {
			System.out.println("���ܰ� �߻��� ������ ó��");
			//���ܵ� ��ü
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
		System.out.println("middleMethod���� ���ܰ� ó����");
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
			System.out.println("�ᱹ ������� ����� ���ұ���");
		}
		System.out.println(num);
	}

}
