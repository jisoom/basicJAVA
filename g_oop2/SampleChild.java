package g_oop2;

public class SampleChild extends SampleParent{ //extends : 상속받는 예약어

	void childMethod(){
		System.out.println(var);
		System.out.println(method(7,13));
	}
	
	
	//오버라이딩 : 부모클래스로부터 메서드를 물려받아 내용을 변경하는 것
	//super, super() : 부모클래스 멤버 이름과 자식클래스 멤버이름 똑같을 때, 
	//super() ==> 자식클래스의 생성자에서 부모클래스의 생성자 호출할 때
	//다형성 : 부모타입의 변수를 사용해서 자식타입의 객체를 사용하는 것

	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것
	@Override // 어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는것
	int method(int a, int b){//리턴타입 메서드명 파라미터 모두 같아야 한다.
		return a * b;
	}
	
	//super, super()
	//super : 부모클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기위해 사용한다.
	//멤버 : 변수와 메서드 둘다
	
	int var;
	
	void test(double var){
		System.out.println(var); //파라미터로 받은 지역변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모클래스의 인스턴스 변수
		System.out.println(this.method(10, 20)); //오버라이딩한 메서드
		System.out.println(super.method(10, 20)); //부모클래스로부터 상속받은 메서드
	}
	
	SampleChild(){  //SampleParent의 상속을 받고 있음 반드시 부모클래스의 생성자 호출해야함
		super(); //부모 클래스의 생성자 호출
		//super()를 통해 클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
		//부모클래스의 생성자에 파라미터가 있을 때는 컴파일러가 자동으로 호출해주지 않음 ==> 반드시 해야함 
	}
	

	//다형성
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild(); //다형성
		//sp = new SampleChild2();
		//sp = SampleChild3();
		//부모를 상속받는 자식이 여러개 있을 수 있음
		
		//형변환 작은쪽에서 큰쪽으로 할 때 생략 가능
		sc = (SampleChild)sp;
		sp = (SampleParent)sc;
		//자식타입 -> 부모타입 형변환은 생략이 가능하다.
		
		//부모타입 -> 자식타입 형변환
		sc = (SampleChild)new SampleParent(); //SampleChild안에 있는 멤버 다 사용가능해야함
		//sc는 SampleChild ==> 5개 사용할 수 있어야함
		//SampleParent ==> 2개 멤버밖에 없음
		//5개 중에 실제로는 2개만 사용할 수 있음 ==>런타임 에러
		//5개를 사용해야 되는데 2개밖에 없는거
		
		sp = new SampleChild();
		//sp는 2개 사용할 수 있는데 SampleChild에 5개 있음 ==> 생략 가능
		//2개를 사용해야 되는데 5개나 있는거
		
		
	}
	
	
}
