package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class lprod {

	public static void main(String[] args) {
		/*
		 * JDBC 작성단계
		 * 1. Connection 생성(DB연결)
		 * 2. Statement 생성(쿼리 작성)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기 (순서대로)
		 */
		
		//데이터 베이스 접속정보
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "zisoom";
		String password ="java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM LPROD";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				int lprod_id = rs.getInt(1);
				String lprod_gu = rs.getString(2);
				String lprod_nm = rs.getString(3);
				
				System.out.println("lprod_id : " +lprod_id+"\t" +
									"lprod_gu : " +lprod_gu +"\t" +
									"lprod_nm : " + lprod_nm);	
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
