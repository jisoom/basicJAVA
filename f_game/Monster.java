package f_game;

public class Monster {
	
	//이름
		String name;
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
		//보유한 아이템
		Item[] items;
		

		//초기화 생성자
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
			damage = damage <= 0 ? 1 : damage; //damage가 0보다 작거나 같은 경우 1로하고 그렇지 않으면 damage
			c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage; //체력보다 데미지가 큰 경우 체력만큼만 빼줘서 0을 만들고 그렇지 않으면 데미지 만큼 빼줌
			System.out.println(name + "가 공격으로" + c.name + "에게" + damage + "만큼 데미지를 주었습니다.");
			System.out.println(c.name + "의 남은 HP : " + c.hp);
		}
		
		//죽으면서 아이템 떨어뜨리는 메서드
		Item itemDrop(){
			return items[(int)(Math.random()* items.length)];
		}

}
