package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * -if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다. //조건식에는 비교하는 내용이 나오게 됨
		 * -else if(조건식){} : 다수의 조건이 필요할 때 if뒤에 추가한다. 
		 * -else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다. //가장 마지막에 붙음 위의 조건식이 하나도 만족하지 않을 때 실행함
		 */
		
		
		int a = 1;
		if(a ==1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 0){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		//조건에 따라서 수행하고 말고를 결정함

		if(a == 1){
			System.out.println("a가 1인 경우에 하고 싶은 것");
		}else if( a == 2){
			System.out.println("a가 2인 경우에 하고 싶은 것");
		}else if( a == 3){
			System.out.println("a가 3인 경우에 하고 싶은 것");
		}else {
				System.out.println("이외의 경우에 하고 싶은 것"); 
		}
		
		//if문은 실행했을 때 무조건 조건들중에 딱 하나만 실행됨, else가 없는 경우 아무것도 실행안될 수도 있음
		//전부 true여도 맨위에 true 하나만 실행하고 빠져나옴
		
		if(a < 10){
			System.out.println("a가 10보다 작다.");
		}else if(a < 20){
			System.out.println("a가 20보다 작다."); 
		} //else if ==> if로 하면 둘다 실행됨 (주의)
		
		int score = 70;
		// 점수가 60점 이상이면 합격, 그렇지 않으면 불합격이라고 출력해주세요.
		if(score >=60){
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//점수에 등급을 부여하는 프로그램
		score = 80;
		String grade = null;
		
		if (score >= 90){
			grade = "A";
		}else if (score >= 80){
			grade = "B";
		}else if (score >=70){
			grade = "C";
		}else if (score >=60){
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " +grade + "입니다.");
		
		/*
		 * 기본값 : 직접 초기화하지 않았을 때 초기화 되는 값
		 * 메서드 밖에서 만드는 변수는 초기화하지않아도 기본값으로 초기화됨
		 * ex)
		 * -참조형 타입 : null
		 * -boolean : false
		 * -char : ' '(0)
		 * -이외의 나머지 타입 : 0
		 */
	
	
		score = 90;
		grade = null; //값이 없음 null값
		
		//정렬 : Ctrl + shift +f
		
		if (score >= 90) {
			grade = "A";

			if (score >= 97) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";

			if (score >= 87) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";

			if (score >= 77) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (score >= 60) {
			grade = "D";

			if (score >= 67) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");		
		
		
		/*
		 * switch문
		 * -switch(int/String){ case 1: break;} //if문은 조건식에 오는 게 boolean타입이었지만 switch문은 int, String이 옴
		 * -조건식의 결과는 정수와 문자열만 (JDK 1.7부터 문자열 허용) 허용한다.
		 * -조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * - break가 switch문을 벗어나게한다.
		 */
		a = 10; // int타입 변수

		switch (a) {
		case 10:
			System.out.println("a가 10인 경우에 하고싶은 것");
			break;
		case 20:
			System.out.println("a가 20인 경우에 하고 싶은 것");
			break;
		default:
			System.out.println("이외의 경우에 하고 싶은 것");
		}  //break를 만날때까지 실행
		
		//switch문 주의사항 : break가 없을 경우 계속 실행 됨
		//switch문 장점 : 똑같을 경우 if문보다 실행이 빠름 but, if문 사용을 많이 함
		
		String b = "a";
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것 ");  //  \" a \" : 쌍따옴표는 열고 닫는 역할, 문자열 안에 쌍따옴표를 넣으려면 \" \" 사용
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것 ");
			break;
		default :
			System.out.println("이외의 경우에 하고싶은 것");
		}
		
		
		//월에 해당하는 계절을 출력
		int month = 1;
		String season = null;
		
		switch(month){
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month +"월은 " +season +"입니다.");
		
		score = 80;
		grade = null;
		
		switch(score / 10){
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println(score + "점에 대한 등급은 "+grade+"입니다.");
		
		//쓰레기값 : 메모리의 빈공간에 변수를 만들고 쓰지 않으면 빈공간인게 아니라 남아 있음  ==> 누가 쓰다가 이제는 더이상 쓰지 않는 공간 
		//int x;
		//System.out.println(x); //초기화를 하지 않고는 변수를 사용할 수 없음
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		Scanner sc = new Scanner(System.in);
		
//		int num1;
//		System.out.println("숫자 입력 >");
//		num1 = Integer.parseInt(sc.nextLine());
//		
//		if(num1 == 0){
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("0이 아닙니다.");
//		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
//		System.out.println("숫자 입력 >");
//		num1 = Integer.parseInt(sc.nextLine());
		
//		if(num1 % 2 == 0){
//			System.out.println("짝수 입니다.");
//		}else{
//			System.out.println("홀수 입니다.");
//		}
		
//		switch(num1 % 2){
//		case 0:
//			System.out.println("짝수 입니다.");
//			break;
//		case 1:
//			System.out.println("홀수 입니다.");
//			break;
//		}
		
		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.

//		System.out.println("국어 >");
//		int kor = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("영어 >");
//		int eng = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("수학 >");
//		int math = Integer.parseInt(sc.nextLine());
//		
//		int sum = kor + eng + math;
//		double avg = Math.round(sum / 3.0 * 100) / 100.0;
//		
//		grade = null;
//		
//		if (avg >= 90) {
//			grade = "A";
//
//			if (avg >= 97) {
//				grade += "+";
//			} else if (avg <= 93) {
//				grade += "-";
//			}
//		} else if (avg >= 80) {
//			grade = "B";
//
//			if (avg >= 87) {
//				grade += "+";
//			} else if (avg <= 83) {
//				grade += "-";
//			}
//		} else if (avg >= 70) {
//			grade = "C";
//
//			if (avg >= 77) {
//				grade += "+";
//			} else if (avg <= 73) {
//				grade += "-";
//			}
//		} else if (avg >= 60) {
//			grade = "D";
//
//			if (avg >= 67) {
//				grade += "+";
//			} else if (avg <= 63) {
//				grade += "-";
//			}
//		} else {
//			grade = "F";
//		}
//		
//		System.out.println("총점 : " + sum + " 평균 : " + avg + " 등급 : " + grade);
		
		//1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
//		int x = (int)(Math.random() * 100) + 1;
//		int y = (int)(Math.random() * 100) + 1;
//		int z = (int)(Math.random() * 100) + 1;
//		
//		if(x > y){
//			int t = x;
//			x = y;
//			y = t;
//		}
//		if(x > z){
//			int t = x;
//			x = z;
//			z = t;
//		}
//		if (y > z){
//			int t = y;
//			y = z;
//			z = t;
//		}
//		System.out.println(x + " < " + y + " < " + z);
		
		
		int x = (int)(Math.random()* 100)+1;
		int y = (int)(Math.random()* 100)+1;
		int z = (int)(Math.random()* 100)+1;
		
		if(x > y){
			int t = x;
			x = y;
			y = t;
		}
		if(x > z){
			int t = x;
			x = z;
			z = t;
		}
		if(y > z){
			int t = y;
			y = z;
			z = t;
		}
		System.out.println(x + " " + y +" " + z);
	}
	



}