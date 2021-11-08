import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId, dbPw;
		int myId, myPw;
		
		System.out.println("==== 회원가입 ====");
		System.out.print("가입할 ID 입력: ");
		dbId = scan.nextInt();
		
		System.out.print("가입할 PW 입력: ");
		dbPw = scan.nextInt();
		
		System.out.println("==== 로그인 ====");
		System.out.print("ID 입력: ");
		myId = scan.nextInt();
		
		System.out.print("PW 입력: ");
		myPw = scan.nextInt();
		
		if( dbId == myId && dbPw == myPw ) { System.out.println("로그인 성공"); }
		else { System.out.println("로그인 실패"); }
		//문자열 비교에는 equlas 사용. dbId.equals(myId)로 비교

	}
}
