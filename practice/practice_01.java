package practice;

import java.util.Scanner;

public class practice_01 {

	public static void main(String[] args) {
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
//		int a = 10 + 2;
//		int b = 10 - 2;
//		int c = 10 * 2;
//		int d = 10 / 2;
//		int e = 10 % 2;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
//		int result = 10;
//				//result = result + 10;
//
//		result += 10;
//		System.out.println(result);
//				
//				//result = result % 5;
//		result %= 5;
//		System.out.println(result);
//				
//				//result = result -2 *3;
//		result -= 6;
//		System.out.println(result);

		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
//		//1. 123456 +654321
//		long result = 123456 + 654321;
//		System.out.println(result);
//		
//		//2. 1번의 결과 값 * 123456
//		result *=123456;
//		System.out.println(result);
//		
//		//3. 2번의 결과값 / 123456
//		result /=123456;
//		System.out.println(result);
//		
//		//4. 3번의 결과값 - 654321
//		result -=654321;
//		System.out.println(result);
//		//5. 4번의 결과값  % 123456
//		result %=123456;
//		System.out.println(result);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 출력해주세요.
//		int a, b, c, sum;
//		double avg;
//		a = 5;
//		b = 10;
//		c = 3;
//		sum = a + b +c;
//		System.out.println(sum);
//		avg = sum /3.0;
//		System.out.println(avg);
		
		
		//반올림
//		double result = 10.676;
//		result = Math.round(result * 100)/100.0;
//		System.out.println(result);
		
		//1~100까지의 수 랜덤으로 나타내기
//		int random = (int)(Math.random() * 100) +1 ;
//		System.out.println(random);
		
		
		//다음의 문장들을 코드로 작성해주세요.

		//1. x는 y보다 작거나 같다.
//		int x, y;
//		boolean result;
//		x = 10;
//		y = 20;
//		result = x <= y;
//		System.out.println(result);
//		
//		//2. x + 5와  y는 같다.
//		result = x + 5 == y;
//		System.out.println(result);
//
//		//3. y는 홀수이다.
//		result = y % 2 == 1;
//		System.out.println(result);
//
//		//4. "기본형" 과 "참조형" 은 다르다.
//		result = !"기본형".equals("참조형");
//		System.out.println(result);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
//		int x, y;
//		x=10;
//		y=20;
//		boolean result;
//		result = x > y && x < 10;
//		System.out.println(result);
//		
//		//2. x가 짝수이고 y보다 작거나 같다.
//		result = x % 2 == 0 && x <= y;
//		System.out.println(result);
//
//		//3. x가 3의 배수이거나 5의 배수이다.
//		result = x % 3 ==0 || x % 5 ==0;
//		System.out.println(result);
		
		//삼항연산자 문제
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 1 >");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("숫자 2 >");
//		int b = Integer.parseInt(sc.nextLine());
//		int result = a > b ? a : b;
//		System.out.println(result);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 확인불가를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1 >");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println(a ==1 || a==3 ? "남자" : a == 2 || a == 4 ? "여자" : "확인불가");
		



	}

}
