package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입
		 * -데이터의 최종 진화 형태이다.(기본형 -> 배열 -> 클래스)
		 * -서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * -변수와 메서드로 구성할 수 있다.
		 */

		//기본형
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		//배열
		int[]scores;
		int sum2;
		double avg2;
		String name2;
		
		//학생1
		//클래스가지고 사용하기
		Student student; //변수 선언 (클래스이름을 타입으로      변수)
		student = new Student(); //초기화(객체 생성/인스턴스화) // 클래스의 내용이 메모리에 올라가면 객체임
		student.kor = 50;
		student.eng = 60;
		student.math = 40;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum/3.0;
		student.name = "심선주";
		
		System.out.println(student.name + "/" + student.sum + "/" + student.avg);
		
		//학생2
		Student s2 = new Student();
		
		s2.kor = (int)(Math.random()*101);
		s2.eng = (int)(Math.random()*101);
		s2.math = (int)(Math.random()*101);
		
		s2.sum = s2.kor + s2.eng + s2.math;
		s2.avg = s2.sum / 3.0;
		s2.name = "김승섭";
		
		System.out.println(s2.name + "/" + s2.sum + "/" + s2.avg);
		
	}

}

class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
}
