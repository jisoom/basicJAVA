package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 비트 연산자
		 * - |, &, ^, ~, <<, >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * - .(참조 연산자) : 특정 범위 내에 속해있는 멤버를 지칭할 때 사용한다.
		 * - (type) :형변환
		 * - ? (삼항 연산자) ==> 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 */
		
		//---------------------------비트연산자-----------------------------------
		//1byte : 01010101 0또는 1 하나를 비트라고 함 이 하나하나를 가지고 연산을 하는 연산자가 비트연산자
		System.out.println(10 | 15); // | : 둘다 0인 경우 0, 그 외 1
		//10 : 00001010
		//15 : 00001111
		//     00001111 => 15
		
		//---------------------------------참조연산자-------------------------------------------
		//어떤 특정 범위내에 속해있는 것을 지칭할 때 사용함
		// System.out.println에서 .이 참조 연산자 System 클래스 안에 있는 out변수에 접근하고 싶을 때 System.out으로 씀
		
		//------------------------------삼항연산자----------------------------------------------
		//조건식의 결과에 따라서 둘중 하나가 실행됨
		int x = 10;
		int y =20;
		int result = x < y ? x : y; //true -> x실행, false -> y실행 ==> int result = x;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 3;  // 1이 아닌 이외의 숫자를 넣으면 다 여자가 나옴 ==>잘못됨
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은  " + gender + " 입니다.");
		
		//1이 아닌 이외의 숫자를 넣으면 확인불가되도록 함
		gender = regNo ==1 ? "남자" : (regNo == 2 ? "여자": "확인불가");
		System.out.println("당신의 성별은  " + gender + " 입니다.");
		
		//삼항연산자 문제
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner s = new Scanner(System.in); 
//		System.out.print("숫자 1>");
//		int a = Integer.parseInt(s.nextLine());
//		System.out.print("숫자 2>");
//		int b = Integer.parseInt(s.nextLine());
//		
////		int big = a > b ? a : b;
////		System.out.println(big);
//		System.out.println(a > b ? a : b);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 확인불가를 출력해주세요.
		System.out.print("숫자>");
		int num1 = Integer.parseInt(s.nextLine());
		System.out.println(num1 == 1 || num1 ==3? "남자" : num1 == 2 || num1 == 4? "여자" : "확인불가"); //논리연산자는 양쪽에 boolean타입만 올수 있음 따라서, num == 1 || 3은 불가능함
	}

}
