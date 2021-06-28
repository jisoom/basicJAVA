package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		
		//알바 객체 생성
		Alba alba = new Alba();
		
		//주문 받음
		String[] order = alba.order();
		System.out.println(Arrays.toString(order));
		
		//요리 만듦
		System.out.println("요리 만드는 중... 완성!");
		String[] foods = {"완성된 짜장면", "완성된 탕수육"};
		
		alba.serving(foods);  //왜 foods를 넣어야하는지 물어보기
		
		alba.pay(order);
		

	}

}
