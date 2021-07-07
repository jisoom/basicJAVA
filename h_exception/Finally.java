package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		/*
		 * finally
		 * -필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * -finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * 자동 자원 반환
		 * -try(변수 선언; 변수선언) {} catch(Exception e) {}
		 * -사용 후 반환이 필요한 객체를 try의 ()안에서 선언하면 try블럭 종료시 자동으로 반환된다.
		 */
		
		FileInputStream fis = null; //파일 읽기
		
		try {
			fis = new FileInputStream("d:/file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close(); //반드시 자원 사용후 닫아줘야 함(반환해줘야함)
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		
		//자동 자원 반환(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){  //FileOutputStream : 파일 쓰는 클래스 (파일 만드는 클래스)
			String str = "아무 내용이나 써보자..";
			byte[] bytes = str.getBytes();
			for (int i = 0; i < bytes.length; i++) {
				fos.write(bytes[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
