package j_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * Collections Framework
		 * -다수의 데이터를 다루기 위한 표준 방식
		 * -List
		 * -Map
		 * -Set
		 * 
		 * ArrayList의 주요 메서드
		 * -처음에 길이가 0인데 저장을 하면 저장한 만큼 길이가 늘어남 ex)10개 저장 -> 길이: 10, 값 삭제 ->길이 줄어듦
		 * -길이가 부족해지면 보통 2배씩 늘림
		 * -boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * -void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * (5번인덱스까지 저장되어있는데 7번 인덱스에 저장할 수는 없음)
		 * -Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * (add - 기존 값 밀려남, set - 기존값 덮어씀)
		 * -Object get(int index) : 지정된 위치의 객체를반환한다.
		 * -int size() : 저장된 객체의 수를 반환한다.
		 * -Object remove(int index) : 지정된 위치의 객체를 제거한 후 제거된 값을 반환한다.
		 */

		//ArrayList는 타입지정하지 않고 아무타입 사용할 수 있음
		ArrayList sample = new ArrayList();
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		//타입 상관없이 써서 좋지만 꺼냈을 때 타입을예측할 수 없음
		
		//Collection은 <>안에 타입을 객체로 지정해줌 ==> 제네릭이라고 함
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(10));
//		list.add("abc"); ==>문자열 저장은 컴파일 에러 발생
		list.add(20); //자동으로 형변환됨

		
		/*
		 * 래퍼 클래스 : 기본형 타입을 객체로 사용해야될 때 ex) int 대신 Integer객체를 저장함
		 * 래퍼 클래스 (기본형 타입과 래퍼클래스 간에는 자동으로 형변환이 됨)
		 * -byte  		: Byte
		 * -short  		: Short
		 * -int  		: Integer
		 * -long  		: Long
		 * -float  		: Float
		 * -double 		: Double
		 * -boolean 		: Boolean
		 * -char  		: Character
		 * 
		 */
		
		System.out.println(list); //객체자체를 출력하면 됨
		
		list.add(1, 30); //1번 인덱스에 30저장
		System.out.println(list);
		// 30이 1번 인덱스에 저장되고, 기존 값 20은 뒤로 밀려남
		
		int before = list.set(2, 40); //2번 인덱스 (20)를 40으로 덮어쓰고 기존 객체반환
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		
		list.remove(1);
		System.out.println(list);
		
		//ArrayList를 제거하는 for문 돌릴때 뒤부터 시작해야함
		for (int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		System.out.println(list);
		
		
//		앞에서부터 지우면 제대로 안지워짐
//		for (int i = 0; i < list.size()-1; i++) {
//			list.remove(i);
//		}
//		System.out.println(list);
		
		
		//list에 1~100사이의 랜덤값을 10개 저장해 주세요.
		for (int i = 0; i < 10; i++) {
//			list.add(i, (int)(Math.random()*100)+1);
			int random = (int)(Math.random()*100)+1;
			list.add(random);
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		avg = (double)sum / list.size();
		
		System.out.println("합계 : " +sum + " /평균 : " +avg );
		
		//최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < min){
				min = list.get(i);
			}
			if(list.get(i) > max){
				max = list.get(i);
			}
		}
		System.out.println("최소값 :" +min + " /최대값 : " + max);
		
		//list를 오름차순으로 정렬해주세요.
		for (int i = 0; i < list.size()-1; i++) {
			min = i;
			for (int j = i+1; j < list.size() ; j++) {
				if(list.get(min) > list.get(j)){
					min =j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
			
//			list.get(i) = list.get(min); 
//			왼쪽 변수에 오른쪽 값을 대입해야하는데 왼쪽이 i인덱스에서 꺼낸 값이기때문에 사용할 수 없음
		}
		System.out.println(list);
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		
		list2.add(list3); //list3이라는 변수를 저장한 게 아니라 그 안에 들어있는 ArrayList를 저장한 것임
		
		list3 = new ArrayList<>(); //list3이라는 그릇을 새로 만드는 게 아니라 안에 내용물만 새로 해준거임
		list3.add(40);
		list3.add(50);
		
		list2.add(list3);
		
		for (int i = 0; i < list2.size(); i++) {
//			ArrayList<Integer> list4 = list2.get(i);
//			for (int j = 0; j < list4.size(); j++) {
//				System.out.print(list4.get(j)+ "\t");
//			}
//			System.out.println();
			for (int j = 0; j < list2.get(i).size(); j++) {
				System.out.print(list2.get(i).get(j)+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
