import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int account = 1234;
		int myMoney = 10000;
		int yourMoney = 12000;
		
		System.out.print("계좌번호를 입력하세요: ");
		int inputAccount = scan.nextInt();
		
		if(inputAccount == account) {
			System.out.print("이체 금액을 입력하세요: ");
			int amount = scan.nextInt();
			if (amount <= myMoney) {
				myMoney-=amount;
				yourMoney+=amount;
				System.out.printf("%d원 이체가 완료되었습니다. 계좌 잔액 %d원", amount, myMoney);
			}
			else {System.out.println("잔액 부족으로 이체가 불가능합니다.");}
		}
		else {System.out.print("계좌번호가 일치하지 않습니다.");}
		
		scan.close();
	}

}