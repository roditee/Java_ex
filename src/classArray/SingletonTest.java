package classArray;

class Singleton {

	private static Singleton one = null;
	private Singleton() {}
	
	// 아무도 생성할 수 없으면 안되니깐 
	// 생성을 도와주는 메서드
	public static Singleton getObject() {
		// 생성자 호출이 가능
		if ( one == null ) one = new Singleton();
		return one;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 아무도 객체를 만들수 없습니다.
		// Singleton single = new Singleton();
		Singleton single = Singleton.getObject();
		System.out.println(single);
		
		// 더 이상의 새로운 객체는 생성불가
		Singleton single2 = Singleton.getObject();
		System.out.println(single2);
		
		System.out.println( Singleton.getObject() );

	}
}