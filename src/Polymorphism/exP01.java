package Polymorphism;
class Tv {
	boolean power;
	int channel;
	
	void power() {power= !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}

class CaptionTv extends Tv {
	
	//�ڽ� Ŭ�������� ���� �߰��� �Ӽ�
	String text;
	void caption() {}
}

public class exP01 {
	public static void main(String[] args) {
		
		//is-a ���� (��Ӱ���)������ ����� ����
		//CaptionTv�� Tv��. (CaptionTv is Tv)
		Tv t1 = new Tv();
		Tv t2 = new CaptionTv();
		//t1, t2 -> TvŸ���� ��ü�� Tv�� ǥ���� �� �ְ�, CaptionTv�� ǥ���� �� �ִ�.
		CaptionTv c = new CaptionTv();
		
	}
}
