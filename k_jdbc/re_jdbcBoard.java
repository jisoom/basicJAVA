package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import e_oop.ScanUtil;

public class re_jdbcBoard {
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "zisoom";
	String password = "java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
	
	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 */
		
		new re_jdbcBoard().start();

	}
	


	private void start() {
		while(true){
			try {
				con = DriverManager.getConnection(url, user, password);
				String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE FROM TB_JDBC_BOARD";
				ps = con.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				System.out.println("-----------------------------------");
				System.out.println("번호\t제목\t작성자\t작성일");
				System.out.println("-----------------------------------");
				while(rs.next()){
					java.util.Date date = rs.getDate("reg_date");
					String regDate = format.format(date);
					
					System.out.println(rs.getInt("board_no") + "\t"
							+ rs.getString("title") + "\t"
							+ rs.getString("user_id") + "\t"
							+regDate);
				}
				System.out.println("-----------------------------------");
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
			
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.println("입력>");
			int input = ScanUtil.nextInt();
			
			switch(input){
			case 1 :
				select();
				break;
			case 2 :
				insert();
				break;
			case 0 :
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
			
			
		}//while문 종료
		
	}//start() 종료

	private void insert() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("작성자>");
		String user = ScanUtil.nextLine();
		
		try {
			con = DriverManager.getConnection(url, this.user, password);
			
			String sql = "INSERT INTO TB_JDBC_BOARD VALUES((SELECT NVL(MAX(BOARD_NO),0)+1 FROM TB_JDBC_BOARD), ?,?,?, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, user);
			
			int result = ps.executeUpdate();
			if(result > 0){
				System.out.println("등록이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
	}

	private void select() {
		System.out.println("조회할 게시물 번호 >");
		int input = ScanUtil.nextInt();
		int boardNo = 0;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE "
					+ "FROM TB_JDBC_BOARD "
					+ "WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, input);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				boardNo = rs.getInt("board_no");
				System.out.println("번호\t: " + rs.getInt("board_no"));
				System.out.println("작성자\t: " + rs.getString("user_id"));
				System.out.println("작성일\t: " + rs.getDate("reg_date"));
				System.out.println("제목\t: " + rs.getString("title"));
				System.out.println("내용\t: " + rs.getString("content"));
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		System.out.println("1.수정\t2.삭제\t0.목록");
		System.out.print("입력>");
		input = ScanUtil.nextInt();
		
		switch(input){
		case 1 :
			update(boardNo);
			break;
		case 2 :
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
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		
	}

	private void update(int boardNo) {
		System.out.println("제목 >");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
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
			if(result > 0){
				System.out.println("수정이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		
	}

}//re_jdbcBoard 종료
