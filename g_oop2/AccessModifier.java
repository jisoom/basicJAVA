package g_oop2;

public class AccessModifier {
	//접근제어자(4가지)
	/*public
	 * protected
	 * default
	 * private
	 */
	public String publicVar = "public : 접근 제한이 없음"; //어디서나 누구나 접근 가능
	protected String protectedVar = "prodtected : 같은 패키지 + 상속받은 클래스에서 접근 가능"; 
	String defaultVar = "default : 같은 패키지에서만 접근 가능";
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		/*
		 * 접근제어자를 사용하는 이유
		 * -데이터를 보호하기 위해
		 * -사용하는데 불필요한 멤버를 숨기기 위해
		 */
		Time t = new Time();
		
//		t.hour = 13;
//		t.minute = 590;
//		t.second = -30; 변수에 직접 접근 할 수 없음
		

		t.setHour(13);
		t.setMinute(59);
		t.setSecond(55);
		
		System.out.println(t.getTime());

		t.clock();
		
	}
	
	

}
