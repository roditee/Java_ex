import java.util.*; 

public class ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		System.out.print("정답 입력: ");
		int me = scan.nextInt();
		
		if (me < com) { System.out.println("Up!");}
		else if(me > com) { System.out.println("Down!"); }
		else { System.out.println("Bingo!"); }
		
		scan.close();
	}
}