package Loop;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		//�����佺�׳׽��� ü
		Scanner s = new Scanner(System.in);
		int remain = 0;
		int cnt = 0;
		
		System.out.printf("������ �Է��ϼ���.");
		int n = s.nextInt();
		
		for (int i=1; i<=n; i++) {
			remain = n%i;
			if (remain == 0) cnt++;
		}
		if (cnt == 2) System.out.printf("%d�� �Ҽ��Դϴ�.", n);
		else System.out.printf("%d�� �Ҽ��� �ƴմϴ�.", n);
		
		s.close();
	}
}
