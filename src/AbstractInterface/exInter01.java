package AbstractInterface;

//�������̽� : �߻�޼��常�� ������ �߻�Ŭ����

interface Interface {
	public abstract void abstractMethod1();
	public abstract void abstractMethod2();
	public abstract void abstractMethod3();
}

//�������̽��� ��� implements
//���� ���� �������̽��� ��ӹ޾� ���� ����.
//�ڹٴ� ���߻���� ������� ������, �� ���� Ŭ����(�Ϲ�.�߻�) ���� ���� �������̽� ��� ����
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
