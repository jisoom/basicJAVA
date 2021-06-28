package e_oop;

public class JVM {

	public static void main(String[] args) {
		/*
		 * Java Virtual Machine
		 * -자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 * -운영체제 -> JVM-> 자바 프로그램
		 * -장점 : 운영체제에 상관없이 실행할 수 있다.
		 * -단점 : 속도가 느리다.
		 * 
		 * JVM 메모리 구조
		 * -Method Area(메서드 영역) : 클래스 멤버가 저장된다. (static이 붙은 애들이 주로) 
		 * -Heap : 객체가 저장된다.
		 * -Call Stack(호출 스택) : 현재 호출되어 있는 메서드가 저장된다.
		 */
		
		//프로그램 실행 시 main(), classVar, classMethod()가 MethodArea에 저장됨 (static이 붙은 애들)
		//main() 호출 되어 CallStack에 저장됨
		//main()메서드 실행할 때 , static이 있기 때문에 static이 붙지 않은 instanceVar나 instanceMethod()는 아직 메모리에 올라와 있지 않음
		
		System.out.println(classVar);  
		//System 클래스의 out이 MethodArea에 저장됨
		//println()이 호출되어 CallStack에 저장됨
		//println()이 classVar를 출력 후 CallStack에서 삭제됨
		//out이라는 변수에 static이 붙어있어서 객체 생성하지 않고도 호출해서 사용 가능
		
		classMethod();
		//classMethod()가 호출되어 CallStack에 저장되고 메서드의 내용을 수행 후 삭제됨
		
		JVM jvm = new JVM();
		//JVM 객체가 Heap에 저장됨 (객체 생성)
		//jvm변수가 CallStack에 생성되고, JVM객체의 주소가 저장됨
		//지역변수 생성됨
		System.out.println(jvm.instanceVar);
		//println()이 호출되어 CallStack에 저장됨
		//println()이 instanceVar를 출력 후 CallStack에서 삭제됨
		jvm.instanceMethod();
		//instanceMethod()가 호출되어 CallStack에 저장되고, 메서드의 내용을 수행 후 삭제됨
		
		jvm = null; //jvm은 참조형 타입  ==>기본값 null을 넣을 수 있음
		//jvm 변수에 null이 저장됨
		//어디에서도 주소를 참조하지 않는 JVM 객체는 GarbageCollector에 의해 삭제됨
		
		//main()의 실행이 종료되어 CallStack에서 삭제됨
		//프로그램이 종료되고 MethodArea의 데이터가 삭제됨
		
		
		
	}
	
	int instanceVar;
	static int classVar;
	
	// 이 클래스의 객체 생성을 해야 메서드 사용할 수 있음 ==> 객체 생성하고나면 둘다 메모리에 올라와 있음
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	// 객체 생성하지 않고 사용하기위해 static을 붙임 ==> 객체 생성하기 전에 호출하면 instanceVar는 메모리에 올라와있지 않음
	//static이 붙은 메서드에서 instanceVar를 사용하기 위해서는 반드시 객체 생성을 해야함
	static void classMethod(){
//		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




















