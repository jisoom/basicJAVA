package test;

import java.util.Scanner;

public class Baseball2 {

	public static void main(String[] args) {
		//숫자 야구 게임 만들기
		
		//3개 숫자 중복되지 않게 랜덤 생성하기
		int a = (int)(Math.random() * 9)+ 1;
		int b = (int)(Math.random() * 9)+ 1;
		int c = (int)(Math.random() * 9)+ 1;
		while(a == b){
			b = (int)(Math.random() * 9)+ 1;
		}
		while(c == a || c == b){
			c = (int)(Math.random() * 9)+ 1;
		}
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		//strike, ball, out 변수 선언하기
		int S;
		int B;
		int O;
		
		do{
		//생각하는 숫자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("==========숫자 야구 게임 시작==========");
		System.out.println("중복되지 않는 3개의 숫자를 입력해 주세요");
		System.out.println("================================");
		System.out.println("당신이 생각하는 첫번째 숫자는? >");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("당신이 생각하는 두번째 숫자는? >");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("당신이 생각하는 세번째 숫자는? >");
		int num3 = Integer.parseInt(sc.nextLine());
		
		//strike, ball, out 초기화하기
		S = 0;
		B = 0;
		O = 0;
		
		//비교 조건
		//첫번째 글자
		if(a ==num1){
			S += 1;
		}else if(a == num2 || a == num3){
			B += 1;
		}else{
			O += 1;
		}
		
		//두번째 글자
		if(b ==num2){
			S += 1;
		}else if(b == num1 || b == num3){
			B += 1;
		}else{
			O += 1;
		}
		
		//세번째 글자
		if(c ==num3){
			S += 1;
		}else if(c == num1 || c == num2){
			B += 1;
		}else{
			O += 1;
		}
		
		//결과
		if(S == 3){
			System.out.println("3S! 정답입니다!");
		}else{
			System.out.println(S + "S " + B + "B " + O + "O 입니다!");
		}
		}while(S < 3); // 3S가 되면 반복문 종료함 
		
		
		
		
		
	}

}
