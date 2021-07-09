package test;

public class P_joo {
   
   String[]names; //이름
   int maxhp; //최대자산
   int maxMp; //최대마나
   int hp; //체력
   int mp; //스킬
   int[]att; //공격
   int[]def; //방어
   P_item[]items; //주단태가 가지고 있는 아이템
   
   //초기화
   P_joo(String[]names, int hp, int mp, int[] att, int[] def, P_item[]items){
      this.names = names;
      this.maxhp = hp;
      this.maxMp = mp;
      this.hp = this.maxhp;
      this.mp = this.maxMp;
      this.att = att;
      this.def = def;
      this.items = items;
      }
   
   
   //기본 공격 메서드
   void attack(P_character c){
      for (int i = 0; i < names.length; i++) {
         if(c.floor == i+1){
         int damage = att[i] - c.def;
         damage = damage < 0 ? 1 : damage;
         c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
               System.out.println(names[i] +" 악당이 "+c.name + "님에게 " + damage + "만큼의 피해를 입혔습니다.");
               System.out.println(c.name + "의 남은 HP :" + c.hp);
            }
      }

   }
   
   //죽으면서 아이템 떨어뜨리는 메서드
   P_item itemDrop(){
      return items[(int)(Math.random()* items.length)];
   }

}




class ABC extends P_joo{
	ABC(String[]names, int hp, int mp, int[] att, int[] def, P_item[]items){
		super(names, hp, mp, att, def, items);
	}
	
	P_character c = new P_character("name", 10, 10, 10, 10);
	void method(){
		attack(c);
	}
}





