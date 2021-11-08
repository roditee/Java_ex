package Loop;

public class ex01 {

	public static void main(String[] args) {
		//1~5까지의 합 출력 - for
		int i = 1;
		int sum = 0;
		for (i=1; i<6; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//1~5까지의 합 출력 - while
		sum = 0;
		i = 1;
		while(i<=5) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
