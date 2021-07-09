package test;

public class sunJoo {

	public static void main(String[] args) {
		
		int year = 2020;
		int month = 2;
		int day = 14;
		System.out.println("오늘날짜 : " +year+ "년 "+month+"월 "+day+"일");
		
		int a =8;
		int b =3;
		int result = a/b;
		double result2 = a/b;
		System.out.println(a +" " + b + " " + result + " "+ result2);
		
		int number = 30;
		char ch = 'C';
		
		int result3 = number++ +3 + ++ch + ++number;
		System.out.println(number);
		System.out.println(ch);
		System.out.println(result3);
	}

}
