package Loop;

public class ex08 {

	public static void main(String[] args) {
		for( int i = 1; i <= 50; i++) {
			int q = (int)(i / 10);
			int r = i % 10;
			boolean flag = true;
			
			if (q != 0 && q % 3 == 0) {System.out.print("¦"); flag = false;}
			if (r != 0 && r % 3 == 0) {System.out.print("¦"); flag = false;}
			
			if (flag) {
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}

}
