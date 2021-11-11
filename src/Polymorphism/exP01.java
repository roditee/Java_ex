package Polymorphism;
class Tv {
	boolean power;
	int channel;
	
	void power() {power= !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}

class CaptionTv extends Tv {
	
	//자식 클래스에서 새로 추가된 속성
	String text;
	void caption() {}
}

public class exP01 {
	public static void main(String[] args) {
		
		//is-a 관계 (상속관계)에서만 사용이 가능
		//CaptionTv는 Tv다. (CaptionTv is Tv)
		Tv t1 = new Tv();
		Tv t2 = new CaptionTv();
		//t1, t2 -> Tv타입의 객체는 Tv도 표현할 수 있고, CaptionTv도 표현할 수 있다.
		CaptionTv c = new CaptionTv();
		
	}
}
