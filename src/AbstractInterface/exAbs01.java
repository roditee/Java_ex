package AbstractInterface;

abstract class Abstract {
	//���� �Ǿ� �ְ� ���� ����� ���ǵ��� ���� �޼���
	abstract void abstractMethod();
	
	//���ǵ� �޼��尡 �־ �������
	void generalMethod() {
		System.out.println("�Ϲ� �޼���");
	}
}

class General extends Abstract {
	//�޼��� ������(�������̵�)�� ���� �ϼ�
	void abstractMethod() {
		System.out.println("�ϼ�");
	}
}
public class exAbs01 {

	public static void main(String[] args) {
		//�߻�Ŭ������ �ƴ� Ŭ������ ����� ���־�߸� ��ü ���� ����
		General ogj = new General();
	}
}
