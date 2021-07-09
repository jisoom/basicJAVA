package test;

import java.util.Arrays;

public class multiple {

	public static void main(String[] args) {
		/*
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해 주세요.
		 * 5
		 * [5,10,15,20,25,30]
		 */
		
		//100개 숫자 랜덤으로 받을 배열 만들기
		int []arr = new int[100];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		//나누기를 할 숫자 랜덤으로 출력하기
		int random = (int)(Math.random()*4)+2;
		System.out.println(random);
		
		//나누어서 나머지가 0인 숫자 받을 배열 만들기
		int temp[] = new int[arr.length];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % random ==0){
				temp[count++] = arr[i];
			}
		}
		
		//중복 제거하기
		int []result = new int[count];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		
		int[]result2 = new int[result.length];
		int count2 = 0;
		
		for (int i = 0; i < result.length; i++) {
			boolean flag =true;
			for (int j = 0; j < result2.length; j++) {
				if(result[i] == result2[j]){
					flag =false;
				}
			}
			if(flag){
				result2[count2++] = result[i];
			}
		}
		//정렬하고 출력하기
		int []result3 = new int[count2];
		for (int i = 0; i < result3.length; i++) {
			result3[i] = result2[i];
		}
		
		for (int i = 0; i < result3.length-1; i++) {
			for (int j = 0; j < result3.length-1-i; j++) {
				if(result3[j]> result3[j+1]){
					int t = result3[j];
					result3[j] = result3[j+1];
					result3[j+1] = t;
				}
	
			}
			
		}
		System.out.println(Arrays.toString(result3));
		
		

	}

}
