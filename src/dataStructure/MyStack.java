package dataStructure;

public class MyStack {
	private int stackSize;
	private int top;
	private char[] stackArr;
	
	// 생성자 : 스택 초기화
	// 배열 인덱스는 0부터 시작하므로 top -1로 초기화
	public MyStack (int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		stackArr = new char[this.stackSize];
	}
	
	// 스택이 비었는지 확인하는 메서드
	public boolean isEmpty() {
		return top==-1; //top이 -1이면 true 아니면 false
	}
	
	// 스택이 가득 차있는지 확인한느 메서드
	public boolean isFull() {
		return top==stackSize-1; // 스택이 가득 차있으면 true 아니면 false
	}
	
	// 스택에 데이터 삽입하는 메서드
	// 삽입 전 오버플로우 발생하는지 확인 -> full이 아니면 top을 하나 증가한 위치에 값 삽입
	public void push(char item) {
		if (isFull()) System.out.println("Stack is Full. Overflow");
		else stackArr[++top] = item;
	}
	
	// 삭제 전 언더플로우 발생하는지 확인
	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is emptry. Underflow");
			return 'E'; //형식적으로 반환
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
	
	// 스택 내용을 비우는 clear()
	public void clear() {
		top = -1;
	}
	
	// 스택의 전체 데이터를 출력하는 showStack()
	// 출력만 하고 반환값 없음
	// 출력 전 스택 비었는지 왁인
	// 스택에 있는 모든 요소의 값 출력
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
