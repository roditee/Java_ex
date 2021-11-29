package dataStructure;

public class MyStackMain {
	public static void main(String[] args) {
		// ���� ũ�� ����
		int stackSize = 5;
		MyStack stk = new MyStack(stackSize);
		
		System.out.print("���� �ʱ� ���� : ");
		stk.showStack();
		
		System.out.println("\npop ����");
		stk.pop();
		
		System.out.println("\na, b, c push ����");
		stk.push('a');
		stk.push('b');
		stk.push('c');
		stk.showStack();
		
		System.out.println("\n�ֻ��� �� : " + stk.peek());
		
		System.out.println("\nd, e push ����");
		stk.push('d');
		stk.push('e');
		stk.showStack();
		
		System.out.println("\nf push ����");
		stk.push('f');
		
		System.out.println("\npop 2�� ����");
		System.out.println("pop�� �� : " + stk.pop());
		System.out.println("pop�� �� : " + stk.pop());
		stk.showStack();
		
		System.out.println("\nclear ����");
		stk.clear();
		stk.showStack();
	}
}
