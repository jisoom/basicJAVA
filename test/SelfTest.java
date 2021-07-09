package test;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		// 탄수화물 중독 자가진단 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		//0입력, 1입력 하는 경우 ==> 1. 예 0. 아니오 이런식으로 의미하는 게 무엇인지 알려줘야 함  
		System.out.println("탄수화물 중독 자가 진단 테스트 : 해당하는 항목에 v를 해주세요.");
		System.out.println("=========================================");
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다 >");
		String check1 = sc.nextLine(); 
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다 >");
		String check2 = sc.nextLine(); 
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다>");
		String check3 = sc.nextLine(); 
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다>");
		String check4 = sc.nextLine(); 
		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다>");
		String check5 = sc.nextLine(); 
		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다 >");
		String check6 = sc.nextLine(); 
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다>");
		String check7 = sc.nextLine();
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다>");
		String check8 = sc.nextLine(); 
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다>");
		String check9 = sc.nextLine(); 
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못간다>");
		String check10 = sc.nextLine(); 
		
		
		if (check1.equals("v")) {
			count += 1;
		}
		if (check2.equals("v")) {
			count += 1;
		}
		if (check3.equals("v")) {
			count += 1;
		}
		if (check4.equals("v")) {
			count += 1;
		}
		if (check5.equals("v")) {
			count += 1;
		}
		if (check6.equals("v")) {
			count += 1;
		}
		if (check7.equals("v")) {
			count += 1;
		}
		if (check8.equals("v")) {
			count += 1;
		}
		if (check9.equals("v")) {
			count += 1;
		}
		if (check10.equals("v")) {
			count += 1;
		}

	
		if (count <= 3){
			System.out.println("============================");
			System.out.println("주의!" + "\n"  + "위험한 수준은 아니지만 관리 필요");
			System.out.println("============================");
		}else if (count >= 4 && count <= 6){
			System.out.println("======================================");
			System.out.println("위험!" + "\n"  + "탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
			System.out.println("======================================");
		}else {
			System.out.println("======================");
			System.out.println("중독!" + "\n"  + "전문의 상담이 필요함");
			System.out.println("======================");
		}
			

	}

}
