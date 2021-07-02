package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class INSERT {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "zisoom";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
//		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
			String sql = "INSERT INTO EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL) "
								+ "VALUES(?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 8593);
			ps.setString(2, "JISOO");
			ps.setString(3, "DEVELOPER");
			ps.setInt(4, 7839);
			//ps.setObject(x,x)해도 됨
			
//			java.util.Date d = new java.util.Date();
//			d.setYear(21);
//			d.setMonth(10); //월은 0부터 시작이어서 10을 쓰면 11월이됨
//			d.setDate(4);
//			//더이상 사용하는 것을 권장하지 않아서 밑줄 그어져 있음
//			ps.setDate(5, new Date(d.getTime()));
			ps.setDate(5, Date.valueOf("2021-11-04"));
			ps.setInt(6, 3000);
			
			int result = ps.executeUpdate();
			System.out.println(result + "개의 행이 영향을 받았습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
//			if(rs != null) try {rs.close();} catch(Exception e){}
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}

	}

}
