package Loop;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int n = s.nextInt();
		
		while(true) {
			int cnt = 0; //re - cnt ��ġ ����
			for (int i=1; i<=n; i++) {
				if (n%i == 0) { cnt++; }
			}
			if (cnt == 2) {
				System.out.println(n);
				break; //re - if���� for�� �� ���� �� �Ŀ� �;��� = for�� �ۿ� �;���
			}
			n++; //n++ �� ������?
		}
		
		s.close();
	}
}