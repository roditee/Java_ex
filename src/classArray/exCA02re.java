package classArray;

import java.util.Arrays;
import java.util.Random;

//has-a
//과목별 점수
//과목 1개에 대한 정보 (과목이름과 점수)
class Subject2re {
	String name;
	int score;
}

class Student2re {
	String name;
	
	//여러 과목에 대한 점수를 배열로 유지
	Subject2re[] subjectArray2;
	
	//생성자 정의 및 오버로딩
	Student2re() {}
	Student2re(String name) {
		this.name = name;
		this.subjectArray2 = new Subject2re[3];
	}
}

public class exCA02re {
	public static void main(String[] args) {
		//학생 3명의 정보를 담을 수 있는 배열을 생성
		Student2re[] studentArr2 = new Student2re[3];
		
		//학생 정보를 담을 수 있는 객체 3개를 생성해서 배열에 담아보기
//		for (Student2re student : studentArr2) {
//			student = new Student2re();
//			System.out.println(student);
//		}
		//for문 사용
		for (int i=0; i<studentArr2.length; i++) {
			studentArr2[i] = new Student2re();
		}
		System.out.println(Arrays.toString(studentArr2));
		
		
		//학생 정보를 담을 수 있는 객체 3개를 생성해서 배열에 담아보기
		//학생 1명당 객체 1
		//생성자의 활용
		//학생 객체가 생성될 때 이름을 초기화
		studentArr2[0] = new Student2re("홍길동");
		studentArr2[1] = new Student2re("이순신");
		studentArr2[2] = new Student2re("장발장");
		for (Student2re stu : studentArr2) {
			System.out.printf("학생 : %s\n", stu.name);
		}
		
		//점수 추가
		//홍길동 학생에 대해서 국어: 50, 영어: 60, 수학: 90 추가
		//순서[1] 홍길동 학생의 객체 꺼내오기
		Student2re jdg = null;;
		for (Student2re stu:studentArr2) {
			if (stu.name.equals("홍길동")) {
				jdg = stu;
				break;
			}
		}
		System.out.printf("학생 : %s\n", jdg.name);
		System.out.printf("sbj arr : %s\n", Arrays.toString(jdg.subjectArray2));
		
		//과목을 담을 수 있는 객체 생성
		for (int i=0; i<jdg.subjectArray2.length; i++) {
			jdg.subjectArray2[i] = new Subject2re();
		}
		System.out.printf("sbj arr : %s\n", Arrays.toString(jdg.subjectArray2));
		
		//과목별 점수 저장
		jdg.subjectArray2[0].name = "국어";
		jdg.subjectArray2[0].score = 50;
		jdg.subjectArray2[1].name = "영어";
		jdg.subjectArray2[1].score = 60;
		jdg.subjectArray2[2].name = "수학";
		jdg.subjectArray2[2].score = 90;
		
		for (Subject2re sub:jdg.subjectArray2) {
			System.out.printf("과목 : %s, 점수 : %d\n", sub.name, sub.score );
		}
	}
}
