package Loop;

public class ex14 {

	public static void main(String[] args) {
		int i, j;
		int start = 1;
		int end = 5;
		
		for (i=1; i<=5; i++) {
			if((i%2)==0) {
				for (j=end; j>=start; j--) {
					System.out.print(j + " ");
				}
			}
			else {
				for (j=start; j<=end; j++) {
					System.out.print(j + " ");
				}
			}
			start+=5;
			end+=5;
			System.out.println();
		}
	}

}
