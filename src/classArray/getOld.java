package classArray;

import java.util.Scanner;

class PersonOld{
	private int age;
	
	public PersonOld(int initalAge) {
		this.age = initalAge;
	}
	
	public void amIOld() {
		if (this.age<10) System.out.println("�����");
		else if (this.age>=10 && this.age<20) System.out.println("10�뱺��");
		else if (this.age>=20) System.out.println("���̰� �����ó׿�");
	}
	
	public void yearPasses() {
		this.age++;
	}
}
public class getOld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0; i<T; i++) {
			int age = sc.nextInt();
			PersonOld p = new PersonOld(age);
			p.amIOld();
			for (int j=0; j<3; j++) {
				p.yearPasses();
			}//3�� ����
			p.amIOld();
			System.out.println();
		}
	}
}
