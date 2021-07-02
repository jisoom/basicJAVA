package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import e_oop.ScanUtil;

public class F_JBoard {
	
	public static void main(String[] args) {
		new F_JBoard().start();
	}
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "zisoom";
	String password = "java";

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
//	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
	
	private void start() {
		while(true){
			try {
				con = DriverManager.getConnection(url, user, password);
				String sql = "SELECT BOARD_NO, TITLE, USER_ID, to_char(REG_DATE,'yy-mm-dd') AS REG_DATE "
						+ "FROM TB_JDBC_BOARD";
				ps = con.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				System.out.println("-------------------------------------------------------");
				System.out.println("번호\t" + "제목\t" + "작성자\t" + "작성일\t");
				System.out.println("-------------------------------------------------------");
				while(rs.next()){
	
					System.out.println(rs.getInt("board_no") + "\t" 
					                   + rs.getString("title") + "\t"
					                   + rs.getString("user_id") + "\t"
					                   + rs.getString("reg_date"));
				}
				System.out.println("-------------------------------------------------------");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(rs != null) try {rs.close();} catch(Exception e) {}
				if(ps != null) try {ps.close();} catch(Exception e) {}
				if(con != null)try {con.close();} catch(Exception e) {}
			}
			
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.println("입력>");
			int input = ScanUtil.nextInt();
			
			switch(input){
			case 1 :
				select(); //조회
				break;
			case 2:
				insert(); //등록
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
			
		}

	}

private void insert() {
	System.out.println("제목>");
	String title = ScanUtil.nextLine();
	System.out.println("내용>");
	String content = ScanUtil.nextLine();
	System.out.println("작성자>");
	String username = ScanUtil.nextLine();
	
	try {
		con = DriverManager.getConnection(url, user, password);
		String sql = "INSERT INTO TB_JDBC_BOARD VALUES("
				+ "(SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD), ?, ?, ?, SYSDATE)";
		ps = con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setString(3, username);
		
		int result = ps.executeUpdate();
		if(result >0){
			System.out.println("등록이 완료되었습니다.");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

private void select() {
	System.out.println("조회할 게시글 번호 입력>");
	int input = ScanUtil.nextInt();
	int boardNo = 0;
	
	try {
		con = DriverManager.getConnection(url, user, password);
		String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, TO_CHAR(REG_DATE,'YY-MM-DD') AS REG_DATE "
				+ "FROM TB_JDBC_BOARD "
				+ "WHERE BOARD_NO = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, input);
		
		rs = ps.executeQuery();
		
		while(rs.next()){
			boardNo = rs.getInt("board_no");
			System.out.println("번호\t : "+rs.getInt("board_no"));
			System.out.println("작성자\t : "+rs.getString("user_id"));
			System.out.println("작성일\t : "+rs.getString("reg_date"));
			System.out.println("제목\t : "+rs.getString("title"));
			System.out.println("내용\t : "+rs.getString("content"));
		}
				
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		if(rs != null) try {rs.close();} catch(Exception e) {}
		if(ps != null) try {ps.close();} catch(Exception e) {}
		if(con != null) try {con.close();} catch(Exception e) {}
	}
	
	System.out.println("1.수정\t2.삭제\t0.목록");
	System.out.print("입력>");
	input = ScanUtil.nextInt();
	
	switch(input){
	case 1 :
		update(boardNo);
		break;
	case 2:
		delete(boardNo);
		break;
	}
	
	
	
	
	
	
}

private void delete(int boardNo) {
	try {
		con = DriverManager.getConnection(url, user, password);
		String sql = "DELETE FROM TB_JDBC_BOARD "
				+ "WHERE BOARD_NO = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		
		int result = ps.executeUpdate();
		if(result > 0){
			System.out.println("삭제가 완료되었습니다.");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

private void update(int boardNo) {
	System.out.println("제목>");
	String title = ScanUtil.nextLine();
	System.out.println("내용>");
	String content = ScanUtil.nextLine();
	
	try {
		con = DriverManager.getConnection(url, user, password);
		String sql = "UPDATE TB_JDBC_BOARD "
				+ "SET TITLE = ?, CONTENT = ? "
				+ "WHERE BOARD_NO = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setInt(3, boardNo);
		
		int result = ps.executeUpdate();
		if(result >0){
			System.out.println("수정이 완료되었습니다.");
		}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

}
