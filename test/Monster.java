package test;

public class Monster {

	String name; //이름
	int maxHp; //최대체력
	int maxMp; //최대마나
	int hp; //체력
	int mp; //스킬
	int att; //공격
	int def; //방어
	Item[]items; //아이템
	
	//초기화
	Monster(String name, int hp, int mp, int att, int def, Item[]items){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.items = items;
	}
	//공격하는 메서드
	void attack(Character c){
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp = c.hp < damage ? c.hp -c.hp : c.hp - damage;
		System.out.println(name + "의 공격으로 " + c.name +"에게 " + damage +"만큼의 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 체력 :" +c.hp);
	}
		
	//죽으면서 아이템 떨어뜨리는 메서드
		Item itemDrop(){
			return items[(int)(Math.random()* items.length)];
		}
	
	
	
	
	
}

