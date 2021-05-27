package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 * - <, >, <=, >=, ==, !=
		 * -문자열 비교 : equals()
		 */

		int x = 10;
		int y = 20;
		boolean b = x < y; //비교연산을 하면 boolean 타입이 됨
		System.out.println(b); //true
		
		b = x <= y - 15; //비교 연산과 산술 연산이 한 문장 안에 같이 있음 ==> 산술연산이 먼저 계산됨 그 후, 비교연산 수행됨
		
		String str1 = "abc"; //String 참조형 타입 ==> 참조형 타입은 값을 변수에 저장하는 것이 아니라 변수 밖에 값을 저장하고 값이 저장된 위치(주소)를 변수에 저장함
		String str2 = "abc";
		
		b = str1 == str2; //값이 저장된 주소를 비교하고 있는 것임 (문자열의 내용이 아닌 주소가 같은지 비교)
		System.out.println(b); //true나옴
		b = str1.equals(str2); //str1. ==> equals()함 ==> 비교할 문자열 넣음
		System.out.println(b); //문자열 내용 같은지 비교한 것임
		b = !str1.equals(str2); //문자열 내용 다른지 비교한 것    앞에 ! 붙여 주면 결과를 반대로 바꿈 true -> false  
		System.out.println(b); //false나옴
		
		//다음의 문장들을 코드로 작성해주세요.

		//1. x는 y보다 작거나 같다.
		b = x <= y;
		
		//2. x + 5와  y는 같다.
		b = x + 5 == y;
		
		//3. y는 홀수이다.
		b = y % 2 ==1; 
		
		//4. "기본형" 과 "참조형" 은 다르다.
		b = !"기본형".equals("참조형");
				
	}

}
