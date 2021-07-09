package test;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요. (계산기 프로그램)
		// 숫자 두개    연산자   (+,-,*,/,%) ==>결과
		//영타 연습 영타200타이상
		
		//변수 선언
		double num1, num2, plus, minus, multiple, division, remaind;
		String Operator;
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1>");
		num1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("연산자>");
		Operator = sc.nextLine();
		
		System.out.print("숫자2>");
		num2 = Double.parseDouble(sc.nextLine());
		
		plus = num1 + num2;
		minus = num1 - num2;
		multiple = num1 * num2;
		division = num1 / num2;
		remaind = num1 % num2;
		
		plus = Math.round(plus * 10) /10.0;
		minus = Math.round(minus * 10) /10.0;
		multiple = Math.round(multiple * 10) /10.0;
		division = Math.round(division * 10) /10.0;
		remaind = Math.round(remaind * 10) /10.0;
		
		System.out.println(Operator.equals("+")? "연산결과 :" +plus : Operator.equals("-")? "연산결과 :" +minus : Operator.equals("*")? 
				"연산결과 :" +multiple : Operator.equals("/")? "연산결과 :" +division : "연산결과 :" +remaind);
		
		
		
		
		
		
	}

}
