package Loop;

public class ex03 {

	public static void main(String[] args) {
		//ex02�� ���ǿ� �´� ������ �� ��� - for
		int i = 1;
		int sum = 0;
		for (i=1; i<=10; i++) {
			if (i<3 || i>=7) sum+=i;
		}
		System.out.println(sum);
		
		//ex02�� ���ǿ� �´� ������ �� ��� - while
		i = 1;
		sum = 0;
		while(i<=10) {
			if (i<3 || i>=7) sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}