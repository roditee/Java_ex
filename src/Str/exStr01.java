package Str;

public class exStr01 {

	public static void main(String[] args) {
		String id = "891207-1111223";
		
		//����1 ���� ���
		//�� �� �ڸ� Ȯ�� substring
		String strAge = id.substring(0, 2);
		System.out.println(strAge);
		
		int birthYear = Integer.parseInt(strAge);
		birthYear += 1900;
		System.out.println(birthYear);
		
		int age = 2021 - birthYear + 1;
		System.out.println("���� : " + age);
		
		
		//����2 ���� ���
		String strsexuality = id.substring(7, 8);
		int sexuality = Integer.parseInt(strsexuality);
		System.out.println(sexuality);
		if (sexuality == 1 || sexuality == 3) System.out.println("����");
		else if (sexuality == 2 || sexuality == 4) System.out.println("����");
		
		//�Ǵ� �̷��Ե� ����
		char key = id.charAt(7);
		if (key == '1' || key == '3') System.out.println("����");
		else if (key == '2' || key == '4') System.out.println("����");
	}

}
