package Loop;

public class ex15 {

	public static void main(String[] args) {
		//1�� �Ϸ� (������ Ǯ�̴� ���� �� ��)
		for (int i=1; i<100; i++) {
			int n = 9 * i;
			if (n/10 == 6) {
				System.out.println(n);
				break;
			}
		}
		//2�� 8�� ������ 5�� ���¼� �� 150���� �������߿� ���� ������
		int max = -1;
		int n = 0;
		for (int i=1; i<=150; i++) {
			if ((i%8) == 5) n = i;
			if (n>max) max = n;
		}
		System.out.println(n);
		
		//3�� �Ϸ�
		int cnt=0;
		for (int i=50; i<=100; i++) {
			if(i%9 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		//4�� �Ϸ�
		max = -1;
		for (int i=28; i<=1000; i+=28) {
			if(i>max) max = i;
		}
		System.out.println(max);
		
		
		//5��
		n = 0;
		for (int i=0; i<5; i++) {
			n = 8 * i;
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
