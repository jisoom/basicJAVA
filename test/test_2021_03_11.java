package test;

import java.util.Scanner;

public class test_2021_03_11 {

	public static void main(String[] args) {
		String id;
		int password;
		String name;
		int age;
		double height;
		
		System.out.println("==========회원가입==========");
		Scanner sc =new Scanner(System.in);
		
		System.out.print("아이디>");
		id = sc.nextLine();
		
		System.out.print("비밀번호(4자리 숫자)>");
		password = Integer.parseInt(sc.nextLine());
		
		System.out.print("이름>");
		name = sc.nextLine();
		
		System.out.print("나이>");
		age =Integer.parseInt(sc.nextLine());
		
		System.out.print("키>");
		height = Double.parseDouble(sc.nextLine());
		
		System.out.println("=========================");
		System.out.println("회원가입 완료!!");
		System.out.println("==========내정보==========");
		System.out.println("아이디 : " + id + "\n" + "비밀번호 : " + password + "\n" + "이름 : " 
							+ name + "\n" + "나이 : " + age + "세" + "\n" + "키 : " + height + "cm");
		System.out.println("========================");
	}

}
