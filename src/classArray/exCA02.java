package classArray;

import java.util.Arrays;

//has-a
//과목별 점수
//과목 1개에 대한 정보 (과목이름과 점수)
class Subject2 {
	String name;
	int score;
}

class Student2 {
	String name;
	
	//여러 과목에 대한 점수를 배열로 유지
	Subject2[] subjectArray;
	
	//생성자 정의
	//특징 - 리턴타입 없음. 클래스의 이름과 동일
	//이미 눈에 안 보이는 디폴트 생성자가 존재하지만, 생성자를 정의해주면 디폴트 생성자는 사라진다.
	//생성자 오버로딩
	Student2() {}
	Student2(String name) {
		this.name = name;
		this.subjectArray = new Subject2[3];
	}
}
public class exCA02 {
	public static void main(String[] args) {
		
		//학생 3명의 정보를 담을 수 있는 배열을 생성
		Student2[] arr = new Student2[3];
		
		//학생 정보를 담을 수 있는 객체 3개를 생성해서 배열에 담아보기
		for (int i=0; i<arr.length; i++) {
			arr[i] = new Student2();
		}
		System.out.println(Arrays.toString(arr));
		
		//학생 정보를 담을 수 있는 객체 3개를 생성해서 배열에 담아보기
		//학생 1명당 객체 1
		//생성자의 활용
		//학생 객체가 생성될 때 이름을 초기화
		arr[0] = new Student2("장동건");
		arr[1] = new Student2("원빈");
		arr[2] = new Student2("이정재");
		for (Student2 stu:arr) {
			System.out.printf("학생 : %s\n", stu.name);
		}
		
		//점수 추가
		//장동건 학생에 대해서 국어: 50, 영어: 60, 수학: 90 추가
		//순서[1] 장동건 학생의 객체 꺼내오기
		Student2 jang = null;
		for (Student2 stu:arr) {
			if (stu.name.equals("장동건")) {
				jang = stu;
				break;
			}
		}
		System.out.printf("학생 : %s\n", jang.name);
		System.out.printf("sbj arr : %s\n", Arrays.toString(jang.subjectArray));
		
		//과목을 담을 수 있는 객체 생성
		for (int i=0; i<jang.subjectArray.length; i++) {
			jang.subjectArray[i] = new Subject2();
		}
		System.out.printf("sbj arr : %s\n", Arrays.toString(jang.subjectArray));
		
		//과목별 점수 저장
		jang.subjectArray[0].name = "국어";
		jang.subjectArray[0].score = 50;
		jang.subjectArray[1].name = "영어";
		jang.subjectArray[1].score = 60;
		jang.subjectArray[2].name = "수학";
		jang.subjectArray[2].score = 90;
		
		for (Subject2 sub:jang.subjectArray) {
			System.out.printf("과목 : %s, 점수 : %d\n", sub.name, sub.score );
		}
		//총 3과목의 점수를 입력받기 위해서 미리 배열 생성
		//학생 객체별로 점수를 저장할 수 있는 메모리 생성
		//객체 하나씩 꺼내와서 처리
//		for (Student2 student : arr) {
//			student.subjectArray
//		}
	}

}
