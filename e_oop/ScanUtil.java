package e_oop;

import java.util.Scanner;

public class ScanUtil {

	private static Scanner s = new Scanner(System.in);
	
	public static String nextLine(){
		return s.nextLine();
	}
	
	public static int nextInt(){
		return Integer.parseInt(s.nextLine());
	}
	//메서드에서는 자주 사용하기 때문에 객체 생성하지 않고 사용하기 위해서 static 붙임 ==> 바로 호출 가능
}
