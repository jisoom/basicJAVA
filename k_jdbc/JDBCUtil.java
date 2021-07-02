package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {
	//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴  (여러군데서 사용을해도 객체가 하나만 생성이됨)
	//디자인 패턴 : 클래스를 구성하는 패턴 (건축양식같은 느낌)
	//생성자에 private가 붙어있으면 호출할 수 없으므로 객체생성도 할 수 없음
	//싱글톤 패턴을 사용하면 메모리를 절약하고, 객체생성을 여러번 하지 않으니까 속도도 더 빨라짐
	
	private JDBCUtil(){ //이 생성자는 이 클래스 안에서만 사용할 수 있는 것이 됨, 다른 클래스에서 객체생성 못하도록
		
	}
	
	//인스턴스를 보관할 변수
	private static JDBCUtil instance; //기본 값 : null
	
	//인스턴스를 빌려주는 메서드
	public static JDBCUtil getInstance(){ 
		if(instance == null){
			instance = new JDBCUtil();
		}
		return instance;
	}
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "zisoom";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	
	/*
	 * 메서드 종류
	 * Map<String, Object> selectOne(String sql)
	 * //조회의 결과가 한 줄일 때 사용하는 메서드, 물음표가 없는 쿼리
	 * 
	 * Map<String, Object> selectOne(String sql, List<Object> param)
	 * //물음표가 있는 쿼리 List<Object> param 에 물음표에 들어갈 값을 넣어줌,물음표 순서대로 저장해야되기 때문에 어레이리스트 사용
	 * 
	 * List<Map<String, Object>> selectList(String sql)
	 * //조회의 결과가 여러 줄 일 때 사용하는 메서드, 물음표가 없는 쿼리
	 *  
	 * List<Map<String, Object>> selectList(String sql, List<Object> param) ★☆ 얘만 해봄
	 * //물음표가 있는 쿼리
	 * 
	 * int update(String sql)
	 * //select를 제외한 나머지를 할 때 사용하는 메서드
	 * 
	 * int update(String sql, List<Object> param)
	 * //영향을 받은 행의 갯수, 물음표 값
	 */
	
	public List<Map<String, Object>> selectList(String sql, List<Object> param){
		List<Map<String, Object>> list = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			for(int i = 0; i <param.size(); i++){
				ps.setObject(i+1, param.get(i)); //어레이리스트의 인덱스는 0부터 시작이지만, 물음표의 인덱스는 1부터 시작  ==> i+1
			}
			rs = ps.executeQuery(); //select
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				HashMap<String, Object> row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					String key = metaData.getColumnName(i);  //해시맵의 키 : 컬럼의 이름
					Object value = rs.getObject(i); //해시맵의 값 : 값
					row.put(key, value); //해시맵에 키와 값 넣어주기
				}
				list.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}
				
		return list;
	}
	
	public Map<String, Object> selectOne(String sql){
		Map<String, Object> row = null; //null로 초기화를 해줌
//		Map<String, Object> row = new HashMap<>(); 와의 차이 한줄이 나올 것으로 예상은 하지만 많이 나오거나 아예 안나올 수도 있음
		//아예 안나올 경우 null으로 해야 아예 안나온 것을 알 수 있는데 new HashMap을 해줄 경우 해쉬맵이라는 객체가 반환됨
		
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					String key = metaData.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);
			}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}
		return row;


	}
	
	public Map<String, Object> selectOne(String sql, List<Object> param){
		Map<String, Object> row = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i+1, param.get(i));
			}
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					String key = metaData.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);
				}
			}
		

		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}
		
		return row;
		
	}
	
	public List<Map<String, Object>> selectList(String sql){
		List<Map<String, Object>> list = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()){
				Map<String, Object> row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					String key = metaData.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);
				}
				list.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}
		return list;
		
	}
	
	public int update(String sql){
		int result = 0;  //초기화가 안된 상태에서 변수를 사용할 수는 없음 =0해줘야됨
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}
		
		return result;
	}
	
	public int update(String sql, List<Object> param){
		int result = 0;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i+1, param.get(i));
			}
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}
		
		return result;
		
	}
	
	
	
	
	
	
	
}
