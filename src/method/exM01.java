package method;

import java.util.Random;

class Ex01 {
	void test1() {
		int total = 0;
		for (int i=1; i<6; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	void test2() {
		Random rand = new Random();
		int[] arr = new int[3];
		int max = -1;
		for (int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(100) + 1;
			if (arr[i] > max) max = arr[i];
		}
//		//for each¹® »ç¿ë
//		for(int val:arr) {
//			if (val>max) max = val;
//		}
		System.out.println(max);
	}
}

public class exM01 {

	public static void main(String[] args) {
		Ex01 e = new Ex01();
		e.test1();
		e.test2();
	}

}
