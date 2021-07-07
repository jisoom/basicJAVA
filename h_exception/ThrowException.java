package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 * 예외 발생 시키기
		 * -throw new Exception();
		 * -throw 예약어와 예외 클래스의 객체로 예외를 발생시킬 수 있다.
		 */

		try {
			throw new IOException("예외가 발생한 이유를 만들자"); //강제로 발생시켰기 때문에 예외가 발생한 이유가 없음 ("ㄱㄴㄷㄻㅄ")넣어주면 예외가 발생한 이유가 생김
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		throw new NullPointerException();
		String str = null;
		System.out.println(str.equals("문자열 비교")); //이중에 어떤 변수가 null이구나 라고 생각하면됨
		
		throw new IndexOutOfBoundsException(); //인덱스가 범위를 벗어났다 (5개 값을 저장할 수 있는 배열에는 0~4까지의 인덱스 존재, 5나 6등 존재하지 않는 인덱스 찾으면 에러남 )
		
		
		
		
		
		
		
		
	}

}
