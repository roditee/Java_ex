package method;

class Ex05 {
	int test1(int[] arr) {
		int total = 0;
		for (int val:arr) total+=val;
		return total;
	}
	
	int test2(int[] arr) {
		int sum = 0;
		for (int val:arr) {
			if (val%4 == 0) sum+=val;
		}
		return sum;
	}
	
	int test3(int[] arr) {
		int cnt = 0;
		for (int val:arr) {
			if (val%4 == 0) cnt++;
		}
		return cnt;
	}

	int test4(int[] arr) {
		int cnt = 0;
		for (int val:arr) {
			if (val%2 == 0) cnt++;
		}
		return cnt;
		}
}
public class exM05 {

	public static void main(String[] args) {
		Ex05 e = new Ex05();

        int[] arr = {87, 100, 11, 72, 92};

        // ���� 1) ��ü �� ����
        // ���� 1) 362
        int tot = e.test1(arr);
        System.out.println("tot = " + tot);



        // ���� 2) 4�� ����� �� ����
        // ���� 2) 264
        tot = e.test2(arr);
        System.out.println("tot = " + tot);



        // ���� 3) 4�� ����� ���� ����
        // ���� 3) 3
        int cnt = e.test3(arr);
        System.out.println("cnt = " + cnt);



        // ���� 4) ¦���� ���� ����
        // ���� 4) 3
        cnt = e.test4(arr);
        System.out.println("cnt = " + cnt);
	}

}
