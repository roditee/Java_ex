package Loop;

public class ex02 {

	public static void main(String[] args) {
		//1~10���� �ݺ��� 3�̸� 7�̻� ��� - for
		int i = 1;
		for (i=1; i<=10; i++) {
			if (i<3 || i>=7) System.out.print(i + " ");
		}
		
		System.out.print("\n");
		
		//1~10���� �ݺ��� 3�̸� 7�̻� ��� - while
		i = 1;
		while(i<=10) {
			if (i<3 || i>=7) System.out.print(i + " ");
			i++;
		}
	}
}
