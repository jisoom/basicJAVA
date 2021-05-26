package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * //연산자
		 * 1. 산술연산
		 * -사칙연산: +, -, *, /, %[나머지]
		 * -복합연산자 : +=, -=, *=, /=, %= (:산술 연산자& 대입연산자)
		 * -증감연산자 : ++,-- (:1만큼 증가시키고 감소시킴)
		 */
		
		//--------------------------------------산술연산----------------------------------
		int result = 10 + 20 -30 * 40 / 50 % 60; //연산 우선순위 : 수학과 동일

		//나머지 연산
//		result = 10 / 3;  //나누기 : 3
//		System.out.println(result);
		
//		result = 10 % 3; //나머지 :1
//		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		result = 10 + 5;    //더하기 15
		System.out.println(result);
		
		result = 10 - 5;    //빼기 5
		System.out.println(result);
		
		result = 10 * 5;    //곱하기50
		System.out.println(result);
		
		result = 10 / 5;    //나누기2
		System.out.println(result);
		
		result = 10 % 5;    //나머지0
		System.out.println(result);
		
		//---------------------------------------복합연산자-------------------------------------------
		result = result +3;
		result += 3; //result와 3을 더하여 나온 값을 result에 대입함
		result -= 5;
		result *= 2;
		System.out.println(result);
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		
		//result = result + 10;
		result += 10;
		
		//result = result % 5;
		result %= 5;
		
		//result = result -2 *3;
		result -= 2 * 3; //6을 빼는 것과 같음
		
		//-----------------------------------------증감연산자---------------------------------------------
		//증가연산자(++) : 변수의 값을 1 증가시킨다
		//감소연산자(--) : 변수의 값을 1 감소시킨다
		int i =0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);  // 먼저 증가시켜 1이 된 후 값을 읽겠다 :1출력
		i = 0;
		System.out.println("i++ = " + i++); //변수에 들어 있는 값을 먼저 읽어온 다음에 1을 증가시키겠다 :0출력
		System.out.println(i); //0출력 후 i는 1증가되어 1이 된다 :1출력
		
		//------------------------------------주의사항--------------------------------------
		// 1. 피연산자(연산의 대상)의 타입이 서로 같아야만 연산이 가능하다  (피연산자 2개 => 이항 연산자 , 3개 => 삼항 연산자)
		int _int = 10;
		double _double = 3.14;
		double result2 = (double)_int + _double; //(double)생략가능
		System.out.println(result2); //작은 타입에서 큰타입으로  자동으로 형변환되어 계산 가능 ==> double +double이됨 :13.14 출력 
		
		
		long _long = 100L;
		_long = _int + _long;  //long 타입 형변환이 숨어 있음 ==> long + long
		_int = _int + (int)_long;

		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //int보다 작은 타입은 int로 형변환된다 ==> 둘다 int로 형변환됨 int + int 가 됨 
		//연산의 최소 단위가 4byte가 되야 연산할 수 있고 그 이하는 안됨
		
		char _char = 'a'; //안에 숫자가 들어있는데 표현만 문자로 표현됨
		char _char2 ='b';
		_int = _char +_char2; // int보다 작은 타입이라 int로 형변환된다 ==> int +int가 됨
		System.out.println(_int); //유니코드사용 ==>'a':97 'b':98 :195출력
		
		//오버플로우, 언더플로우  : 표현범위를 벗어나는 값을 표현할 때  발생하는 현상
		//오버플로우 : 가장 큰 값을 벗어나는 현상, 이 값을 벗어나면 가장 작은 값으로 돌아감 0~127// 128이되면 -128이 됨
		//언더플로우 : 가장 작은 값을 벗어나는 현상, 이 값을 벗어나면 가장 큰 값으로 돌아감 0~127-129가 되면 127이 됨
		byte b =127;
		b++;
		System.out.println(b); //오버플로우 되어 128이 -128이 됨
		b--;
		System.out.println(b); //언더플로우되어 -129가 127이 됨

		//00000000 : 맨 첫자리 마이너스 플러스 표현 나머지 7자리로 숫자 표현  2^7
		// 1 byte 표현 범위 : -2^7 ~ 2^7-1 : -128~127  (1)=>7
		//short : -2^15 ~ 2^15-1  (2) => 7 +8
		//int : -2^31 ~ 2^31-1 (4) => 7 + 8 *3
		//long : -2^63 ~ 2^63-1 (8) => 7 +8 *7
		//char : 0 ~ 2^16 문자표현하기 때문에 -가 필요 없음
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 +654321
		//2. 1번의 결과 값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값  % 123456
		
		long result3 = 123456 + 654321;
		result3 *= 123456;
		result3 /= 123456;
		result3 -= 654321;
		result3 %= 123456;
		System.out.println(result3);
		//연산을 잘 고려해서 타입을 결정해주는 것이 중요함
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 출력해주세요.
		int num1 =15;
		int num2 =34;
		int num3 =49;
		int sum = num1 +num2 + num3;
		double avg = sum / 3.0; //평균은 소수점까지 하는 게 나아서 double을 타입으로 정하고, 피연산자 둘 중 하나는 double형으로 해줘야 함 ==> 3을 3.0으로 해줌
		System.out.println("합계 : " + sum + "평균 : " + avg);
		
		//반올림
//		avg = Math.round(avg); //괄호 안에 반올림하고 싶은 값 넣어줌 Math.round는 무조건 소수점 첫째자리에서 반올림해줌
//		System.out.println(avg); //33.0
		
		//반올림 하기 전에 소수점의 자리를 이동시키고 반올림하면 보고싶은 자리까지 볼 수 있음
		avg = Math.round(avg * 100) /100.0; // 뒤에  나누는 숫자를 10.0을 100.0으로 해주면 소수점 둘째자리까지 반올림됨
		System.out.println(avg);
		
		//랜덤
		//Math.random() : 0.0 ~ 1.0미만의 수 발생시킴(0.9999...)
		int random = (int)(Math.random() * 100) + 1; // 0 ~ 99 ==> +1 ==> 1 ~100까지의 수
		System.out.println(random);
		
	}
	


}
