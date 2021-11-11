package classArray;

import java.util.Arrays;
import java.util.Random;

class Student1re {
	//속성
	int id;
	int score;
	
	//학번과 성적을 입력받는 메서드
	void setData(int id, int score) {
		this.id = id;
		this.score = score;
	}
	
	//속성을 출력할 수 있는 메서드 작성
	void printInfo() {
		System.out.printf("학번 : %d, 성적 : %d\n", this.id, this.score);
	}
}

public class exCA01re {

	public static void main(String[] args) {
		// 객체 배열(기본형 타입만 배열이 될 수 있는것은 아닙니다)
		// 학생 객체 5개를 담을 수 있는 배열
		Student1re[] studentArr = new Student1re[5];
		
		// 배열에 아직 객체는 들어있지 않습니다.
		// 객체를 담을 수 있는 메모리 공간만 확보된 상태.
		System.out.println(Arrays.toString(studentArr));
		
		// 첫번째 학생 == 배열의 0번 인덱스
		studentArr[0] = new Student1re();
		
		// 배열에는 첫 번째 학생의 객체가 만들어지게 됩니다. 
		System.out.println(Arrays.toString(studentArr));
		
		// 첫번째 학생은 배열의 0번 인덱스를 통해서 접근
		System.out.printf("학번: %d, 성적: %d\n", studentArr[0].id, studentArr[0].score);
		
		// 5명의 학생 정보를 담을 수 있도록 객체를 배열에 만들어 봅시다. 
		for (int i=0; i<studentArr.length; i++) {
			studentArr[i] = new Student1re();
		}
		System.out.println(Arrays.toString(studentArr));
		
		// 학번을 입력(1001 ~ 1005)
		int id = 1001;
		for (Student1re student : studentArr) {
			student.id = id;
			id++;
		}
		
		// 입력된 학번을 확인
		for (Student1re student : studentArr) {
			System.out.printf("학번: %d, 성적: %d\n", student.id, student.score);
		}
		
		// 학생마다 성적을 랜덤하게 생성해서 입력
		Random rand = new Random();
		for (Student1re student : studentArr) {
			student.score = rand.nextInt(100)+1;
			System.out.printf("학번: %d, 성적: %d\n", student.id, student.score);
		}
		
		//만들어진 메서드를 통해서 학번과 점수 채워보기
		//학번은 1001 ~ 1005 순차 증가
		//점수 랜덤 생성
		Random r = new Random();
		id = 1001;
		int score;
		
		Student1re[] studentArr2 = new Student1re[5];
		for (int i=0; i<studentArr2.length; i++) {
			studentArr2[i] = new Student1re();
			score = r.nextInt(100)+1;
			studentArr2[i].setData(id, score);
			studentArr2[i].printInfo();
			id++;
		}
		//for each 사용
		id = 1001;
		Student1re[] studentArr3 = new Student1re[5];
		for (Student1re student : studentArr3) {
			student = new Student1re();
			score = r.nextInt(100)+1;
			student.setData(id, score);
			student.printInfo();
			id++;
		}
	}

}
