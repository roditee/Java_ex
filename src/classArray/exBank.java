package classArray;

import java.util.Random;

//������ �𵨷� Ŭ���� ����
//User Ŭ���� (����� id, ����������ü)
//���� Ŭ���� (���¹�ȣ, �ܾ�)

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
	
	//�� ���� ���� ���¸� ���� �� �ֵ��� �ϸ� �迭�� ����Ͽ� �̷��Ե� ����������
	//String id;
	//String[] AccountNumber;
	//int[] balance;
	//� ���¿� �ܾ��� �� ���Ҵ����� �ε����� ���ؼ��ۿ� ������ �� ����
	
	//�� ��ü�� ������ ������ �ڵ����� ���� �ο��Ǵ� ������ ����
	User() {
		this.accountNumber = createeAccNum();
		this.balance = 0;
	}
	
	//������ �� �Աݾ��� �ִ� ��츦 ���� ���� �߰�
	//������ �����ε�
	//�Աݾ��� ������ 0, �Աݾ��� ������ �Աݾ� ���޹޾Ƽ� �ʱ�ȭ
	User (int amount) {
		accountNumber = createeAccNum();
		balance = amount;
	}
	
	//�θ��ڽİ����� ��� �����ϵ���
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
	
	//����� ��� �߰� (�Ա� deposit / ��� withdraw)
	void deposit(int amount) {
		this.balance+=amount;
	}
	
	void withdraw(int amount) {
		if (this.balance < amount) System.out.println("�ܾ��� �����մϴ�.");
		else this.balance-=amount;
	}
	
	//������ ��� - ���� ���� ���¹�ȣ�� �ܾ� ����ϴ� �޼���
	void printAccInfo() {
		System.out.printf("���¹�ȣ : %s, �ܾ� : %d\n", this.accountNumber, this.balance);
	}
}

//User Ŭ������ ��ӹ޾� ����� Ȯ�� -> �ſ���� ��� �߰�
class UserEx extends User {
	//�ܾ��� �����ص� ����� �����ϵ���
	
	UserEx() { //������
		super();
	}
	
	//������ �����ε�
	UserEx(int amount) {
		super(amount);
	}
	
	//�Ա� Ƚ���� ���� �ſ����� �÷��ֵ���
	//deposit �޼��� �������̵�
	int creditLevel = 0;
	int depositCnt = 0;
	void deposit(int amount) {
		super.deposit(amount);
		this.depositCnt++;
		if (this.depositCnt%5 == 0) creditLevel++;
	}
	
	//withdraw �޼��� �������̵� (������)
	void withdraw(int amount) {
		if(this.balance < amount && this.creditLevel > 10) this.balance -= amount;
		else if(this.balance < amount && this.creditLevel <= 10) System.out.println("�ܾ��� �����մϴ�.");
		else balance -= amount;
	}
	
	void printAccInfo() {
		super.printAccInfo();
		System.out.printf("�ſ��� : %d, �Ա�Ƚ�� : %d\n",creditLevel, depositCnt );
	}
}

public class exBank {
	public static void main(String[] args) {
		//���� �þ���� ������ �þ -> �迭�� ����غ���
		//�� ��ü�� ������ �� �ִ� �޸� ���� Ȯ��
		//(�����Ϸ��� ������ �� + 1)��ŭ �޸� �����ϰ� 0���� ������ -> �ε��� �Ű� �� ���� �����ϱ� ���ϱ� ���� �ļ�
		Random rand = new Random();
		User[] userList = new User[5];
		
		//����
		for (int i=1; i<userList.length; i++) {
			userList[i] = new User(rand.nextInt(999999));
			userList[i].printAccInfo();
		}
		
		//ù ��° ���� �Ա�, �� ��° ���� ���
		userList[1].deposit(10000);
		userList[1].printAccInfo();
		userList[2].withdraw(100000000);
		userList[2].printAccInfo();
		
		//Ȯ��� �� ��ü ����
		//�����ڴ� ��ӵ��� �ʽ��ϴ� -> UserEx�� �⺻ �����ڰ� ���۵ǰ� ����.
		//���� UserEx user01 = new UserEx(10000);�� ���� �ڵ�� �Ұ��� (���԰� ���ÿ� �Աݾ� ����)
		//-> UserEx Ŭ������ ������ ���� + super ����Ͽ� �θ�Ŭ���� ��� �����ϸ� ����
		UserEx user01 = new UserEx();
		user01.printAccInfo();
		
		//������ Ȯ�ο� -> �Ա� ���� �Է��ϱ� �������ϱ� 100�� �Աݽ�Ű��
		for (int i=0; i<100; i++) {
			int money = rand.nextInt(9999)+1;
			user01.deposit(money);
		}
		
		//���̳ʽ� ����
		user01.withdraw(100000);
		user01.printAccInfo();
	}

}
