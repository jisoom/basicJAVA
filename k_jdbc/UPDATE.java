package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UPDATE {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "zisoom";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
//		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "UPDATE EMP "
						+ "SET DEPTNO = ? "
						+ "WHERE ENAME = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 20);
			ps.setString(2, "JISOO");
			
			int result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
//			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}

	}

}
