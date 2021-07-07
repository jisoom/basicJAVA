package j_collection;

import java.util.ArrayList;

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
		
		//과목
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("oracle");
		subjects.add("java");
		
		//이름
		ArrayList<String> names = new ArrayList<>();
		names.add("강지수");
		names.add("강유진");
		names.add("곽재우");
		names.add("구본성");
		names.add("권수연");
		names.add("김보영");
		names.add("김소희");
		names.add("김지수");
		names.add("백지혜");
		names.add("송유경");
		names.add("신희철");
		names.add("심선주");
		names.add("오수연");
		names.add("윤희중");
		names.add("이경준");
		names.add("이석호");
		names.add("이승구");
		names.add("이여강");
		names.add("이영민");
		names.add("이영우");
		names.add("이용석");
		names.add("이정범");
		names.add("최기문");
		names.add("최소은");
		names.add("최윤지");

		
		//점수
		ArrayList<ArrayList<Integer>> score = new ArrayList<>();
		
		for (int i = 0; i < names.size(); i++) {
			ArrayList<Integer> s = new ArrayList<>();
			for (int j = 0; j < subjects.size(); j++) {
					int random = (int)(Math.random()*101); 
					s.add(random);
			}
			score.add(s);
		}
		
		//합계, 평균
		ArrayList<Integer> nameSum = new ArrayList<>();
		ArrayList<Double> nameAvg = new ArrayList<>();

		for (int i = 0; i < score.size(); i++) {
			int ns=0;
			double na =0;
			for (int j = 0; j < subjects.size(); j++) {
				ns += score.get(i).get(j);
			}
			nameSum.add(ns);  //보통 add(integer e)한개 짜리로 사용함 인덱스 지정해서 추가하는 거는 잘 사용 안함
			na = Math.round((double)nameSum.get(i) /subjects.size() *100)/100.0;
			nameAvg.add(na);

		}
		
		//과목합계, 과목평균
		ArrayList<Integer> subSum = new ArrayList<>();
		ArrayList<Double> subAvg = new ArrayList<>();

		for (int i = 0; i < subjects.size(); i++) {
			int ss=0;
			double sa =0;
			for (int j = 0; j < score.size(); j++) {
				ss += score.get(j).get(i);
			}
			subSum.add(ss);
			sa = Math.round((double)subSum.get(i) /names.size() *100)/100.0;
			subAvg.add(sa);
		}
		
		//석차
		ArrayList<Integer> rank = new ArrayList<>();
		for (int i = 0; i < score.size(); i++) {
			rank.add(1);
			for (int j = 0; j < score.size(); j++) {
				if(nameSum.get(i) < nameSum.get(j)){
					rank.set(i, rank.get(i)+1);
				}
				
			}
		}
		
		//석차 정렬
		for(int i = 0; i < nameSum.size() - 1; i++){
			int min = i;
			for(int j = i + 1; j < nameSum.size(); j++){
				if(nameSum.get(j) > nameSum.get(min)){   //rank를 기준으로 하면 rank가 클수록 성적이 낮음 if(rank.get(j) < rank.get(min))으로 해줘야함
					min = j;
				}
			}
			 //new ArrayList<>();를 안해줘도 되는 이유 : temp라는 변수에 score의 배열이 들어가기 때문에 new ArrayList<>()를 해서 새로운 배열을 생성해주더라도 바로 score 배열이 담기기 때문에
				ArrayList<Integer> temp = score.get(i);  
				score.set(i, score.get(min));
				score.set(min, temp);
				
				int temp2 = nameSum.get(i);
				nameSum.set(i, nameSum.get(min));
				nameSum.set(min, temp2);
				
				double temp3 = nameAvg.get(i);
				nameAvg.set(i, nameAvg.get(min));
				nameAvg.set(min, temp3);
				
				int temp4 = rank.get(i);
				rank.set(i, rank.get(min));
				rank.set(min, temp4);
				
				String temp5 = names.get(i);
				names.set(i, names.get(min));
				names.set(min, temp5);
		}

		//출력
		System.out.println("========================================================================================");
		for (int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" +subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		System.out.println("----------------------------------------------------------------------------------------");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i)+"\t");
			for (int j = 0; j < subjects.size(); j++) {
				System.out.print(score.get(i).get(j) + "\t");
			}
			System.out.println(nameSum.get(i) + "\t" +nameAvg.get(i) + "\t" +rank.get(i));
		}
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.print("과목합계 \t");
		for (int i = 0; i < subSum.size(); i++) {
			System.out.print(subSum.get(i)+ "\t");
		}
		System.out.println();
		
		System.out.print("과목평균 \t");
		for (int i = 0; i < subAvg.size(); i++) {
			System.out.print(subAvg.get(i)+"\t");
		}
		System.out.println();
		System.out.println("========================================================================================");

		

	}

}
