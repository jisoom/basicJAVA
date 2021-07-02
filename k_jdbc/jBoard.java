package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import e_oop.ScanUtil;

public class jBoard {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "zisoom";
	String password = "java";
	
	public static void main(String[] args) {
		jBoard j = new jBoard();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		while(true){
		System.out.println("=====================================================================");
		try {
			con = DriverManager.getConnection(j.url, j.user, j.password);
			String sql = "SELECT * FROM TB_JDBC_BOARD";  //컬럼명을 다 적어주는 게 쿼리 실행속도가 더 빠름 (*말고)
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next()){
				for (int i = 1; i <= columnCount; i++) {
					Object value = rs.getObject(i);
					System.out.print("\t" +value);
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
		System.out.println("---------------------------------------------------------------------");
		System.out.println("=====================================================================");
		System.out.println("1.조회\t2.등록\t0.종료");
		System.out.print(">");
		int input = ScanUtil.nextInt();
		
			switch (input) {
			case 1:
				select(); // 조회
				break;
			case 2:
				insert(); // 등록
				break;
			case 0:
				System.out.println("종료되었습니다."); // 종료
				System.exit(0);
				break;

			}
		}

	}
	
	  static void insert() {
			jBoard j = new jBoard();
			
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
			con = DriverManager.getConnection(j.url,j.user,j.password);
			String sql = "INSERT INTO TB_JDBC_BOARD "
								+ "VALUES((SELECT NVL(MAX(BOARD_NO),0)+1 FROM TB_JDBC_BOARD), ?, ?, ?, SYSDATE)";
			
			ps = con.prepareStatement(sql);
			System.out.print("TITLE : >");
			String c2 = ScanUtil.nextLine();
			System.out.print("CONTENT : >");
			String c3 = ScanUtil.nextLine();
			System.out.print("WRITER : >");
			String c4 = ScanUtil.nextLine();
			
			ps.setString(1, c2);
			ps.setString(2, c3);
			ps.setString(3, c4);

			int result = ps.executeUpdate();
			System.out.println(result + "만큼의 행이 등록되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(ps != null) try {ps.close();} catch(Exception e){}
			if(con != null) try {con.close();} catch(Exception e){}
		}
		
		
	}

	static void select() {
		jBoard j = new jBoard();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		int boardNo = 0;
		System.out.print("읽고싶은 게시글 번호 입력 >");
		boardNo = ScanUtil.nextInt();
		try {
			con = DriverManager.getConnection(j.url, j.user, j.password);
			String sql = "SELECT * FROM TB_JDBC_BOARD "
					+ "WHERE BOARD_NO =?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, boardNo);

			rs = ps.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			System.out.println("=============================================");
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(metaData.getColumnName(i) + "\t");
			}
			System.out.println();
			while (rs.next()) { //while 대신 if도 괜찮음
				for (int i = 1; i <= columnCount; i++) {
					Object value = rs.getObject(i);
					System.out.print("\t" +value);
				}
				System.out.println();
			}
			System.out.println("=============================================");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)try {rs.close();} catch (Exception e) {}
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e) {}
		}
		
		System.out.println("1.수정\t2.삭제\t0.목록");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1:
			update(boardNo);  //수정
			break;
		case 2:
			delete(boardNo);  //삭제
			break;
		case 0:
			break;
		}
	
	}

	  static void delete(int boardNo) {
		  jBoard j = new jBoard();
			
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			try {
				con = DriverManager.getConnection(j.url, j.user, j.password);
				String sql = "DELETE TB_JDBC_BOARD WHERE BOARD_NO = ?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, boardNo); //현재 조회하고 있는 숫자
				
				int result = ps.executeUpdate();
				System.out.println(result + "만큼의 행이 삭제되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(ps != null) try {ps.close();} catch(Exception e){}
				if(con != null) try {con.close();} catch(Exception e){}
			}
		
		
	}

	static void update(int boardNo) {
			jBoard j = new jBoard();
			
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;

			
			try {
				con = DriverManager.getConnection(j.url, j.user, j.password);
				String sql = "UPDATE TB_JDBC_BOARD SET TITLE = ?,CONTENT = ? WHERE BOARD_NO = ?";
				ps = con.prepareStatement(sql);
				System.out.print("TITLE : >");
				String title = ScanUtil.nextLine();
				System.out.print("CONTENT : >");
				String content = ScanUtil.nextLine();
				ps.setString(1, title);
				ps.setString(2, content);
				ps.setInt(3, boardNo); //현재 조회하고 있는 숫자
				
				int result = ps.executeUpdate();
				System.out.println(result + "만큼의 행이 수정되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(ps != null) try {ps.close();} catch(Exception e){}
				if(con != null) try {con.close();} catch(Exception e){}
			}
		
	}

}
