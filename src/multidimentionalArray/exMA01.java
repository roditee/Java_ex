package multidimentionalArray;

import java.util.Arrays;

public class exMA01 {

	public static void main(String[] args) {
		int [][] arr2D = new int[5][5];
		int[][] arrInit = {{10, 20, 30},{40, 50, 60}};
		
		for (int i=0; i<arrInit.length; i++) {
			System.out.println(Arrays.toString(arrInit[i]));
			for (int j=0; j<arrInit[i].length; j++) {
				System.out.println(arrInit[i][j]);
			}
		}
		}
	}
