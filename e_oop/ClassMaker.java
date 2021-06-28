package e_oop;

public class ClassMaker {
	
	//전역변수 하나를 선언 및 초기화 해 주세요.
	String a = "abc";
	
	//리턴 타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역 변수를 출력해 주세요.
	void a(){
		System.out.println(a);
	};
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 리턴해주세요.
	String b(){
		return a;
	}
	
	//리턴타입은 없고 파라미터가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 파라미터를 출력해주세요.
	void c(int b){
		System.out.println(b);
		return;  //void라서 값을 반환하지는 않고 메서드를 종료시키는 역할만 함
	}
	
	//int 타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	int d(int a, int b){
		return a * b;
	}
	
	//return : 값을 반환해주는 역할, 메서드를 종료시키는 역할을 함
	
}
