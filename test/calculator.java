package test;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 >");
		int x =Integer.parseInt(s.nextLine());
		System.out.println("연산자 >");
		String op =s.nextLine();
		System.out.println("두번째 숫자 >");
		int y = Integer.parseInt(s.nextLine());
		
		int result = op.equals ("+") ? x +y
					: op.equals ("-") ? x - y
					: op.equals ("*") ? x * y
					: op.equals ("/") ? x / y
					:x % y;
		System.out.println(x + " " + op + " " + y + "=" + result);
	}

}
