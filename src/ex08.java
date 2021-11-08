import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbid = 1111;
		int dbpw = 1234;
		
		System.out.print("ID를 입력하세요: ");
		int id = scan.nextInt();
		
		if (id == dbid) {
			System.out.print("PW를 입력하세요: ");
			int pw = scan.nextInt();
			if (pw == dbpw) {
				System.out.print("로그인 성공");
			}
			else System.out.print("PW를 확인해주세요");
		}
		else System.out.print("ID를 확인해주세요");
	}

}
