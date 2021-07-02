package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * -자바와 데이터베이스를 연결해주는 라이브러리
		 * -ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성단계
		 * 1. Connection 생성(DB연결)
		 * 2. Statement 생성(쿼리 작성)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기 (순서대로)
		 */
		
		/*
		 * JavaProgramming 우클릭 -> build path -> configure build path
		 * libraries -> add external JARs -> ojdbc6 열기 
		 * ==> Referenced Libraries생성됨
		 * 이 파일이 없어도 코드 작성은 할 수 있지만 실행이 안됨
		 */
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "zisoom";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스 //자바와 오라클을 연결해주는 중간다리역할을 함  ctrl+1
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM MEMBER";
			ps = con.prepareStatement(sql);
			
			//select
			rs = ps.executeQuery(); //select를 한 결과
			
			//insert, update, delete
			//int result = ps.executeUpdate(); //몇줄이 영향을 받았는지에 대해 int타입으로 알려줌
			
			//rs.next() : ResultSet은 현재 바라보고 있는 행의 데이터만 추출, next를 호출하면 조회된 결과중에 첫번째 행을 바라봄(다음행을 바라보게 됨)
			//조회될 다음행이 없을 때 종료됨
			//한 줄의 컬럼을 하나씩 가져옴
			while(rs.next()){
				String memId = rs.getString(1);
				String memPass = rs.getString("MEM_PASS");
				System.out.println("MEM_ID :" + memId + "/MEM_PASS : " + memPass);
//				rs.getInt(columnIndex)
//				rs.getDate(columnIndex)
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}
		
		
		
		
		

	}

}
