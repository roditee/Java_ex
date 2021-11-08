import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dbid = 1234;
		int dbpw = 1111;
		
		int myid = s.nextInt();
		int mypw = s.nextInt();
		
		if ((dbid == myid) && (dbpw == mypw)) System.out.println("로그인성공");
		else System.out.println("로그인실패");
	}

}
