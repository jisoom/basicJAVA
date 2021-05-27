package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * -for문
		 * -while문
		 * -do-while문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식){}  //초기화 : 시작   조건식: 끝 ==> 조건식에 맞지 않으면 빠져나옴
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복하는 문장
		 */
		
		//1. 초기화 -> 변수 만들어지고 값이 초기화 됨 
		//2. 조건식 검사 -> 조건 true면 내용 실행 
		//3. -> 증감식 -> 조건식 다시 검사 true면 다시 내용 실행 -> 증감식 /false면 빠져나감
//		for (int i = 1; i <= 10; i++) {
//			// 초기화 : 조건식과 증감식에 사용할 변수 초기화
//			// 조건식 : 연산결과가 true이면 블럭안의 내용을 수행한다.
//			// 증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
//			System.out.println(i + "번째 반복"); // 10번 출력됨
//		}
		
		
//		int sum = 0; //1부터 10까지 합계를 저장
//		
//		sum+=1;
//		sum+=2;
//		sum+=3;
//		sum+=4;
//		sum+=5;
//		sum+=6;
//		sum+=7;
//		sum+=8;
//		sum+=9;
//		sum+=10;
//		System.out.println(sum);
//		
//		sum =0;
//		for(int i = 1; i <= 10; i++){
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		sum =0;
//		for(int i =10; i >= 1; i--){
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		//1부터 100까지 짝수의 합을 출력해 주세요.
		
		//1번째 방법
//		sum =0;
//		for (int i = 2; i <= 100; i += 2 ){
//			sum += i;
//		}
//		System.out.println(sum);
		
		//2번째 방법
//		sum = 0;
//		for (int i = 2; i <= 100; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		//1부터 100까지 홀수의 합을 출력해주세요.
		//1번째 방법
//		sum = 0;
//		for(int i = 1; i <= 100; i +=2){
//			sum += i;
//		}
//		System.out.println(sum);
		
		//2번째 방법
//		for(int i = 1; i <= 100; i++){
//			if(i % 2 == 1){
//				sum += i;
//			}
//			System.out.println(sum);
//		}
		
		
		//구구단 출력
		/*
		 *  2 * 1 = 2
		 *  2 * 2 = 4
		 *  2 * 3 = 6
		 *  2 * 4 = 8
		 *  ...
		 */
		
		//2단
//		for(int i = 1; i <= 9; i++){
//			System.out.println(2 + " * " + i + " = " + i * 2);
//		}
		
		
		//6단
//		for(int i = 1; i <= 9; i++){
//			System.out.println(6 + " * " + i + " = " + i * 6);
//		}
		
		//2단~9단 한번에 반복시키기
//		for(int dan =2; dan <=9; dan++ ){
//		for(int i = 1; i <= 9; i++){
//			System.out.println(dan + " * " + i + " = " + i * dan);
//			}
//		}
		
		//구구단 전체를 가로로 출력해주세요.
		/*
		 * 2 * 1 = 2     3 * 1 = 3     4 * 1 = 4
		 * 2 * 2 = 4     3 * 2 = 6     4 * 2 = 8
		 */
				
//		for(int i = 1; i <= 9; i++){
//			for(int dan = 2; dan <= 9; dan++){
//				System.out.print(dan+ " * " + i + " = " +dan * i + "\t");
//			}
//			System.out.println();
//		}

		/*
		 * while문
		 * -while(조건식){}
		 * -포핳ㅁ하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 * -반복횟수가 정확하지 않은 경우에 주로 사용한다.
		 */
		
//		int a =1;
//		//a에 2씩 몇번을 곱해야 1000이상이 될까?
//		int count = 0;
//		while(a < 1000){
//			a *= 2;
//			count++;
//			System.out.println(count + " : " + a);
//		}

		/*
		 * do-while문
		 * do{}while(조건식);
		 * -최소한 한번의 수행을 보장한다.
		 */
		
		//사용자한테 입력을 받을 때 ==> 계속해서 입력을 받고 사용자가 그만하고싶을 때까지 입력받을 때 사용
		//결과가 나올때까지 입력을 받을 때 사용
		
		//숫자 맞추기 게임
//		int answer =(int)(Math.random() * 100) + 1;
//		int input = 0;
//		Scanner s = new Scanner(System.in);
//		do{
//			System.out.println("1~100사이의 수를 입력해주세요 >");
//			input = Integer.parseInt(s.nextLine());
//			
//			if(answer < input){
//				System.out.println(input + "보다 작습니다.");
//			}else if(answer > input){
//				System.out.println(input + "보다 큽니다.");
//			}else {
//				System.out.println("정답입니다.");
//			}
//		
//		}while(input != answer); //input이 정답이 아니면 다시 do{}실행함
		
		
		//이름 붙은 반복문
//		outer: for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if (j == 5) {
//					// break; //가장 가까운 반복문 하나를 빠져나간다.
//					// break outer; //outer라는 이름의 반복문을 빠져나간다.
//					//continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다.
//					//continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
//				}
//				System.out.println(i + " *" + j + " = " + i * j);
//			}
//			System.out.println();
//		}
		
//		//별찍기 for문 연습
////		System.out.println("*****");
////		System.out.println("*****");
////		System.out.println("*****");
////		System.out.println();
//		//출력할 때 별 하나만 출력 => 여러개 별 만들어야 되니까 반복문 사용
////		for(int j = 1; j <= 3; j++){
////			for(int i =1; i <= 5; i++){
////				System.out.print("*");
////			}
////			System.out.println();
////		}
//		
////		System.out.println("*");
////		System.out.println("**");
////		System.out.println("***");
////		System.out.println("****");
////		System.out.println("*****");
////		System.out.println();

//		for (int i = 1; i <= 5; i++) {
//		for (int j = 1; j <= i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//
//	System.out.println();
		
		
		
////		System.out.println("*****");
////		System.out.println("****");
////		System.out.println("***");
////		System.out.println("**");
////		System.out.println("*");
////		System.out.println();
	
//		for (int i = 1; i <= 5; i++){
//		for (int j = 1; j <= 5 - i +1; j++){
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	System.out.println();
	
	
//	for (int i = 1; i <= 5; i++){
//	for (int j = 5; j >= i; j--){
//		System.out.print("*");
//	}
//	System.out.println();
//}
//System.out.println();
		
		
		
////		System.out.println("    *");
////		System.out.println("   **");
////		System.out.println("  ***");
////		System.out.println(" ****");
////		System.out.println("*****");
////		System.out.println();
	
//		for(int i = 1; i <= 5; i++){
//			for(int j =5; j >= i; j--){
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i;j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
				
		
		
//		for (int i = 1; i <= 5; i++){
//			for (int j = 1; j <= 5 - i; j++){
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		
		
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
