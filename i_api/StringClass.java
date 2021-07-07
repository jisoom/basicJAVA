package i_api;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * String
		 * -여러개의 문자를사용하기 쉽게 만들어 놓은 클래스
		 * 
		 * String의 주요 메서드ㅡ
		 * -equals() : 문자열의 내용이 같은지 반환한다.
		 * -length() : 문자열의 길이를 반환한다.
		 * -charAt() : 특정 인덱스에 위치한 문자를 반환한다.
		 * -substring() : 문자열의 특정 부분을 잘라서 반환한다.
		 * -indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.
		 * -contains() : 문자열이 특정 문자열을 포함하고 있는지 여부를 반환한다.
		 * -split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
		 * -trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 * -valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.
 		 */
		
		boolean equals = "문자열".equals("문자열");  //앞에있는 문자열과 파라미터로 넘겨진 문자열의 내용이 같은지 다른지 
		System.out.println(equals);
		
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2));
//		System.out.println(str2.equals(str1));  //앞에 있는게 null이 오면 null을 문자열이랑 비교할 수 없음
		//null이 들어오지 않을 변수만 앞에 사용 (파라미터에는 null이 들어와도 상관없음)
		
		String str = "12345";
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i); //반환타입 char //문자열 아님
			System.out.println(charAt);
		}
		
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다. 반환 타입 String
		System.out.println(sub1);
		String sub2 = str.substring(5,8); //5번 인덱스부터 8번 인덱스 전까지 잘라서 반환한다.
		System.out.println(sub2);
		
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지"); //오렌지 위치 3 출력
		System.out.println(index);
		
		String[] menu = { //과일의 이름이 공백 전에 끝남
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"				
		};
		
		for (int i = 0; i < menu.length; i++) {
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.println(name);

		//가격만 잘라서 int타입 변수에 저장해주세요. Integer.parseInt!!!!!!!!!!
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1, menu[i].indexOf("원")));
			System.out.println(price);
		}
		
		str = "abcd";
		boolean contains = str.contains("c");  //반환타입 : boolean
		System.out.println(contains);
		
		for (int i = 0; i < menu.length; i++) {
			if(menu[i].contains("오렌지")){
				System.out.println("오렌지는"+ i+ "번 인덱스에 있습니다.");
			}
		}
		
		str = "a/b/c";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));
		// a/b/c가 /로 쪼개져서 하나씩 배열로 들어가게 됨
		
		for (int i = 0; i < menu.length; i++) {
			String[] split2 = menu[i].split(" ");
			System.out.println("메뉴명 : " + split2[0] + " / 가격 : " + split2[1]);
		}
		
		
		//trim ==>문자열 앞뒤에 있는 공백 없애줌(중간에 있는 공백은 없애주지 않음)
		str = "  문 자 열    ";
		String trim = str.trim();
		System.out.println("[" +str+ "] -> [" +trim+ "]");
		//사용자의 입력실수 방지해줄 수 있음 (아이디나 비밀번호에 실수로 앞이나 뒤에 공백 들어갔을 때)
		String id= " myid";
		String password = "mypassword ";
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim());
		System.out.println(password.trim());
		
		int number = 10;
		str = String.valueOf(number); //정석
		str = number + ""; //꼼수

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
