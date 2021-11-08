package Array;

public class ex01 {

	public static void main(String[] args) {
		int i;
		int a = 10;
		int[] arr = new int[5];
		
		//1번
		for (i=0; i<arr.length; i++) {
			arr[i] = a;
			// 또는 arr[i] = 10 * (i + 1);
			System.out.print(arr[i] + " ");
			a+=10;
		}
		
		System.out.println();
		
		//2번
		for (i=0; i<arr.length; i++) {
			if (arr[i]%4 == 0) System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//3번
		int sum = 0;
		for (i=0; i<arr.length; i++) {
			if (arr[i]%4 == 0) sum+=arr[i];
		}
		System.out.println(sum);
		
		//4번
		int cnt = 0;
		for (i=0; i<arr.length; i++) {
			if (arr[i]%4 == 0) cnt++;
		}
		System.out.println(cnt);
		
		//5번
		cnt = 0;
		for (i=0; i<arr.length; i++) {
			for (i=0; i<5; i++) {
				if (arr[i]%2 == 0) cnt++;
			}
			System.out.println(cnt);
		}
	}
	//배열의 출력 방법
}
