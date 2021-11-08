package Loop;

public class ex15 {

	public static void main(String[] args) {
		//1번 완료 (교수님 풀이는 이해 안 감)
		for (int i=1; i<100; i++) {
			int n = 9 * i;
			if (n/10 == 6) {
				System.out.println(n);
				break;
			}
		}
		//2번 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수
		int max = -1;
		int n = 0;
		for (int i=1; i<=150; i++) {
			if ((i%8) == 5) n = i;
			if (n>max) max = n;
		}
		System.out.println(n);
		
		//3번 완료
		int cnt=0;
		for (int i=50; i<=100; i++) {
			if(i%9 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		//4번 완료
		max = -1;
		for (int i=28; i<=1000; i+=28) {
			if(i>max) max = i;
		}
		System.out.println(max);
		
		
		//5번
		n = 0;
		for (int i=0; i<5; i++) {
			n = 8 * i;
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
