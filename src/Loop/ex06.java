package Loop;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� [EXIT -100] : ");
			int n = s.nextInt();
			
			if (n==-100) break;
//			if (n==-100) return; //main�޼����� ����� ���α׷��� ���� ����� ����
//			if (n==-100) System.exit(0);; //main�޼����� ����� ���α׷��� ���� ����� ����. exit�� �Ű����� = �����ڵ�
		}
		
		s.close();
	}

}
