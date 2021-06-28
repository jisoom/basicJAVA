package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍 (Object Oriented Programming) : 객체를 기준으로 나누겠다
		 * -프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체 간의 상호작용으로 보는 것
		 * -코드의 재사용성이 높고 유지보수가 용이하다
		 */
		
		//객체 생성 ==> SampleClass의 내용이 메모리에 올라감
		//변수 sc에 클래스 주소 저장
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		
		String returnValue = sc.method1(5);
		System.out.println(returnValue);
		
		sc.method2();
		
		sc.flowTest1();
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과 값 * 123456
		//3. 2번의 결과 값 / 123456
		//4. 3번의 결과 값 - 654321
		//5. 4번의 결과 값 % 123456
		
		Calculator cal =new Calculator();
		
		double result = cal.add(123456, 654321);
		result = cal.multiply(result, 123456);
		result = cal.divide(result, 123456);
		result = cal.subtract(result, 654321);
		result = cal.mod(result, 123456);
		System.out.println(result);
		
		
		
	}

}
