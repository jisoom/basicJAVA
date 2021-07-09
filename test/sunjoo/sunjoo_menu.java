package test.sunjoo;

public class sunjoo_menu {
	
	//선주가 먹고싶은 거 주문 받는 메서드 (지수가 선주한테 제공해야할 것 : 없음 , 결과 줘야될 것 : 메뉴종류)
	String []order(){
		System.out.println("나 심선주가 먹고싶은 건 말야...");
		return new String[]{"파인애플 피자","동태찌개"};
	}
	//지수가 요리해서 제공하는 메서드 (지수가 선주한테 제공해야 할 것 : 음식 , 결과 줘야될 것  : 없음)
	void serving (String[]foods){
		System.out.println("우와 내가 좋아하는 것들 투성이네 잘먹을게~~");
	}
	//요리 먹고 감탄하는 메서드 (지수가 선주한테 제공해야 할 것 : 없음, 결과 줘야될 것 : 감탄사)
	String result(){
		return "우와 정말 맛있다 내가 태어나서 먹어본 음식 중에 제일 맛있어";
	}
}
