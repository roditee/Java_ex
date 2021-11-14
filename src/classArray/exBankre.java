package classArray;

import java.util.Random;

class User2 {
	String id;
	String accountNum;
	int balance;
	
	User2() {
		this.accountNum = createeAccNum();
		this.balance = 0;
	}
	
	User2(int amount) {
		this.accountNum = createeAccNum();
		this.balance = amount;
	}
	
	protected String createeAccNum() {
		Random rand = new Random();
		String account = String.format(
				"%04d-%04d-%04d-%04d",
				rand.nextInt(9999)+1, 
				rand.nextInt(9999)+1, 
				rand.nextInt(9999)+1,
				rand.nextInt(9999)+1);
		return account;
	}
	
	void deposit(int amount) {
		this.balance+=amount;
	}
	
	void withdraw(int amount) {
		if (this.balance < amount) System.out.println("잔액이 부족합니다.");
		else this.balance-=amount;
	}
	
	void printAccInfo() {
		System.out.printf("계좌번호 : %s, 잔액 : %d\n", this.accountNum, this.balance);
	}
}

class UserEx2 extends User {
	
	UserEx2() {super();}
	
	UserEx2(int amount) {super(amount);}
	
	int creditLevel = 0;
	int depositCnt = 0;
	void deposit(int amount) {
		super.deposit(amount);
		this.depositCnt++;
		if (this.depositCnt%5 == 0) creditLevel++;
	}
	
	void withdraw(int amount) {
		if(this.balance < amount && this.creditLevel > 10) this.balance -= amount;
		else if(this.balance < amount && this.creditLevel <= 10) System.out.println("잔액이 부족합니다.");
		else balance -= amount;
	}
	
	void printAccInfo() {
		super.printAccInfo();
		System.out.printf("신용등급 : %d, 입금횟수 : %d\n",creditLevel, depositCnt );
	}
}

public class exBankre {
	public static void main(String[] args) {
		Random r = new Random();
		User2[] userList = new User2[5];
		
		for (int i=1; i<userList.length; i++) {
			userList[i] = new User2(r.nextInt(999999));
			userList[i].printAccInfo();
		}
		
		System.out.println();
		userList[1].deposit(10000);
		userList[1].printAccInfo();
		userList[2].withdraw(100000000);
		userList[2].printAccInfo();
		System.out.println();
		
		UserEx2 user01 = new UserEx2();
		user01.printAccInfo();
		
		for (int i=0; i<100; i++) {
			int money = r.nextInt(9999)+1;
			user01.deposit(money);
		}
		user01.printAccInfo();
		System.out.println();
		
		user01.withdraw(100000000);
		user01.printAccInfo();
	}
}
