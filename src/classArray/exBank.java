package classArray;

import java.util.Random;

//은행을 모델로 클래스 설계
//User 클래스 (사용자 id, 계좌정보객체)
//계좌 클래스 (계좌번호, 잔액)

//class Account {
//	String accNum;
//	int balance;
//}

class User {
//	int userId;
//	Account userAcc = new Account();
	String id;
	String accountNumber;
	int balance;
	
	//한 고객이 여러 계좌를 가질 수 있도록 하면 배열을 사용하여 이렇게도 가능하지만
	//String id;
	//String[] AccountNumber;
	//int[] balance;
	//어떤 계좌에 잔액이 얼마 남았는지를 인덱스를 통해서밖에 접근할 수 었음
	
	//고객 객체가 생성될 때마다 자동으로 계좌 부여되는 생성자 생성
	User() {
		this.accountNumber = createeAccNum();
		this.balance = 0;
	}
	
	//가입할 때 입금액이 있는 경우를 위한 생성 추가
	//생성자 오버로딩
	//입금액이 없으면 0, 입금액이 있으면 입금액 전달받아서 초기화
	User (int amount) {
		accountNumber = createeAccNum();
		balance = amount;
	}
	
	//부모자식간에만 상속 가능하도록
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
	
	//입출금 기능 추가 (입금 deposit / 출금 withdraw)
	void deposit(int amount) {
		this.balance+=amount;
	}
	
	void withdraw(int amount) {
		if (this.balance < amount) System.out.println("잔액이 부족합니다.");
		else this.balance-=amount;
	}
	
	//고객정보 출력 - 현재 고객의 계좌번호와 잔액 출력하는 메서드
	void printAccInfo() {
		System.out.printf("계좌번호 : %s, 잔액 : %d\n", this.accountNumber, this.balance);
	}
}

//User 클래스를 상속받아 기능을 확장 -> 신용대출 기능 추가
class UserEx extends User {
	//잔액이 부족해도 출금이 가능하도록
	
	UserEx() { //생성자
		super();
	}
	
	//생성자 오버로딩
	UserEx(int amount) {
		super(amount);
	}
	
	//입금 횟수에 따라서 신용등급을 올려주도록
	//deposit 메서드 오버라이딩
	int creditLevel = 0;
	int depositCnt = 0;
	void deposit(int amount) {
		super.deposit(amount);
		this.depositCnt++;
		if (this.depositCnt%5 == 0) creditLevel++;
	}
	
	//withdraw 메서드 오버라이딩 (재정의)
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

public class exBank {
	public static void main(String[] args) {
		//고객이 늘어날수록 변수도 늘어남 -> 배열을 사용해보자
		//고객 객체를 저장할 수 있는 메모리 공간 확보
		//(저장하려는 데이터 수 + 1)만큼 메모리 생성하고 0번은 버리기 -> 인덱스 신경 안 쓰고 선언하기 편리하기 위한 꼼수
		Random rand = new Random();
		User[] userList = new User[5];
		
		//가입
		for (int i=1; i<userList.length; i++) {
			userList[i] = new User(rand.nextInt(999999));
			userList[i].printAccInfo();
		}
		
		//첫 번째 고객의 입금, 두 번째 고객의 출금
		userList[1].deposit(10000);
		userList[1].printAccInfo();
		userList[2].withdraw(100000000);
		userList[2].printAccInfo();
		
		//확장된 고객 객체 생성
		//생성자는 상속되지 않습니다 -> UserEx는 기본 생성자가 동작되고 있음.
		//따라서 UserEx user01 = new UserEx(10000);과 같은 코드는 불가능 (가입과 동시에 입금액 설정)
		//-> UserEx 클래스에 생성자 생성 + super 사용하여 부모클래스 기능 접근하면 가능
		UserEx user01 = new UserEx();
		user01.printAccInfo();
		
		//대출기능 확인용 -> 입금 직접 입력하기 귀찮으니까 100번 입금시키기
		for (int i=0; i<100; i++) {
			int money = rand.nextInt(9999)+1;
			user01.deposit(money);
		}
		
		//마이너스 인출
		user01.withdraw(100000);
		user01.printAccInfo();
	}

}
