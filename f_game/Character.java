package f_game;

public class Character {

	//이름
	String name;
	//레벨
	int level;
	//최대 체력, 최대 스킬
	int maxHp;
	int maxMp;
	//체력
	int hp;
	//스킬
	int mp;
	//공격력
	int att;
	//방어력
	int def;
	//경험치
	int exp;
	//보유한 아이템
	Item[] items;
	
	//초기화 생성자
	Character(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	//현재 캐릭터의 상태 창 출력 메서드
	void showInfo(){
		System.out.println("==============================");
		System.out.println("-------------상태--------------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100)");
		System.out.println("체력 : " +hp + "/" + maxHp);
		System.out.println("마나 : " +mp + "/" + maxMp);
		System.out.println("공격 : " +att);
		System.out.println("방어 : " +def);
		System.out.println("------------아이템--------------");
		for (int i = 0; i < items.length; i++) {
			if(items[i] != null){
				System.out.println(items[i].itemInfo());
			}
		}
		System.out.println("==============================");
	}
	
	//기본 공격하는 메서드
	void attack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage; //damage가 0보다 작거나 같은 경우 1로하고 그렇지 않으면 damage
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage; //체력보다 데미지가 큰 경우 체력만큼만 빼줘서 0을 만들고 그렇지 않으면 데미지 만큼 빼줌
		System.out.println(name + "가 공격으로" + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	//경험치 얻는 메서드
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	//레벨업 하는 메서드
	void levelUp(){
		level++;
		maxHp += 10;
		maxMp += 5;
		att += 2;
		def += 2;
		hp = maxHp; //현재 체력을 최대 체력까지 올려줌
		mp = maxMp;
		System.out.println("LEVEL UP!!");
	}
	//아이템 얻는 메서드
	void getItem(Item item){
		System.out.println(item.name + "을 획득하였습니다.");
		for (int i = 0; i < items.length; i++) {
			if(items[i] ==null){
				items[i] = item;
				break;
			}
		}
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
