package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * -&&(AND), ||(OR), !(NOT)
		 * -피연산자로 boolean만 허용한다.
		 * 양쪽으로 비교연산자가 나오고 둘을 연결시켜주는 역할
		 * AND 둘다 true ==> true
		 * OR 둘 중 하나라도 true ==> true
		 * NOT true -> false, false->true
		 */
		int x =10;
		int y =20;
		boolean b = 0 < x && x <10 || x < y; //true나옴
		//&&와 ||가 함께 있으면 &&가 우선순위가 높다
		
//		b = !x < y; //x앞에 !를 붙인게 됨
		b = !(x <y); //false 나옴
		//----------------------------------------------주의사항---------------------------------
		//주의사항 : 논리 연산은 효율적 연산을 함
		b = true && true; //true
		b = true && false; //false  왼쪽에서 false면 오른쪽은 확인하지 않음 ==> 노란줄 뜸
		b = false && true; //false
		b = false && false; //false
		
		b = true || true; //true    왼쪽에서 true면 오른쪽은 확인하지 않음 ==> 노란줄 뜸
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		int a =10;
		b = a < 5 && 0 < a++; //a++이 실행되야 하는데 a <5가 false가 되서 오른쪽 a++을 실행하지 않음 
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
		b = x > y && x < 10;
		
		//2. x가 짝수이고 y보다 작거나 같다.
		b = x % 2 == 0 && x <= y;
		
		//3. x가 3의 배수이거나 5의 배수이다.
		b = x % 3 == 0 || x % 5 ==0;
		
		
		
		
		
		
		
	}

}
