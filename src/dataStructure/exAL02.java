package dataStructure;

import java.util.ArrayList;

public class exAL02 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("Java");
		arr.add("Python");
		arr.add("C++");
		
		//�迭 ���� ���Ҹ� �������� ���
		//ArrayList�� ������ Ÿ���� Object�� �ν��� ��
		//�׻� Ÿ�Ժ�ȯ�� ���ο� �ξ�� ��
		String str = (String)arr.get(0);
		System.out.println(str);
		
		
		//Generics ���׸���
		//��õ� Ÿ�� �̿ܿ� �ٸ� Ÿ���� ���Ҹ� ���� �� ����
		//�ڵ����� Ÿ���� Ȯ�εǴ� ����
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Java");
		arr2.add("Python");
		arr2.add("C++");
		//������ Ÿ�� üũ �ʿ����� �ʰ� ��.
		String str2 = arr2.get(0);
		System.out.println(str);
	}

}
