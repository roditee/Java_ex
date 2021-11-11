package classArray;

import java.util.Scanner;

class Subject3re {
	String name;
	int score;
}

class Student3re {
	static int stdCnt = 0;	// 학생 수 = 객체의 수
	String name;
	Subject3re[] subjectArray;
	
	Student3re(String name) {
		this.name = name;
	}
	
	Student3re(String name, String subject) {
		int sbjNum = 0;
		this.name = name;
		this.subjectArray[sbjNum].name = subject;
		sbjNum++;
	}
}

public class exCA03re {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student3re [] stdList = new Student3re[3];
				
		while (true) {
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				if(Student3re.stdCnt == 3) System.out.println("더 이상 추가할 수 없습니다.");
				System.out.println("이름 입력");
				String name = scan.next();
				stdList[Student3re.stdCnt] = new Student3re(name);
				System.out.printf("[추가완료] 이름 : %s\n", stdList[Student3re.stdCnt].name);
				Student3re.stdCnt++;
				}
			else if (choice == 2) {
				System.out.println("이름 입력");
				String name = scan.next();
				System.out.println("과목 입력");
				String subject = scan.next();
				//과목 객체 생성? -> 3번 돌면서 3명의 학생 중 입력한 이름과 일치하는 객체에 과목 추가
				for (int i=0; i<stdList.length; i++) {
//					if (stdList[i].name == name) {
//						stdList[i] = new Student3re(name, subject);
//					}
				}
			}
			else if (choice == 3) {
				System.out.println("이름 입력");
				String name = scan.next();
				System.out.println("과목 입력");
				String subject = scan.next();
				System.out.println("성적 입력");
				String score = scan.next();
//				for (int i=0; i<stdList.length; i++) {
//					if (stdList[i].name == name && ) stdList[stdCnt] = new Student3re(name, subject);
//				}
				}
			else break;
		}//whlie
	}

}
