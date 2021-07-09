package test;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		
		//선택정렬
		
		//배열 이름 arr에 랜덤으로 10개의 숫자를 넣어주세요
		int[]arr = new int[10];
		
		//0~9까지 총 10개의 랜덤 숫자 넣어주기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//선택 정렬 : 0~9까지 총 10개의 숫자를 비교해서 최소값의 위치를 찾고 가장 처음 위치에 넣어준다
		//한번 실행 한 후에는 가장 처음 위치를 제외한 숫자들을 비교해서 두번째 위치에 넣어준다 (반복)
		
//		for (int i = 0; i < arr.length-1; i++) {
//			int min = i;
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[min] > arr[j]){
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		//버블정렬
//        for (int i = 0; i < arr.length-1; i++) {
//        	boolean flag = true;
//			for (int j = 0; j < arr.length-1-i; j++) {
//				if(arr[j]>arr[j+1]){
//				int temp = arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=temp;
//				flag = false;
//				}
//			}
//			if(flag){
//				break;
//			}
//		}		
//        System.out.println(Arrays.toString(arr));

		//삽입정렬
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if(temp < arr[j]){
					arr[j+1] = arr[j]; 
				}else{
					break;
				}
				arr[j+1]=temp;
			}
		}

        
        
        
        
        
        
        
        
	}

}
