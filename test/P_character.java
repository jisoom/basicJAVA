package test;

public class P_character {

   String name; //이름
   int maxHp; //최대 체력
   int maxMp; //최대 마나
   int hp; //체력
   int mp; //스킬
   int att; //공격력
   int def; //방어력
   int floor; //층수
   int exp; //경험치
   P_item[]items; //주단태로 부터 받을 아이템
   
   //초기화
   P_character(String name, int hp, int mp, int att, int def){
      this.name = name;
      this.maxHp = hp;
      this.maxMp = mp;
      this.hp = this.maxHp;
      this.mp = this.maxMp;
      this.att = att;
      this.def = def;
      this.floor = 1;
      this.exp = 0;
      this.items = new P_item[10];
   }
   
   //정보 확인하기
   void showInfo(){
      System.out.println("==============================");
      System.out.println("-------------상 태-------------");
      System.out.println("이름 : " + name + " (층수 : " + floor+ "층)");
      System.out.println("체력 : " + hp + "/" + maxHp);
      System.out.println("마나 : " + mp + "/" + maxMp);
      System.out.println("공격력 : " + att );
      System.out.println("방어력 : " + def);
      System.out.println("------------아 이 템------------");
      for (int i = 0; i < items.length; i++) {
         if(items[i] != null){
            System.out.println(items[i].itemInfo());
         }
      }
      System.out.println("==============================");
   }
   
   //기본 공격 메서드
   void attack(P_joo j){
      for (int i = 0; i < j.names.length; i++) {
         if(floor == i+1){
            int damage = att - j.def[i];
            damage = damage <= 0 ? 1 : damage;
            j.hp = j.hp < damage ? j.hp-j.hp : j.hp-damage;
            System.out.println(name+"님이 "+j.names[i] + "(을)를 공격하여 " + damage + "만큼 데미지를 주었습니다.");
            System.out.println(j.names[i] + "의 남은 HP :" + j.hp);
         }
      }

   }
   
   //경험치 쌓는 메서드
   void getExp(int exp){
      if(floor <=9){
         System.out.println(exp + "만큼의 경험치를 획득하였습니다.");
      }
      this.exp += exp;
      while(this.exp >= 100){
         floorUp();
         this.exp -= 100;
      }
   }
   P_joo j;
   //층수 올라가는 메서드
   void floorUp(){
      if(floor <= 9){
         floor++;
         maxHp += 5;
         maxMp += 5;
         att += 2;
         def += 3;
         hp = maxHp;
         mp = maxMp;
         System.out.println("펜트하우스" +floor+"층으로 상승하였습니다!");
      }else if(floor == 10){
         System.out.println("이제 펜트하우스는 모두 당신의 것입니다.");
         System.exit(floor);

      }

   }
   
   //죽이고 아이템 얻는 메서드
   void getItem(P_item item){
      System.out.println(item.name + " 아이템을 획득하였습니다.");
      for (int i = 0; i < items.length; i++) {
         if(items[i] == null){
            items[i] = item;
            break;
         }
      }
         maxHp += item.hp;
         maxMp += item.mp;
         hp += item.hp;
         mp += item.mp;
         att += item.att;
         def += item.def;
         
   }
   

   
   
}