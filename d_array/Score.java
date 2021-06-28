package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 *  우리반 모두의 국어, 영어, 수학, 사회, 과학, oracle, java 점수를 
		 *  0~100사이의 랜덤 값으로 생성해주시고, 아래와 같이 출력해주세요.
		 *  이름 		국어		영어		수학		사회		과학		oracle	java	합계		평균		석차
		 *  홍길동 	90		90		90		90		90		90		90		630		90.0	1
		 *  홍길동 	90		90		90		90		90		90		90		630		90.0	1
		 *  홍길동 	90		90		90		90		90		90		90		630		90.0	1
		 *  홍길동 	90		90		90		90		90		90		90		630		90.0	1
		 *  홍길동 	90		90		90		90		90		90		90		630		90.0	1
		 *  과목합계	450		450		450		450		450		450		450
		 *  과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		String[]names = {"강유진", "강지수", "곽재우", "구본성", "권수연", "김보영", "김소희", "김지수", "백지혜", "송유경", "신희철", "심선주", "오수연", 
						"윤희중", "이경준", "이석호", "이승구", "이여강", "이영민", "이영우", "이용석", "이정범", "최기문", "최소은", "최윤지"};
		String[]subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		int [][]score = new int[names.length][subjects.length];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j]=(int)(Math.random()*101);
			}
		}
		
		int []nameSum = new int[score.length];
		double []nameAvg = new double[score.length];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];

			}
			nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0;
		}
		
		int[]subSum  = new int[subjects.length];
		double[]subAvg = new double[subjects.length];
		
		for (int i = 0; i < subjects.length; i++) {
			for (int j = 0; j < score.length; j++) {
				subSum[i] += score[j][i];
			}
			subAvg[i] = Math.round((double)subSum[i] / score.length *100)/100.0;
		}
		
		int[]rank = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			rank[i]=1;
			for (int j = 0; j < score.length; j++) {
				if(nameSum[i] < nameSum[j]){
					rank[i]++;
				}
			}
		}
		
		//석차순으로 정렬(시험에서 출제되지 않음)
				for(int i = 0; i < nameSum.length - 1; i++){
					int min = i;
					for(int j = i + 1; j < nameSum.length; j++){
						if(nameSum[j] > nameSum[min]){
							min = j;
						}
					}
					int[] temp = score[i];
					score[i] = score[min];
					score[min] = temp;
					
					int temp2 = nameSum[i];
					nameSum[i] = nameSum[min];
					nameSum[min] = temp2;
					
					double temp3 = nameAvg[i];
					nameAvg[i] = nameAvg[min];
					nameAvg[min] = temp3;
					
					int temp4 = rank[i];
					rank[i] = rank[min];
					rank[min] = temp4;
					
					String temp5 = names[i];
					names[i] = names[min];
					names[min] = temp5;
				}
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t 합계 \t 평균 \t 석차");
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
		System.out.print("과목합계 \t");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i]+ "\t");
		}
		System.out.println();
		
		System.out.print("과목평균 \t");
		for (int i = 0; i < subAvg.length; i++) {
			System.out.print(subAvg[i]+"\t");
		}
		
		
		
		
		
		
	}

}
