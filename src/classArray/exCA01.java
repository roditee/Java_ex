package classArray;

import java.util.Arrays;
import java.util.Random;

class Student1 {
	
	// 속성
	int hakbun;
	int score;
	
	//학번과 성적을 입력받는 메서드
	void setData(int hakbun, int score) {
		this.hakbun = hakbun;
		this.score = score;
	}
	
	//속성을 출력할 수 있는 메서드를 작성
	void printData() {
		System.out.printf("학번 : %d 성적 : %d\n", this.hakbun, this.score);
	}
}

public class exCA01 {

	public static void main(String[] args) {
		// 객체 배열(기본형 타입만 배열이 될 수 있는것은 아닙니다)
				// 학생 객체 5개를 담을 수 있는 배열
				Student1 [] studentArray = new Student1[5];
				
				// 배열에 아직 객체는 들어있지 않습니다.
				// 객체를 담을 수 있는 메모리 공간만 확보
				System.out.println(Arrays.toString(studentArray));
				
				// 첫번째 학생 == 배열의 0번 인덱스
				studentArray[0] = new Student1();
				
				// 배열에는 첫 번째 학생의 객체가 만들어지게 됩니다. 
				System.out.println(Arrays.toString(studentArray));
				
				// 첫번째 학생은 배열의 0번 인덱스를 통해서 접근
				System.out.printf("학번: %d, 성적: %d\n", studentArray[0].hakbun, studentArray[0].score);
				
				// 5명의 학생 정보를 담을 수 있도록 객체를 배열에 만들어 봅시다. 
				for( int i = 1; i < studentArray.length; i++ ) {
					studentArray[i] = new Student1();
				}
				System.out.println(Arrays.toString(studentArray));
				
//				// 학번을 입력(1001 ~ 1005)
//				int hakbun = 1001;
//				
//				for( Student1 student: studentArray) {
//					student.hakbun = hakbun;
//					hakbun++;
//				}
//				
//				// 입력된 학번을 확인
//				for( Student1 student: studentArray) {
//					System.out.printf("학번: %d, 성적: %d\n", student.hakbun, student.score);
//				}
//				
//				// 학생마다 성적을 랜덤하게 생성해서 입력
//				Random rand = new Random();
//				for( Student1 student: studentArray) {
//					student.score = rand.nextInt(100)+1;
//					System.out.printf("학번: %d, 성적: %d\n", student.hakbun, student.score);
//				}
				
				//만들어진 메서드를 통해서 학번과 점수 채워보기
				//학번은 1001 ~ 1005 순차적으로 증가
				//점수는 랜덤하게 생성해서 전달
				Random r = new Random();
				int hakbun = 1001;
				int score;
				for (Student1 student : studentArray) {
					score = r.nextInt(100)+1;
					student.setData(hakbun, score);
					student.printData();
					hakbun++;
					
				}
	}
}
