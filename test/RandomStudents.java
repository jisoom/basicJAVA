package test;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		//입력한 숫자만큼 우리반 학생들 중 랜덤으로 뽑아서 출력하는 프로그램을 만들어주세요.
		//사용자한테 숫자 하나 입력받음 1~25사이 숫자
		//예시)5라고 입력하면 5명 랜덤으로 뽑아주기(중복되지 않게)
		
		String[]name = new String[25];
		name[0]="강유진"; 
		name[1]="강지수"; 
		name[2]="곽재우";
		name[3]="구본성";
		name[4]="권수연";
		name[5]="김보영";
		name[6]="김소희";
		name[7]="김지수";
		name[8]="백지혜";
		name[9]="송유경";
		name[10]="신희철";
		name[11]="심선주";
		name[12]="오수연";
		name[13]="윤희중";
		name[14]="이경준";
		name[15]="이석호";
		name[16]="이승구";
		name[17]="이여강";
		name[18]="이영민";
		name[19]="이영우";
		name[20]="이용석";
		name[21]="이정범";
		name[22]="최기문";
		name[23]="최소은";
		name[24]="최윤지";

		
		Scanner s = new Scanner(System.in);

				
		//숫자 입력 받기
		System.out.println("1부터 24사이의 숫자를 1개 입력해주세요");
		int num = Integer.parseInt(s.nextLine());
		
		//입력 받은 수 만큼 랜덤 숫자 생성
	
		int []random = new int[25];
		
		for (int i = 0; i < num; i++) {
			random[i] = (int)(Math.random() *random.length-1);
			//중복 없게 하기
			for (int j =0; j < i ; j ++){
				if(random[i]==random[j]){
					i--;
					break;
				}
			}
			
		}
		for (int i = 0; i < num; i++) {
			System.out.print(name[random[i]] + "\t");
		}
		
		

		
		
		

		
		


		
		
		
		
		

	}

}
