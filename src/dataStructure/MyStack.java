package dataStructure;

public class MyStack {
	private int stackSize;
	private int top;
	private char[] stackArr;
	
	// ������ : ���� �ʱ�ȭ
	// �迭 �ε����� 0���� �����ϹǷ� top -1�� �ʱ�ȭ
	public MyStack (int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		stackArr = new char[this.stackSize];
	}
	
	// ������ ������� Ȯ���ϴ� �޼���
	public boolean isEmpty() {
		return top==-1; //top�� -1�̸� true �ƴϸ� false
	}
	
	// ������ ���� ���ִ��� Ȯ���Ѵ� �޼���
	public boolean isFull() {
		return top==stackSize-1; // ������ ���� �������� true �ƴϸ� false
	}
	
	// ���ÿ� ������ �����ϴ� �޼���
	// ���� �� �����÷ο� �߻��ϴ��� Ȯ�� -> full�� �ƴϸ� top�� �ϳ� ������ ��ġ�� �� ����
	public void push(char item) {
		if (isFull()) System.out.println("Stack is Full. Overflow");
		else stackArr[++top] = item;
	}
	
	// ���� �� ����÷ο� �߻��ϴ��� Ȯ��
	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is emptry. Underflow");
			return 'E'; //���������� ��ȯ
		}
		else return stackArr[top--];
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack Empty");
			return 'E';
		}
		else return stackArr[top];
	}
	
	// ���� ������ ���� clear()
	public void clear() {
		top = -1;
	}
	
	// ������ ��ü �����͸� ����ϴ� showStack()
	// ��¸� �ϰ� ��ȯ�� ����
	// ��� �� ���� ������� ����
	// ���ÿ� �ִ� ��� ����� �� ���
	public void showStack() {
		if(isEmpty()) System.out.println("Stack Empty");
		else {
			System.out.print("Stack items : ");
			for (int i=0; i<=top; i++) {
				System.out.print(i + ":" + stackArr[i] + " ");
			}
			System.out.println("\ntop : " + top);
		}
	}
}
