package f_game;

public class Item {

	//이름
	String name;
	//체력
	int hp;
	//스킬
	int mp;
	//공격력
	int att;
	//방어력
	int def;
	
	//초기화 생성자
	Item(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
	}
	
	//아이템 정보 메서드
	String itemInfo(){
		String info = name + ":";
		if(0 < hp) info += "체력 +" + hp;
		if(0 < mp) info += "마나 +" + mp;
		if(0 < att) info += "공격 +" + att;
		if(0 < def) info += "방어 +" + def;
		return info;
	}
}
