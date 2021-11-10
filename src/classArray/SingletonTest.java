package classArray;

class Singleton {

	private static Singleton one = null;
	private Singleton() {}
	
	// �ƹ��� ������ �� ������ �ȵǴϱ� 
	// ������ �����ִ� �޼���
	public static Singleton getObject() {
		// ������ ȣ���� ����
		if ( one == null ) one = new Singleton();
		return one;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ƹ��� ��ü�� ����� �����ϴ�.
		// Singleton single = new Singleton();
		Singleton single = Singleton.getObject();
		System.out.println(single);
		
		// �� �̻��� ���ο� ��ü�� �����Ұ�
		Singleton single2 = Singleton.getObject();
		System.out.println(single2);
		
		System.out.println( Singleton.getObject() );

	}
}