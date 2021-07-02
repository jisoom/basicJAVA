package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier(); //import 해줘야 됨 ctrl +shift +o
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod(); //AccessModifier를 통해 사용하고 있기 때문에 오류남
		
//		System.out.println(am.defaultVar);
//		am.defaultMethod(); //같은 패키지에서만 사용 가능.
		
//		System.out.println(am.privateVar);
//		am.privateMethod(); //같은 클래스내에서만 사용 가능. 다른 클래스에서 사용할 수 없음 
		
		//오류 해결 (상속을 받았으면 내것처럼 사용해야 함 객체 생성)
		AccessTest at = new AccessTest();
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
	}

}
