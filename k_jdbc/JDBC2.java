package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "zisoom";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//Statement와 PreparedStatement의 차이
		//물음표를 사용할 수 있느냐 없느냐 PreparedStatement(사용 가능)
		//where절에 값 대신 물음표를 적고 물음표는 코드로 작성해서 따로 넣어줌
		try {
			con = DriverManager.getConnection(url,user,password);
			
			String sql ="SELECT * "
					+ "FROM CART "
					+ "WHERE CART_MEMBER = ? "
					+ "AND CART_QTY >= ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001");  //물음표의 인덱스 : 첫번째 물음표, 값
			ps.setInt(2, 10);
			
			rs = ps.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			//ctrl+1  -> Assign...local variable ==>리턴타입에 맞게 변수 만들어줌
			
			int columnCount = metaData.getColumnCount(); //컬럼수
			
			for (int i = 1; i < columnCount; i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();// 컬럼 이름 출력
			
			while(rs.next()){
				for (int i = 1; i < columnCount; i++) {
					Object value =  rs.getObject(i); //타입에 상관없이 모든 타입 가져올 수 있음
					System.out.print(value + "\t");
				}
				System.out.println();
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
