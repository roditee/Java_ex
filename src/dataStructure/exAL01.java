package dataStructure;

import java.util.ArrayList;

public class exAL01 {

	public static void main(String[] args) {
		//��ü ����
		ArrayList arr = new ArrayList();
		
		//���� �߰�
		arr.add("10");
		arr.add("20");
		arr.add("30");
		
		//�迭 ���� ���� Ȯ�� get
		System.out.println(arr.get(0));
		
		//�迭�� ũ�� Ȯ��
		System.out.println(arr.size());
		
		//�迭�� ���� ���� add
		arr.add(1, "15"); //(�����ε���, ���԰�)
		
		//�迭 ���� ��� ���� Ȯ�� -> ��ȸ
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		
		//�迭�� ���� �˻�
		System.out.println(arr.contains("15"));
		
		//�迭���� ���� ����
		arr.remove(3); //�Ű������� �ε����� ���
		arr.remove("15"); //�Ű������� ��ü�� ���
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		
	}

}
