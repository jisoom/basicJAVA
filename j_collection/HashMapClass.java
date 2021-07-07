package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * HashMap
		 * 값을 저장할 때 인덱스로 하지 않고 키로 함 (저장할 때 인덱스라는 개념이 없으므로 순서가 없음)
		 * 
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 */
		
		
		//        키	              값
		HashMap<String, Object> map = new HashMap<>(); //HashMap은 키로 타입을 알 수 있기 때문에 값을 Object로 해주기도 함
		map.put("age", 10); //키는 String 타입으로 해줬기 때문에 문자열로 입력, 값은 키를 통해 예측할 수 있음
		map.put("name", "홍길동");
		map.put("date", new Date()); //import해줌 ==> java.util.date선택
		
		System.out.println(map); //순서라는 개념이 없기 때문에 저장한 순서로 출력되지는 않음
		
		map.put("name", "이순신"); //name이 홍길동에서 이순신으로 바뀜 같은키로 다른 값을 저장하게 되면 그 값을 덮어씀
		
		System.out.println(map);
		
		map.remove("age"); //age가 사라짐
		
		System.out.println(map);
		
//		System.out.println(map.get("name")); : 키가 name인 거의 값이 출력됨
		Object value = map.get("name"); //꺼낼 때 Object로 꺼내지기 때문에 value 타입을 Object로 함
		System.out.println(value);

		//String 타입으로 꺼내고 싶으면 형변환 해줘야함
		String str = (String)map.get("name");
		System.out.println(str);
		
		Set<String> keys = map.keySet(); //Set은 중복된 값을 허용하지 않음, Set에서 값을 꺼낼 수 있는 메서드가 존재하지 않음
		
		//위에 Set<String> keys에서 String 타입으로 만들어져있기때문에 for문에 만들 때 String key : keys라고 함
		//향상된 for문 사용해서 값 꺼내기
		for(String key : keys){ //String key의 key는 a가 와도 상관 없음
			System.out.println(key + ":" + map.get(key)); //String a가 되면 a+ ":" +  map.get(a)여야됨
		}
		
		/*HashMap은 데이터 베이스의 테이블을 표현할 때 자주 사용됨
		 * HashMap 하나로 테이블의 한줄(키, 값)을 저장할 수 있음
		 * 그 한줄이 저장된 HashMap을 ArrayList에 저장하면 테이블이 됨
		 */
		
		HashMap<String, Object> row = new HashMap<>();
		row.put("id", "admin");
		row.put("password", "admin123");
		row.put("name", "관리자");
		row.put("tel", "010-1234-5678");
		
		ArrayList<HashMap<String, Object>> table = new ArrayList<>();
		table.add(row);
		System.out.println(table);
		
		//table에 한명의 데이터를 더 만들어서 저장해주세요
		row = new HashMap<>();
		row.put("id", "강지수");
		row.put("password", "강지수123");
		row.put("name", "사장");
		row.put("tel", "010-1234-0000");
		
		table.add(row);
		System.out.println(table);
		
		
		//lprod 테이블 5개 출력하기
		HashMap<String, Object> lp = new HashMap<>();
		lp.put("LPROD_ID", 1);
		lp.put("LPROD_GU", "P101");
		lp.put("LPROD_NM", "컴퓨터제품");
		
		ArrayList<HashMap<String, Object>> lprod = new ArrayList<>();
		lprod.add(lp);
		
		lp = new HashMap<>();
		lp.put("LPROD_ID", 2);
		lp.put("LPROD_GU", "P102");
		lp.put("LPROD_NM", "전자제품");
		
		lprod.add(lp);
		
		lp = new HashMap<>();
		lp.put("LPROD_ID", 3);
		lp.put("LPROD_GU", "P201");
		lp.put("LPROD_NM", "여성캐주얼");
		
		lprod.add(lp);
		
		lp = new HashMap<>();
		lp.put("LPROD_ID", 4);
		lp.put("LPROD_GU", "P202");
		lp.put("LPROD_NM", "남성캐주얼");
		
		lprod.add(lp);
		
		lp = new HashMap<>();
		lp.put("LPROD_ID", 5);
		lp.put("LPROD_GU", "P301");
		lp.put("LPROD_NM", "피혁잡화");
		
		lprod.add(lp);

		
		//출력
		System.out.println();
		System.out.println("LPROD_ID \t LPROD_GU \t LPROD_NM");
		
		//_lp.get("LPROD_ID")해주려면 _lp의 타입이 HashMap이어야됨
		for (int i = 0; i < lprod.size(); i++) {
			HashMap<String, Object> _lp = lprod.get(i);
				System.out.println(_lp.get("LPROD_ID") + "\t\t" + 
			_lp.get("LPROD_GU") + "\t\t" + _lp.get("LPROD_NM"));
		}

		
		
		

		


	}

}
