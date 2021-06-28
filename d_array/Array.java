package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * -여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * -참조형 타입이다.
		 * -인덱스로 값을 구분한다. (번호를 붙여서 구분함)
		 * -길이를 변경할 수 없다. (처음 만들 때 몇 개 값을 저장할지에 대한 길이를 정함-> 바꿀 수 없음)
		 *  배열을 저장한 변수에는 주소가 있고 그 주소를 따라가 보면 실제 배열이 있음
		 */
		
		/*
		 * 변수 = 주소(100번지)
		 * 
		 * 
		 * 100번지 : 첫번째 값의 주소
		 * {0, 0, 0, 0, 0} 100번지, 101번지, ...,104번지
		 * 배열의 값들은 연속으로 저장이 되고 주소는 첫번째에 저장함
		 * 
		 */
		
		
		//배열 변수 초기화 방법
		int[] array; //배열을 저장할 수 있는 변수가 됨 int array[];으로 해도 되는데 보통 타입 옆에 []붙임
		array = new int[5]; //[5] 배열의 크기, 길이, 저장할 값의 갯수 ==> int 5개를 저장할 수 있는 공간 만들어짐, 주소가 저장이 됨 
		// 5개의 기본 값이 들어가져 있음 int값의 기본값은 0 : 0이 5개 들어있음
		
		array = new int[]{1, 2, 3, 4, 5}; //실제 넣어주고 싶은 값을 넣어 준 채로 초기화 됨, 5개의 값이 저장되어 있으니까 길이 : 5가 됨
		
		
		int []array2 = {1, 2, 3, 4, 5}; //new int[] 생략하고 사용하는 방법 , 초기화만 따로 할 수 없음, 반드시 선언과 초기화 동시에 해야함 
		
		//인덱스 (변수명[]) : 0부터 시작함
		 System.out.println(array[0]);
		 System.out.println(array[1]);
		 System.out.println(array[2]);
		 System.out.println(array[3]);
		 System.out.println(array[4]);
		
		//배열에 값 저장하기
		 array[0] = 10;
		 array[1] = 20;
		 array[2] = 30;
		 array[3] = 40;
		 array[4] = 50;
		
		//배열은 for문과 함께 자주 사용함
		
		for(int i = 0 ; i < array.length; i++){
			// array.length : 배열의 길이 
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = (i + 1) * 10;
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요
		int [] arr;
		arr = new int[10];   //int[]arr = new int[10];
		
		//배열의 모든 인덱스에 1~100 사이의 랜덤한 값을 저장해주세요
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() *100) +1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//배열에 저장된 모든 값의 합계와 평균을 출력해 주세요
		int sum = 0;
		for(int i =0; i < arr.length; i++){
			sum += arr[i];
		}
		
		double avg = (double)sum / arr.length;
		System.out.println("sum : " + sum + " avg : " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해 주세요
		System.out.println(Arrays.toString(arr));
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int t = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = t;
//				}
//			}
//		}
//		System.out.println(arr[0]);
//		System.out.println(arr[9]);
		
		int min = arr[0];
		int max = arr[0];
		for(int i =0 ; i <arr.length; i++){
			if(arr[i] <min){
				min = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("min : " + min + " / max : " +max);

		
		
		
		//값이 뒤죽박죽 나오게 섞기 (0~9까지 랜덤 숫자 발생 => 인덱스로 사용 )
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열의 값을 섞어주세요

		for(int i = 0; i<shuffle.length; i++){
			int random = (int)(Math.random()* shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		// 1 ~ 10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요
		int []counts = new int[10];
		
		for(int i =0; i <500; i++){
			int random = (int)(Math.random()* 10)+1;
			
//			if(random ==1) counts[0]++;
//			if(random ==2) counts[1]++;
//			if(random ==3) counts[2]++;
			
			counts[random -1]++;
		}
			System.out.println(Arrays.toString(counts));
			



		
		

		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
