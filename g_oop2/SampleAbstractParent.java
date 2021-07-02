package g_oop2;

public abstract class SampleAbstractParent {  //class앞에 abstract 적어줌
	//추상 클래스는 객체 생성을 하지 못함, 부모클래스의 역할만 함
	//부모클래스로 사용을 해서 상속받아 사용하겠다.

	void method(){
		
	}//일반적인 메서드
	
	//추상 메서드 : 선언부만 있고 블럭이 없음 내용이 없는 메서드
	//추상 메서드가 하나라도 있으면 그 클래스는 추상 클래스가 됨
	abstract void abstractMethod(); //추상 메서드 ==> abstract가 앞에 붙음 
	
	
}

class SampleAbstractChild extends SampleAbstractParent{ //추상메서드를 상속받았기 때문에 오버라이딩을 통해 추상 메서드의 내용을 만들어주거나 추상 클래스로 만들어줌

	//오버라이딩을 통해 추상 메서드의 내용 만들어주기 (반드시 내용 만들어서 사용하게끔 강제로 시킴)
	//왜 추상클래스에서 상속받아서 새로 내용 만들어야 하냐 ? 상속받아서 사용하면 자식클래스마다 그 내용이 달라질 수 있기 때문에 (이름은 똑같은데 내용이 조금씩 다르기 때문에)
	@Override
	void abstractMethod() {
		
		
	} 
	
}
