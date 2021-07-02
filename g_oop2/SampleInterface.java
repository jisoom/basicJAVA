package g_oop2;

public interface SampleInterface {

	//인터페이스 : 변수와 메서드로 구성되는 것이 아니라 상수와 추상 메서드만 가질 수 있음
	//인터페이스의 모든 멤버 변수는 public static final 제어자를 사용해야 한다.
	
	public static final int NUM1 = 10; //final ==> 상수가 됨
	
	//모든 멤버 변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 20;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1(); //abstract ==> 추상메서드가 됨
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
	
}

class SampleImplement implements SampleInterface, SampleInterface2{ //인터페이스 상속은 extends(내용을 확장한다라는 의미)를 사용하지 않고 implements를 사용함 (내용을 구현한다라는 의미로 implements)
	//인터페이스를 구현한다 라는 의미
	//인터페이스는 부모가 여러개여도 가능하다(여러부모로부터 상속을 받을 수 있다)
	//인터페이스는 메서드명이 같을 때 내용이 없기 때문에 어떤 메서드를 실행해야되는지 생각하지 않아도 됨 ==> 다중 상속이 가능함
	
	@Override
	public void method1() {
		
		
	}

	@Override
	public void method2() {
		
		
	}

	@Override
	public void method3() {
		
		
	} 
	
	
}

interface SampleInterface2{
	void method1();
	void method3();
}
