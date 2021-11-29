package dataStructure;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		
		try {
			stk.push("ȫ�浿");
			stk.push("�̸���");
			stk.push("������");
			
			for(int i=0; i<stk.size(); i++) {
				System.out.println(i + " : " + stk.get(i));
			}
			
			System.out.println("���� ũ�� : " + stk.size());
			System.out.println("�ֻ��� �� : " + stk.peek());
			System.out.println("�̸��� ��� �ֳ�? : " + stk.contains("�̸���"));
			System.out.println("pop ����1 : " + stk.pop());
			System.out.println("pop ����2 : " + stk.pop());
			
			for(int i=0; i<stk.size(); i++) {
				System.out.println(i + " : " + stk.get(i));
			}
			
			System.out.println("clear ����");
			stk.clear();
			System.out.println("empty? : " + stk.empty());
			
			System.out.println("pop ����3 : " + stk.pop());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
