package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DELETE {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "zisoom";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
//		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "DELETE EMP "
						+ "WHERE EMPNO =?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 8593);
			
			int result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
//			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}

	}
	//실수로 지웠을 때 복구방법
	/* INSERT INTO MEMBER
	 * SELECT *
	 * FROM MEMBER AS OF TIMESTAMP(SYSTIMESTAMP - INTERVAL '10' MINUTE)
	 * WHERE MEM_ID = 'a001'
	 */

}
