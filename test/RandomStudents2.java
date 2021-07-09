package test;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents2 {

	public static void main(String[] args) {
		//입력한 숫자만큼 우리반 학생들 중 랜덤으로 뽑아서
		String[]students = {"최기문", "이경준","최윤지","오수연"};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("몇명 뽑을까요?");
		int count = Integer.parseInt(s.nextLine());
		
		String[]pick = new String[count];
		int pickCount = 0;
		
		do{
		int random = (int)(Math.random()*students.length);
		
		boolean flag = true;
		for (int i = 0; i < pick.length; i++) {  //뽑힌 사람들 중에서 같은 사람이 있는 경우 변수를 하나 만들어서 변수의 값을 바꿔줌
			if(students[random].equals(pick[i])){
				flag = false;
			}
		}
		if(flag){
			pick[pickCount++] = students[random];
		}
		}while(pickCount < count);
		
		System.out.println(Arrays.toString(pick));
		
		
		
		
	}

}
