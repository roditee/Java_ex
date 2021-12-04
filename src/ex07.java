import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		int h = scan.nextInt();

		if (h>=120) { System.out.println("놀이기구 이용이 가능합니다."); }
		else { 
			System.out.print("부모님과 함께 오셨나요? (yes==1 no==0)");
			int parent = scan.nextInt();
			if (parent == 1) {
				System.out.println("놀이기구 이용이 가능합니다.");
			}
			else System.out.println("놀이기구 이용이 불가능합니다.");
		}
		scan.close();
	}

}
