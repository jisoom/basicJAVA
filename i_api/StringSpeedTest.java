package i_api;

public class StringSpeedTest {

	public static void main(String[] args) {
		
		//String과 String buffer 속도 차이 비교
		
//		String str ="a";
//		long start = System.currentTimeMillis(); //시간 재기
//		for (int i = 0; i < 200000; i++) {
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start + "ms"); //끝나는 시간 - 시작한 시간 = 걸린시간
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.err.println(end - start +"ms");
		
		//String은 변경을 가하면 객체를 새로 만듦
		
		
		
		
	}

}
