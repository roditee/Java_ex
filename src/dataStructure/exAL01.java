package dataStructure;

import java.util.ArrayList;

public class exAL01 {

	public static void main(String[] args) {
		//객체 생성
		ArrayList arr = new ArrayList();
		
		//원소 추가
		arr.add("10");
		arr.add("20");
		arr.add("30");
		
		//배열 내의 원소 확인 get
		System.out.println(arr.get(0));
		
		//배열의 크기 확인
		System.out.println(arr.size());
		
		//배열에 원소 삽입 add
		arr.add(1, "15"); //(삽입인덱스, 삽입값)
		
		//배열 내의 모든 원소 확인 -> 순회
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		
		//배열의 원소 검색
		System.out.println(arr.contains("15"));
		
		//배열에서 원소 삭제
		arr.remove(3); //매개변수가 인덱스인 경우
		arr.remove("15"); //매개변수가 객체인 경우
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		
	}

}
