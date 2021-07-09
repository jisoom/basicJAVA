package test;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 123 1~9 사이에 중복되지 않는 3개의 숫자
		 * 135 : 숫자도 같고 자릿수도 같으면 ==>strike 숫자는 같은데 자릿수가 다르면 ==> ball 아예 없으면 ==>out 
		 * ==>1S 1B 1O
		 */
		
		//3개의 랜덤 숫자 생성하기
		int a = (int)(Math.random()* 9) + 1;
		int b = (int)(Math.random()* 9) + 1;
		int c = (int)(Math.random()* 9) + 1;
		while(a == b){
			b = (int)(Math.random()*9) +1;
		}
		while(b == c || a == c){
			c = (int)(Math.random()*9) +1;
		}
		
		//점수 변수
		int S;
		int B;
		int O;
		
		do{
		//3개의 숫자 입력받기
		Scanner s = new Scanner(System.in);
		System.out.println("중복되지 않는 3개의 숫자를 입력해주세요 ");
		System.out.print("당신이 생각하는 첫번째 숫자는 ?>");
		int num1 = Integer.parseInt(s.nextLine());
		System.out.print("당신이 생각하는 두번째 숫자는 ?>");
		int num2 = Integer.parseInt(s.nextLine());
		System.out.print("당신이 생각하는 세번째 숫자는 ?>");
		int num3 = Integer.parseInt(s.nextLine());
		
		
		//비교
		S = 0;
		B = 0;
		O = 0;
		if(a == num1){
			S += 1;
		}else if(a == num2 || a == num3){
			B += 1;
		}else {
			O += 1;
		}
		
		if(b == num2){
			S += 1;
		}else if(b == num1 || b == num3){
			B += 1;
		}else {
			O += 1;
		}
		
		if(c == num3){
			S += 1;
		}else if(c == num1 || c == num2){
			B += 1;
		}else {
			O += 1;
		}
		
		//결과
		if(S ==3){
			System.out.println("3S!!!!!!!!! \n정답입니다!!");
		}else{
			System.out.println("strike : " + S +"\n"+ "ball : " +B +"\n"+ "out: " +O);
			System.out.println(a +" " +b+ " "+c);
		}
		
		}while(S<3);
		
		
		
		
		
		
		
		
		
		
		

	}

}
