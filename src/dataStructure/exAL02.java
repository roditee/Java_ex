package dataStructure;

import java.util.ArrayList;

public class exAL02 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("Java");
		arr.add("Python");
		arr.add("C++");
		
		//배열 내의 원소를 꺼내오는 경우
		//ArrayList는 원소의 타입을 Object로 인식을 함
		//항상 타입변환을 염두에 두어야 함
		String str = (String)arr.get(0);
		System.out.println(str);
		
		
		//Generics 지네릭스
		//명시된 타입 이외에 다른 타입의 원소를 넣을 수 없음
		//자동으로 타입이 확인되는 장점
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Java");
		arr2.add("Python");
		arr2.add("C++");
		//별도의 타입 체크 필요하지 않게 됨.
		String str2 = arr2.get(0);
		System.out.println(str);
	}

}
