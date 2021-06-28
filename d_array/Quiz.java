package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		//거스름돈 동전 개수
		int money =(int)(Math.random() * 500) *10;
		int[]coin = {500, 100, 50, 10};
		System.out.println("거스름돈 : " + money);
		
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
		
		for (int i = 0; i < coin.length; i++) {
			int a = money/coin[i];
			money %= coin[i];
			System.out.println(coin[i] + "원 : " + a + "개");
		}
		
		
		//그래프 그리기
		int[] gra = new int[20];
		for (int i = 0; i < gra.length; i++) {
			gra[i] =(int)(Math.random() * 5) +1;
		}
		System.out.println(Arrays.toString(gra));
		
		/*
		 * 1~5 사이의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * [4,3,2,1,1,1,4,4,5,5,3,5,2,3,1,2,3,1,2,4]
		 * 1:*****5
		 * 2:****4
		 * 3:****4
		 * 4:****4
		 * 5:***3
		 */
		

		//이해 하나도 안됨
		int counts[] = new int[5];
		for (int i = 0; i < gra.length; i++) {
			counts[gra[i]-1]++;
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + 1 + " : " );
		for (int j = 0; j < counts[i]; j++) {
			System.out.print("*");
		}
		System.out.println(" " + counts[i]);
		}
		
		//중복되지 않는 배열
		int[] arr = new int[10];
		for(int i =0; i <arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		/*
		 * 1~5사이의 랜덤한 값이 10개에 저장된 배열에서 중복된 값이 제거된 배열을 만들어 주세요.
		 * [4,2,1,2,5,1,4,4,2,1]
		 * [4,2,1,5]
		 */
		

		
		int[]temp = new int[5];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag =true;
			for (int j = 0; j < temp.length; j++) {
				if(arr[i] == temp[j]){
					flag =false;
				}
			}
			if(flag){
				temp[count++] = arr[i];
			}
		}
		int[] result = new int[count];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));


		

		
	}

}
