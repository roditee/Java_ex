import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	    int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int menu_num, money, charge;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우 버거 : " + price2 + "원");
		System.out.println("3.콜 라 : " + price3 + "원");
		
		System.out.print("주문하고싶은 메뉴 번호를 입력하세요: ");
		menu_num = scan.nextInt();
		System.out.print("가지고 있는 현금 금액을 입력하세요: ");
		money = scan.nextInt();
		
		if (menu_num==1) charge = money - price1;
		else if (menu_num==2) charge = money - price2;
		else charge = money - price3;
		
		if (charge>=0) System.out.printf("%d번 메뉴 주문. 잔돈은 %d원 입니다.", menu_num, charge);
		else System.out.print("현금이 부족합니다.");
	}

}
