package test;

public class Character {

	//주인공
	String name; //이름
	int hp; //체력
	int mp; //스킬
	int maxHp; //최대 체력
	int maxMp; //최대 마나
	int level; //레벨
	int att; //공격력
	int def; //방어력
	int exp; //경험치
	Item[]items; //아이템
	
	//초기화
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
	
	//내 정보 보여주는 메서드
	void showInfo(){
		System.out.println("==============================");
		System.out.println("-------------상 태-------------");
		System.out.println("이름 : " + name + "(레벨 : " + level+ ")");
		System.out.println("경험치 : " + exp + "/100");
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + maxMp);
		System.out.println("공격력 : " + att );
		System.out.println("방어력 : " + def);
		System.out.println("------------아 이 템------------");
		for (int i = 0; i < items.length; i++) {
			if(items[i] != null){
//				System.out.println(items[i].아이템정보);
			}
		}
		System.out.println("==============================");
	}
	
	//기본 공격하는 메서드
	void attack(Monster m){
		int damage = att- m.def;
		damage = damage <=0 ? 1 : damage;
		m.hp = m.hp < damage? m.hp-m.hp : m.hp-damage;
		System.out.println(name + "의 공격으로" + m.name + "에게" +damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 체력 :" + m.hp);
	}
	
	//경험치 얻는 메서드
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(this.exp >= 100){
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
		hp = maxHp;
		mp = maxMp;
		System.out.println("레벨이 한단계 상승했습니다! LEVEL UP!!");
	}

	//몬스터 죽이고 아이템 얻는 메서드
		void getItem(Item item){
			System.out.println(item.name + "을 획득하였습니다.");
			for (int i = 0; i < items.length; i++) {
				if(items[i] == null){
					items[i] =item;
					break;
				}
			}
			maxHp += item.hp;
			maxMp += item.mp;
			att += item.att;
			def += item.def;
			
		}
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
