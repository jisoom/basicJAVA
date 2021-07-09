package test;

import java.util.Arrays;

public class sem_multiple {

	public static void main(String[] args) {
		int []arr = new int[100];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int[]tempArr = new int[100];
		int n = (int)(Math.random()*4)+2;  //2~5 사이 랜덤 수 발생
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % n == 0){
				tempArr[count++] = arr[i];
			}
		}
		
		int[]resultArr = new int[count];
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = tempArr[i];
		}
		
		for (int i = 0; i < resultArr.length-1; i++) {
			int min = i;
			for (int j = i+1; j < resultArr.length; j++) {
				if(resultArr[j] < resultArr[min]){
					min = j;
				}
			}
			int tmp = resultArr[i];
			resultArr[i] = resultArr[min];
			resultArr[min] = tmp;
		}
		System.out.println("n :" +n);
		System.out.println(Arrays.toString(resultArr));
		
		
		
		
		
		
		
		

	}

}
