package Array;

public class ex06 {

	public static void main(String[] args) {
		int[] arr = {44, 11, 29, 24, 76};
		int cnt = 0;
		int[] temp = null;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%4 == 0) cnt++;
		}
		temp = new int[cnt];
		
		int j = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%4 == 0) {
				temp[j] = arr[i];
				System.out.print(temp[j] + " ");
				j++;
			}
		}
		
	}

}
