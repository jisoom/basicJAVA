package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규 표현식 : 문자열의 패턴을 검사하는 표현식
		 * 정규 표현식에는 함부로 띄어쓰기 넣으면 안됨
		 * 
		 * 	^ 	뒷문자로 시작
		 * 	$ 	앞문자로 종료
		 * 	. 	임의의 문자(줄바꿈 제외)
		 * 	* 	앞문자가 0개 이상
		 * 	+ 	앞문자가 1개 이상
		 * 	? 	앞문자가 없거나 1개
		 * 	[] 	문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z]:a부터 z가 아닌 것)
		 * 	{} 	앞문자의 개수({2}:2개, {2,4}: 2개 이상 4개 이하) //띄어쓰기 있으면 안됨
		 * 	() 	그룹화(1개의 문자처럼 인식)
		 * 	| 	OR연산
		 * 	\s 	공백, 탭, 줄바꿈
		 * 	\S 	공백, 탭, 줄바꿈이 아닌 문자
		 * 	\w 	알파벳이나 숫자
		 * 	\W 	알파벳이나 숫자가 아닌 문자
		 * 	\d 	숫자
		 * 	\D 	숫자가 아닌 문자
		 *	(?i) 뒷문자의 대소문자 구분 안함
		 *	\ 	정규표현식에서 사용되는 특수문자 표현
		 */
		
		String str = "abc123";
//		String regex = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		/*
		 * 아이디, 전화번호, 이메일 주소의 유효성을 검사하는 정규 표현식을 만들어주세요.
		 */
		
		//아이디 : 5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능
		String id = "rkdwltn5";
		String regex1 = "[a-z0-9_-]+{5,20}";
		
		//전화번호
		String call = "010-8392-3445";
		String regex2 = "^0\\d{1,3}-\\d{3,4}-\\d{4}"; 
		
		//이메일 주소 : 
		String email ="rkdwltn5@naver.com";
		String regex3 = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com | net | org| ([a-z]{2}\\.kr))$";
		//역슬래쉬(\\)는 절대로 하나만 올 수 없음
		Pattern a = Pattern.compile(regex1);
		Matcher b = a.matcher(id);
		System.out.println(b.matches());
		
		Pattern c = Pattern.compile(regex2);
		Matcher d = c.matcher(call);
		System.out.println(d.matches());
		
		Pattern e = Pattern.compile(regex3);
		Matcher f = e.matcher(email);
		System.out.println(f.matches());
		
		
		

	}

}
