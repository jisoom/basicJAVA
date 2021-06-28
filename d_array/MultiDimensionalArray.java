package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//2차원 배열
		
		int [][] array2;
		
		//3차원 배열
		int [][][] array3;
		
		//2차원 배열 초기화
		int [][] arr = new int [2][3];
		/*
		 * 변수 = 주소1(100번지)
		 * 		 
		 * 100번지
		 * {주소2(200번지), 주소3(300번지)}
		 *
		 *200번지
		 *{0, 0, 0}
		 *
		 *300번지
		 *{0, 0, 0}
		 */
		
		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		int []arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //선언과 초기화 반드시 동시에 해야함
		
		int[][] arr4 = new int[3][]; //가변 배열 1차원만 초기화 된거고 2차원은 아직 초기화 되지 않음
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		System.out.println(arr[0][1]); //[][] 둘다 지정해줘야 출력할 수 있음
		
		//arr[0] = 10; // 1차원에는 값을 저장할 수 없음
		arr[0] = new int[5]; //배열을 저장해야 함
		arr[0][0] = 10; //값을 저장하려면 2차원 인덱스까지 접근해야함
		arr[0][1] = 20;
		arr[1][0] = 100;
		System.out.println(arr.length); //1차원 배열의 길이
		System.out.println(arr[0].length); //2차원 배열의 길이
		
		//2차원 배열 => for문 2개
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		//3명의 학생이 과목별로 5개의 점수가 있음
		int[][] scores = new int [3][5];
		int[]sum = new int[scores.length];
		double[] avg = new double[scores.length];
		for (int i = 0; i < scores.length; i++) {  //학생 돌리기 위함
			for (int j = 0; j < scores[i].length; j++) {  //과목 돌리기 위함
				scores[i][j] = (int)(Math.random()* 101); //0~100까지
				sum[i] += scores[i][j]; 
			}
			avg[i] = (double)sum[i]/ scores[i].length; //과목을 다 합치고 나서 평균 시작되야함
			System.out.println("합계 : " +sum[i] + " 평균 : " + avg[i]);
			
		}
		System.out.println(Arrays.toString(sum));
		System.out.println(Arrays.toString(avg));
		//각 합계와 평균 저장
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
