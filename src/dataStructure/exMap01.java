package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class exMap01 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		//���� �߰� put
		map.put("first", "�嵿��");
		map.put("second", "����");
		
		//���� Ȯ�� get
		System.out.println(map.get("first"));
		
		//��ü ���� Ȯ��
		//
		System.out.println(map.entrySet()); //Ű�� �� ��� Ȯ��
		System.out.println(map.keySet()); //Ű�� Ȯ��
		
		//for each
		for (Map.Entry<String, String>item : map.entrySet()) {
			System.out.printf("key : %s, value : %s\n", item.getKey(), item.getValue());
		}
		
		//���� ����
		System.out.println(map.remove("first"));
		
		//ũ�� Ȯ��
		System.out.println(map.size());
	}

}
