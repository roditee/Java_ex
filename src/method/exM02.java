package method;

import java.util.Arrays;

class Ex02 {
	void test1(int x, int y) {
		int total = 0;
		for(int i=x; i<=y; i++) total+=x;
		System.out.println(total);
	}
	
	void test2(int[] arr) {
		int max = -1;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}
		//for each문 사용
//		for (int val:arr) {
//			if (max < val) max = val;
//		}
		System.out.println(max);
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		int temp = 0;
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
public class exM02 {

	public static void main(String[] args) {
		Ex02 e = new Ex02();
		
		//문제1
		int x = 1;
		int y = 10;
		e.test1(x,y);
		
		//문제2
		int[] arr = {87, 100, 35, 12, 46};
        e.test2(arr);
		
		//문제3
        int idx1 = 1;
        int idx2 = 4;
        e.test3(arr, idx1, idx2);
	}

}
