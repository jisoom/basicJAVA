package k_jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCTest {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		
		//selectList(sql, param)
//		String sql = "SELECT * FROM CART WHERE CART_MEMBER = ?";
//		ArrayList<Object> param = new ArrayList<>();
//		param.add("a001");
//		
//		List<Map<String, Object>> list = jdbc.selectList(sql, param);
//		for (int i = 0; i < list.size(); i++) {
//			Map<String, Object> row = list.get(i);
//			for (String key : row.keySet()) {
//				System.out.print(key + " : " + row.get(key) + "\t");
//			}
//			System.out.println();
//			
//		}
		
		//selectOne(sql)
//		String sql = "SELECT * FROM EMP WHERE EMPNO = 7369";
//		Map<String, Object> row = jdbc.selectOne(sql);
//		for(String key : row.keySet()){
//			System.out.print(key + ":" + row.get(key) + "\t");
//		}
		
		//selectOne(sql, param)
//		String sql = "SELECT * FROM EMP WHERE EMPNO = ?";
//		ArrayList<Object> param = new ArrayList<>();
//		param.add(7369);
//
//		Map<String, Object> row = jdbc.selectOne(sql, param);
//		for (String key : row.keySet()) {
//			System.out.print(key + ":" + row.get(key) + "\t");
//		}
		
		//selectList(sql)
//		String sql = "SELECT * FROM CART WHERE CART_MEMBER = 'a001'";
//		List<Map<String, Object>> list = jdbc.selectList(sql);
//		for (int i = 0; i < list.size(); i++) {
//			Map<String, Object> row = list.get(i);
//			for(String key : row.keySet()){
//				System.out.print(key+ ":" + row.get(key) + "\t");
//			}
//			System.out.println();
//		}
		
//		String sql = "UPDATE EMP SET EMPNO = 1104 WHERE EMPNO = 8593";
//		int result =jdbc.update(sql);
//		System.out.println(result + "만큼의 행이 영향을 받았습니다.");
		
		String sql = "UPDATE EMP SET EMPNO = ? WHERE EMPNO = ?";
		ArrayList<Object> param = new ArrayList<>();
		param.add(1000);
		param.add(1104);
		int result = jdbc.update(sql, param);
		System.out.println(result + "만큼의 행이 영향을 받았습니다.");
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
}
