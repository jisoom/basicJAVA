package e_oop.score;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		Student[] students = new Student[10]; //학생 10명 배열
		String[] subjects = {"국어" , "영어", "수학"}; //과목 3개 배열
		
		//과목이름 출력
		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		//합계, 평균, 석차 출력
		System.out.println("\t" +"합계" + "\t" + "평균" + "\t" +"석차");
		
		
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			students[i] = student; //students배열에 student 넣어서 포문 돌리면 10명의 학생이 만들어짐
			
			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int) (Math.random() * 101);
			student.eng = (int) (Math.random() * 101);
			student.math = (int) (Math.random() * 101);
		}
		//성적처리 프로그램을 완성해주세요.
		
		//합계, 평균
		for (int i = 0; i < students.length; i++) {
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round(students[i].sum / 3.0 *100)/100.0;
		}


		//rank
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if(students[i].sum<students[j].sum){
					students[i].rank++;
				}
			}
		}
		
		//석차순으로 정렬
		for(int i = 0; i < students.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < students.length; j++){
				if(students[j].rank <students[min].rank){
					min = j;
				}
			}
			Student temp = students[min];
			students[min] = students[i];
			students[i] = temp;
		}
//			int temp = students[i].kor;
//			students[i].kor = students[min].kor;
//			students[min].kor = temp;
//			
//			int temp2 = students[i].eng;
//			students[i].eng = students[min].eng;
//			students[min].eng = temp2;
//			
//			int temp3 = students[i].math;
//			students[i].math = students[min].math;
//			students[min].math = temp3;
//			
//			int temp4 = students[i].sum;
//			students[i].sum = students[min].sum;
//			students[min].sum = temp4;
//
//			double temp5 = students[i].avg;
//			students[i].avg = students[min].avg;
//			students[min].avg = temp5;
//
//			int temp6 = students[i].rank;
//			students[i].rank = students[min].rank;
//			students[min].rank = temp6;
//			
//			String temp7 = students[i].name;
//			students[i].name = students[min].name;
//			students[min].name = temp7;
			

		int[]subSum = new int[3];
		for (int i = 0; i < students.length; i++) {
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}
		
		double[]subAvg = new double[3];
		for (int i = 0; i < subAvg.length; i++) {
			subAvg[i] = Math.round((double)subSum[i] / students.length *100)/100.0;
		}

		//name, 점수, 합계, 평균, 석차 출력
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].name);
			System.out.println("\t"+students[i].kor + "\t" +students[i].eng + "\t" + students[i].math + "\t" +
			students[i].sum+ "\t"+ students[i].avg + "\t" + students[i].rank);	
		}

		System.out.print("과목합계");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print("\t" + subSum[i]);
		}
		System.out.print("\n과목평균");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print("\t" + subAvg[i]);
		}

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		
		
		
		



	}

}
