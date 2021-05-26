package a_variable; //클래스의 위치

import java.util.Scanner; //Scanner 위치알려줌


public class Variable {//클래스

	public static void main(String[] args) {//메서드(소괄호가 있으면 무조건 메서드임)
		//메서드 : 명령문의 집합
		//main 메서드 : 프로그램의 시작과 끝
		//주석: 프로그램 코드로 인식하지 않는 문장 (주로 코드 설명하는데 사용함)
//		한줄 주석 : ctrl + shift +c
//		여러줄 주석은
//		드래그해서
//		컨트롤 시프트 씨 누르면 됨
		/* 범위 주석 : ctrl +shift +/ (해제 : \)*/
		/*
		 * 데이터의 종류
		 * -정수 : 10, -5
		 * -실수 : 3.14, -1.5
		 * -문자 :'a','3' 프로그래밍에서 문자는 따옴표로 묶여 있는 한 글자
		 * -논리 : true, false 참이냐 거짓이냐
		 * 
		 * 프로그래밍에서는 데이터를 사용하기 위해 종류별로 이름을 붙여놓았다. (자료형/Data Type)
		 * 
		 * 기본형 타입 (데이터가 가지고 있는 크기, *int와 *double을 주로 사용함)
		 * -정수 :byte(1), short(2), *int(4), long(8)
		 * -실수:float(4), *double(8)
		 * -문자: char(2)
		 * -논리: boolean(1)
		 * int : 20억정도 크기의 숫자 표현
		 * byte :128
		 * short:약 3만
		 * long: 900경 정도
		 * double 사용 하는 이유 : 실수는  정수와 저장되는 방식이 달라서 숫자의 표현범위가 넓음 (단위를 모를정도로 큰 범위) 하지만,
		 * 표현범위는 큰 대신 정확한 값을 표현하지 못하고 근사치를 표현하는데, float 보다는 double이 더 정확한 숫자 표현하기 때문
		 * 변수 : 데이터를 저장할 수 있는 공간 (그릇)
		 * 변수를 만들어서 데이터를 만들고 조작하면 프로그래밍이 됨
		 */
		
		//변수를 만드는 것 : 변수 선언
		//변수를 만드는 방법 : 데이터 타입 변수이름
//		int name; //데이터에 대한 의미가 담기면 좋음
//		double pi;
//		//long name; 이름이 한번 사용됬으면 똑같은 이름의 변수를 만들 수 없음 빨간줄 -컴파일 에러/ 노란줄 -문제가 될 수 있음을 경고 한블럭{}안에서 변수이름 중복불가
//		//컴파일 : 컴퓨터가 알아들을 수 있게 번역해주는 것
//		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
//		name = 10; //초기화 : 변수에 처음으로 값을 저장하는 것
//		pi = 3.14; //변수의 타입에 맞는 값을 저장해야한다
//		//세미콜론은 한문장 끝나면 반드시 붙임 안그러면 끝난건지 안끝난건지 구분을 못함
//		
//		int abc = 30; //보통은 변수의 선언과 초기화 동시에 함
//		long l = 40L; //접미사 L을 붙여야 long타입이 된다 l은 1이랑 비슷하게 생겨서 대문자 사용함
//		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다
//		char c = '한'; //따옴표 안에 한글자만 넣어야 한다 공백이라도 한글자가 반드시 들어가 있어야함
//		boolean b = true; //true, false 두가지 값만 가질 수 있음
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.

		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4L;
		float e =5.5f;
		double f =6.6;
		char g ='강';
		boolean h = true;
		
//		System.out.println(name); //콘솔창에 출력해주는 문구 ()안에 출력하고 싶은 변수이름 넣음
//		//실행 : ctrl +f11
//		
//		name = 100; //새로운 값이 들어오면 기존에 있던 값은 없어지고 덮어쓰여짐, 변수에는 하나의 값만 저장할 수 있음
//		System.out.println(name);
		
		//위에서 만든 8개의 변수에새로운 값을 저장하고 출력해주세요
		a = 10;
		b = 20;
		c = 30;
		d = 40L;
		e =55f;
		f =66;
		g ='박';
		h = false;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		/*
		 * 타입 선택의 기준
		 * 
		 * 정수
		 * -byte, short : 메모리를 절약해야 할 때
		 * -int : 기본
		 * -long : int의 범위를 벗어날 때
		 * 
		 * 실수
		 * -float : 메모리를 절약해야 할 때
		 * -double : 기본
		 * 
		 */

		//참조형타입
		//문자열
		String str = "문자 여러개.."; //쌍따옴표로 묶여 있는게 문자열
		System.out.println(str);
		//기본형 타입 : 변수안에 값이 저장되있음 
		//참조형 타입 : 변수안에 값이 들어있지않고 실제 값은 변수 밖에 따로 저장함 -> 값이 들어있는 주소를 저장함
		//참조형 타입은 주소를 타고 들어가야 값이 있음 대부분 클래스임 String이라는게 하나의 클래스임
		
		//형변환 : 다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해주어야 하는데 이를 형변환 (type casting)이라 한다.
		int small = 10;
		long big = 10L;
		
		//small = big; -> 컴파일 에러 //타입이 맞는 것만 해야함 하지만 바꾸고 싶을 때 형변환을 해야함
		small =(int)big;
		big = small; //자동으로 형변환 들어감 (생략됨) =>표현 범위가 작은쪽에서 큰쪽으로의 형변환은 생략이 가능하다.
		//작은 데이터를 큰 그릇에 담는 거는 문제가 없지만 큰 데이터를 작은 그릇에 담기위해서는 형변환을 해야함
		//표현범위 : 얼마만큼의 수를 표현할 수 있는가를 의미 (byte크기 아님) 
		//ex) long은 8byte지만 900경, float은 4byte지만 long보다 더 큼 
		/*
		 * 명명규칙
		 * -영문자 대소문자, 한글, 숫자, 특수문자('_','$') 사용 가능 //한글은 사용할 수 있지만 사용안하는게 좋음
		 * -숫자로 시작할 수 없음 //숫자 사용할 수 있지만 첫글자가 숫자면 안됨
		 * -예약어는 사용할 수 없음 //자바에서 이미 어떤 기능으로 사용하고 있는 단어들 ex) int, long 등
		 * 더진한 글자가 예약어임
		 * -[낙타식 표기법을 사용함 (MySampleVariable)] 
		 * //여러단어로 이루어져있을 때 구분하기 쉽기 위해 첫단어는 소문자 그 다음단어부터는 대문자로 시작
		 * -[클래스명의 첫글자는 대문자로 한다](MySampleClass)] //클래스만 앞글자가 대문자
		 */
		
		/*
		 * 상수
		 * -변수처럼 값을 저장하는 공간이지만 처음 담긴 값을 변경 할 수 없는 저장공간 (그릇)
		 * -리터럴에 의미를 부여하기 위해 사용한다
		 * -리터럴 : ex)10 (변하지 않는 값)
		 */
		final int MAX_NUMBER; //상수는 이름을 대문자로만 적음, 상수로 만들기 위해 앞에 final 붙여줌
		//final 값을 바꾸지 못하게 해주는 예약어 상수의 값을 바꾸려고 하면 컴파일 에러가 발생함
		MAX_NUMBER = 10;
		//MAX_NUMBER = 100; //컴파일 에러 발생
		
		//출력
		System.out.print("줄바꿈을 하지 않는다.");
		System.out.print("줄바꿈을 하지 않는다.\n"); //역슬러시 : 이스케이프문자 (탈출문자)
		System.out.println("줄바꿈을 \t 한다."); // \t : tab을 띄움
		System.out.printf("문자열 : %s, 숫자 : %d", "Hello", 10); // 출력 포맷 지정함 %가 뒤에 있는 값으로 대체됨 %s가 Hello, %d가 10으로 대체됨
		System.out.println(); //printf가 줄바꿈 하지 않아서 하나 만들어줌
		System.out.println("A" + 100); //다른타입의 데이터를 만나게되면 무조건 문자열로 바뀜
		System.out.println(10 + 20 + "30"); //연산이 왼쪽부터 됨 10+20 =30이 되고 , 문자열 30을 만나서 앞에 30이 문자열로 바뀜
		System.out.println("10" + 20 +30); // 10이라는 문자열과 20이라는숫자가 만나서 문자열로 바뀌고 1020이 됨 이 문자열이 30이라는 숫자를 만나면 102030이라는 문자열이됨
	
		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
		//Scanner라는 클래스가 어디에 있는지 모르겠어서 컴파일 에러가 뜸 -> 이 클래스가 어느 패키지에 위치해 있는지 알려줘야함
		// => 맨위 클래스 위치알려주는 거랑 클래스 선언 사이에 Scanner 위치알려줘야 함
		//import java.util.Scanner;
		//import 단축키 : ctrl + shift + o (영어) 자동으로 해줌
		
//		System.out.print("숫자를 입력해주세요.>");
//		int num = sc.nextInt(); //숫자를 먼저 입력받으니까 뒤에 문자열은 그냥 자동으로 넘어감
		
		//문자열 입력받기
//		System.out.println("아무거나 입력해주세요>");
//		String str2 = sc.nextLine(); //nextLine : 문자열을 입력받아주는 메서드 입력받은 내용이 여기에 남고 그내용을 저장할 수있음
//		System.out.println("입력받은 내용 :" +str2);
		
		//정수 입력받기
//		int nextInt = sc.nextInt();
//		double nextDouble = sc.nextDouble();
		// 이런 것들이 있지만 버그로 인해 사용하지 않는 것을 권장한다.
		//숫자 입력받고 문자열을 입력받으면 문자열입력받은 것은 무시되는 버그
		
		//int 입력
//		System.out.println("int 입력 >");
//		//int number = (int)sc.nextLine(); //형변환이 안됨 기본형타입은 기본형끼리만 ,, 기본형과 참조형은 형변환 불가능
//		int number = Integer.parseInt(sc.nextLine()); //문자열 입력받는 거를 정수형 입력받는 거로 변환해줌 Integer.parseInt
//		System.out.println(number);
//		//double 입력
//		System.out.println("double 입력 >");
//		double number2 = Double.parseDouble(sc.nextLine());
//		System.out.println(number2);
		
		//자신의 이름을 저장할 변수를 선언해 주세요.
		String myName; //이름은 보통 여러글자 -> type 반드시 String
		
		//위에서 선언한 변수를 초기화하기 위해 이름을 입력받아 주세요.
		System.out.println("이름을 입력해주세요>");
		myName = sc.nextLine();
		
		//자신의 나이를 저장할 변수를 선언해 주세요.
		int myAge; //나이는 숫자 -> type : int
		
		//위에서 선언한 변수를 초기화하기 위해 나이를 입력받아주세요.
		System.out.println("나이를 입력해주세요>");
		myAge = Integer.parseInt(sc.nextLine());
		//출력
		System.out.println("이름: " +myName + "/ 나이: " +myAge);
		
		//다음과 같은 프로그램을 작성해주세요.
		/*
		 * ========회원가입========
		 * 아이디 > admin
		 * 비밀번호(4자리 숫자)>1234
		 * 이름>홍길동
		 * 나이>30
		 * 키>185.5
		 * =====================
		 * 회원가입 완료!!
		 * ========내정보=========
		 * 아이디 : admin
		 * 비밀번호: 1234
		 * 이름: 홍길동
		 * 나이: 30세
		 * 키: 185.5cm
		 * ======================
		 * 
		 */
	}

}//클래스 내용
