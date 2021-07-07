package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		while(true){
		System.out.println("=====================================================================");
		System.out.println("|번호\t\t|제목\t\t|작성자\t\t|작성일\t\t|");
		System.out.println("---------------------------------------------------------------------");
		for (int i = boardList.size() - 1; i >= 0; i--) {
			HashMap<String, Object> board = boardList.get(i);
			System.out.println(board.get("board_no") + "\t\t"
					+board.get("title") + "\t\t" +board.get("user") + "\t\t"
					+format.format(board.get("reg_date")) + "\t\t");
		}
		System.out.println("=====================================================================");
		System.out.println("1.조회\t2.등록\t0.종료");
		System.out.print(">");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1 :
			read(boardList,format);  //조회
			break;
		case 2 :
			insert(boardList);  //등록
			break;
		case 0 :
			System.out.println("종료되었습니다."); //종료
			System.exit(0);
			break;
			
		}
		
		
		
		
		
		}//while 끝

	}//main 끝

	 static void insert(ArrayList<HashMap<String, Object>> boardList) {
		System.out.println("============================게시글  등록==================================");
		System.out.print("제목 : >");
		String title = ScanUtil.nextLine();
		System.out.print("내용 : >");
		String content = ScanUtil.nextLine();
		System.out.print("작성자명 : >");
		String user = ScanUtil.nextLine();
		
		int maxNo = 0;
		for (int i = 0; i < boardList.size(); i++) {
			int boardNo = (Integer)(boardList.get(i).get("board_no"));
			if(maxNo < boardNo){
				maxNo = boardNo;
			}
		}//최대값 찾아줘서 등록할 때 최대값보다 1 큰 숫자를 번호로 저장하기
		
		HashMap<String, Object> temp = new HashMap<>();
		temp.put("board_no", maxNo + 1);
		temp.put("title", title);
		temp.put("content", content);
		temp.put("user", user);
		temp.put("reg_date", new Date());
		boardList.add(temp);
		System.out.println("=========================게시글이 등록되었습니다.============================");
		
	}

	 static void read(ArrayList<HashMap<String, Object>> boardList, SimpleDateFormat format) {
		System.out.print("읽고싶은 게시글 번호 입력 >");
		int boardNo = ScanUtil.nextInt();
		
		HashMap<String, Object> board =null;
		for (int i = 0; i < boardList.size(); i++) {
			if((int)(boardList.get(i).get("board_no")) == boardNo){
				board = boardList.get(i);
			}
		}
		System.out.println("=====================================================================");
		System.out.println("("+board.get("board_no") + ")\t|" + "제목: "+board.get("title") + "\t|" 
							+ "작성자명: "+board.get("user") + "\t|" + "작성일자: "+format.format(board.get("reg_date")));
		System.out.println("---------------------------------------------------------------------");
		System.out.println(board.get("content") );
		System.out.println("=====================================================================");
		
		System.out.println("1.수정\t2.삭제\t0.목록");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1:
			update(board);  //수정
			break;
		case 2:
			delete(board,boardList);  //삭제
			break;
		case 0:
			break;
		}
		
	}

	  static void delete(HashMap<String, Object> board,ArrayList<HashMap<String, Object>> boardList) {
		for (int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).get("board_no") == board.get("board_no")){
				System.out.println("삭제하시겠습니까? 1.삭제\t2.취소");
				int input = ScanUtil.nextInt();
				switch(input){
				case 1:
					boardList.remove(i);
					System.out.println("게시글이 삭제되었습니다.");
					break;
				case 2 :
					System.out.println("삭제가 취소되었습니다.");
					break;
					
				}

			}
		}


		
	}

	static void update(HashMap<String, Object> board) {
		System.out.print("제목 수정>");
		String title = ScanUtil.nextLine();
		
		System.out.print("내용 수정>");
		String content = ScanUtil.nextLine();
		System.out.println("게시물을 수정하시겠습니까? 1.확인 \t2.취소");
		int input = ScanUtil.nextInt();
		switch(input){
		case 1:
			board.put("title", title);
			board.put("content", content);
			
			System.out.println("게시글이 수정되었습니다.");
			break;
		case 2:
			System.out.println("게시물 수정이 취소되었습니다.");
			break;
			
		}

		
	}

}
