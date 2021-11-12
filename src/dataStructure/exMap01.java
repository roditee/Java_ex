package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class exMap01 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		//원소 추가 put
		map.put("first", "장동건");
		map.put("second", "원빈");
		
		//원소 확인 get
		System.out.println(map.get("first"));
		
		//전체 원소 확인
		//
		System.out.println(map.entrySet()); //키와 값 모두 확인
		System.out.println(map.keySet()); //키만 확인
		
		//for each
		for (Map.Entry<String, String>item : map.entrySet()) {
			System.out.printf("key : %s, value : %s\n", item.getKey(), item.getValue());
		}
		
		//원소 삭제
		System.out.println(map.remove("first"));
		
		//크기 확인
		System.out.println(map.size());
	}

}
