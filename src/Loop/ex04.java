package Loop;

public class ex04 {

	public static void main(String[] args) {
		//ex02의 조건에 맞는 수들의 개수 출력 - for
				int i = 1;
				int cnt = 0;
				for (i=1; i<=10; i++) {
					if (i<3 || i>=7) cnt++;
				}
				System.out.println(cnt);
				
				//ex02의 조건에 맞는 수들의 개수 출력 - while
				i = 1;
				cnt = 0;
				while(i<=10) {
					if (i<3 || i>=7) cnt++;
					i++;
				}
				System.out.println(cnt);
	}

}
