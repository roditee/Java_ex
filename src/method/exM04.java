package method;

import java.util.Arrays;

class Ex04{

    int test1(int[] arr) { 
    	int cnt = 0;
    	for (int i=0; i<arr.length; i++) {
    		if (arr[i]%4 == 0) cnt++;
    	}
    	return cnt;
    	}
    
    int[] test2(int cnt, int[] arr) { 
    	int[] arrNew = new int[cnt];
    	
    	int j = 0;
    	for (int i=0; i<arr.length; i++) {
    		 if (arr[i]%4 == 0) {
    			 arrNew[j] = arr[i];
    			 j++;
    		 }
    		}
    	return arrNew;
    	}
}

public class exM04 {

	public static void main(String[] args) {
		 Ex04 e = new Ex04();

         int[] arr = {87, 12, 21, 56, 100};

         // ���� 1) 4�� ����� ������ �������ִ� �޼���
         int cnt = e.test1(arr);
         System.out.println("cnt = " + cnt);

         // ���� 2) 4�� ����� ������ŭ�� ���ο� �迭�� �����, 4�� ����� ������ �迭�� �������ִ� �޼���
         int[] temp = e.test2(cnt, arr);
         System.out.println(Arrays.toString(temp));
	}

}
