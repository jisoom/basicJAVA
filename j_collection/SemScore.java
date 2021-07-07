package j_collection;

import java.util.ArrayList;

public class SemScore {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		//이름
		ArrayList<String> students = new ArrayList<>();
		students.add("오태훈");
		students.add("조항민");
		students.add("김정명");
		students.add("이치우");
		
		//과목
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("Oracle");
		subjects.add("Java");
		
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>(); //점수2차원 배열
		ArrayList<Integer> sums = new ArrayList<>(); //합계
		ArrayList<Double> avgs = new ArrayList<>(); //평균
		ArrayList<Integer> ranks = new ArrayList<>(); //석차
		ArrayList<Integer> subSums = new ArrayList<>(); //과목합계
		ArrayList<Double> subAvgs = new ArrayList<>(); //과목평균
		
		for(int i = 0; i < students.size(); i++) {
			ranks.add(1); //석차를 전부 1로 만들어줌
			
			//점수 랜덤 생성하기
			ArrayList<Integer> score = new ArrayList<>(); //점수 2차원 배열 안에 있는 점수1차원 배열
			for(int j = 0; j < subjects.size(); j++) {
				score.add((int)(Math.random() * 101));
			}
			scores.add(score); //점수 2차원배열 안에 점수1차원 배열 추가
		}
		//합계, 평균
		for(int i = 0; i < scores.size(); i++) {
			int sum = 0; //sum은 한줄 끝날때마다 초기화 되야하기 때문에 0으로 초기화시키는거를 i for문 안에서 해줌
			for(int j = 0; j < scores.get(i).size(); j++) {
				sum += scores.get(i).get(j); //sums.get(i) = sums.get(i) + scores.get(i).get(j)기 때문에 sums.get(i)에는 아무것도 안들어 있기 때문에 더해주지를 못함 ==> sum 변수 하나 생성
			}
			sums.add(sum);
			avgs.add(Math.round((double)sum / scores.get(i).size() * 100) / 100.0);
		}
		//석차
		for(int i = 0; i < sums.size(); i++) {
			for(int j = 0; j < sums.size(); j++) {
				if(sums.get(i) < sums.get(j)) {
					ranks.set(i, ranks.get(i) + 1); //전부 1로 맞춰져있는 rank를 점수가 더 작으면 석차를 1더해줌
				}
			}
		}
		//석차정렬
		for(int i = 0; i < ranks.size(); i++) {
			int min = i;
			for(int j = i + 1; j < ranks.size(); j++) {
				if(ranks.get(j) < ranks.get(min)) { //등수 비교 했을 때 등수가 작은거를 min으로 해줌
					min = j;
				}
			}
			
			String tempName = students.get(i);
			students.set(i, students.get(min));
			students.set(min, tempName);
			
			ArrayList<Integer> tempScore = scores.get(i);
			scores.set(i, scores.get(min));
			scores.set(min, tempScore);
			
			int tempSum = sums.get(i);
			sums.set(i, sums.get(min));
			sums.set(min, tempSum);
			
			double tempAvg = avgs.get(i);
			avgs.set(i, avgs.get(min));
			avgs.set(min, tempAvg);
			
			int tempRank = ranks.get(i);
			ranks.set(i, ranks.get(min));
			ranks.set(min, tempRank);
		}
		
		//과목합계, 과목평균
		for(int i = 0; i < subjects.size(); i++) {
			int sum = 0;
			for(int j = 0; j < students.size(); j++) {
				sum += scores.get(j).get(i);
			}
			subSums.add(sum);
			subAvgs.add(Math.round((double)sum / students.size() * 100) / 100.0);
		}
		
		//출력
		System.out.println("===================================================================================");
		System.out.print("이름");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i = 0; i < scores.size(); i++) {
			System.out.print(students.get(i));
			
			ArrayList<Integer> score = scores.get(i);
			for(int j = 0; j < score.size(); j++) {
				System.out.print("\t" + score.get(j));
			}
			System.out.println("\t" + sums.get(i) + "\t" + avgs.get(i) + "\t" + ranks.get(i));
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("과목합계");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subSums.get(i));
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subAvgs.get(i));
		}
		System.out.println();
		System.out.println("===================================================================================");
	}

}








