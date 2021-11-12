package Str;

public class exStr01 {

	public static void main(String[] args) {
		String id = "891207-1111223";
		
		//문제1 나이 출력
		//앞 두 자리 확인 substring
		String strAge = id.substring(0, 2);
		System.out.println(strAge);
		
		int birthYear = Integer.parseInt(strAge);
		birthYear += 1900;
		System.out.println(birthYear);
		
		int age = 2021 - birthYear + 1;
		System.out.println("나이 : " + age);
		
		
		//문제2 성별 출력
		String strsexuality = id.substring(7, 8);
		int sexuality = Integer.parseInt(strsexuality);
		System.out.println(sexuality);
		if (sexuality == 1 || sexuality == 3) System.out.println("남자");
		else if (sexuality == 2 || sexuality == 4) System.out.println("여자");
		
		//또는 이렇게도 가능
		char key = id.charAt(7);
		if (key == '1' || key == '3') System.out.println("남자");
		else if (key == '2' || key == '4') System.out.println("여자");
	}

}
