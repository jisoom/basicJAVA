package e_oop;

public class Static {
	
	/*
	 * static을 붙이면 프로그램 실행 시 메모리에 올라간다.
	 * 객체 생성을 하지 않아도 사용할 수 있다.
	 * static을 붙인 변수는 객체간에 변수의 값을 공유한다.
	 * static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 * static이 붙지않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드 (객체를 통해 사용하기 때문에)
	 */
	
	static int var; //클래스 변수 : 값을 공유하기 위해 사용한다.
	
	

	public static void main(String[] args) { 
		Saram s1 = new Saram();
		Saram s2 = new Saram();
		
		s1.name = "철수";
		s2.name = "영희";
		
		s1.saveMoney(100000);
		s2.saveMoney(200000);
		
		s1.saveDateMoney(200000);
		s2.saveDateMoney(200000);
		
		// System.out.println(Math.random()); 랜덤이라는 메서드에 static이 붙어있어서 클래스 이름을 통해 객체 생성 없이 바로 호출할 수 있음
		
		System.out.println("문자열 입력>");
		String str = ScanUtil.nextLine();
		System.out.println(str);
		
		System.out.println("숫자 입력>");
		int num = ScanUtil.nextInt();
		System.out.println(num);
	}

}

class Saram{
	String name; //이름
	int account; //계좌 잔고
	
	void saveMoney(int money){
		account += money;
		System.out.println(name + "의 계좌 잔고 : " + account);
	}
	
	static int dateAccount; //철수와 영희가 사귀게 되서 데이트 통장 만듦 같이 사용 (통장 공유 ==> static 붙여줌)
	//객체에서 static 사용 ==> 값을 공유하기 위해 사용
	void saveDateMoney(int money){
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : " + dateAccount);
	}
}