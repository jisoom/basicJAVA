
package test;

import e_oop.ScanUtil;

public class P_game {

   P_character c;
   P_item[] items;
   String[]names;
   int[]att;
   int[]def;
   P_joo j;
   P_game() {
      String name = ScanUtil.nextLine();
      c = new P_character(name, 10, 50, 20, 10);

      
      items = new P_item[10];
      items[0] = new P_item("나애교의 목숨", 0, 0, 2, 5);
      items[1] = new P_item("오윤희의 목소리", 4, 1, 0, 0);
      items[2] = new P_item("하은별의 목걸이", 0, 0, 2, 0);
      items[3] = new P_item("천서진의 청아그룹", 0, 0, 3, 0);
      items[4] = new P_item("하윤철의 손목", 1, 0, 0, 0);
      items[5] = new P_item("로건리의 재력", 2, 0, 3, 0);
      items[6] = new P_item("조비서의 맷집", 0, 2, 0, 3);
      items[7] = new P_item("심수련의 드레스", 3, 0, 0, 4);
      items[8] = new P_item("강마리의 삼마마", 5, 0, 0, 1);
      items[9] = new P_item("주석훈의 사랑", 2, 2, 0, 0);
      
      names = new String[10];
      names[0] = "주석경";
      names[1] = "하은별";
      names[2] = "마두기";
      names[3] = "양미옥";
      names[4] = "이규진";
      names[5] = "고상아";
      names[6] = "하윤철";
      names[7] = "오윤희";
      names[8] = "천서진";
      names[9] = "주단태";
      
      att = new int[10];
      att[0] = 14;
      att[1] = 18;
      att[2] = 22;
      att[3] = 26;
      att[4] = 30;
      att[5] = 34;
      att[6] = 38;
      att[7] = 40;
      att[8] = 42;
      att[9] = 44;
      
      def = new int[10];
      def[0] = 14;
      def[1] = 28;
      def[2] = 32;
      def[3] = 34;
      def[4] = 35;
      def[5] = 36;
      def[6] = 37;
      def[7] = 38;
      def[8] = 39;
      def[9] = 40;
   
      j = new P_joo(
              new String[]{names[0],names[1],names[2],names[3],names[4],names[5],names[6],names[7],names[8],names[9]},
              30,
              15,
              new int[]{att[0],att[1],att[2],att[3],att[4],att[5],att[6],att[7],att[8],att[9]},
              new int[]{def[0],def[1],def[2],def[3],def[4],def[5],def[6],def[7],def[8],def[9]}, 
              new P_item[]{items[0], items[1], items[2], items[3], items[4], 
              items[5], items[6], items[7], items[8], items[9]});
      
   }

   public static void main(String[] args) {
	   System.out.println("===============");
	   System.out.println("펜트하우스 차지하기");
	   System.out.println("===============");
      System.out.println("캐릭터 이름을 설정해 주세요");
      new P_game().start();

   }

   private void start() {
        System.out.println(c.name + "님 펜트하우스에 오신 것을 환영합니다.");
        stop(1000);
         int input = 0;
         while (true) {
            System.out.println();
            System.out.println("실행하고 싶은 번호를 입력하세요");
            System.out.println("1.펜트하우스 정보 확인하기" + " " + "2.입주하기" + " " + "0.나가기");
            input = ScanUtil.nextInt();
            
            switch (input) {
            case 1 :
               System.out.println("펜트하우스 1 층에는 주석경이 살고있습니다.");
               System.out.println("펜트하우스 2 층에는 하은별이 살고있습니다.");
               System.out.println("펜트하우스 3 층에는 마두기가 살고있습니다.");
               System.out.println("펜트하우스 4 층에는 양미옥이 살고있습니다.");
               System.out.println("펜트하우스 5 층에는 이규진이 살고있습니다.");
               System.out.println("펜트하우스 6 층에는 고상아가 살고있습니다.");
               System.out.println("펜트하우스 7 층에는 하윤철이 살고있습니다.");
               System.out.println("펜트하우스 8 층에는 오윤희가 살고있습니다.");
               System.out.println("펜트하우스 9 층에는 천서진이 살고있습니다.");
               System.out.println("펜트하우스 10 층에는 주단태가 살고있습니다.");
               break;
            case 2:
                 move_in();
                  break;
            case 0:
               System.out.println("펜트하우스 로비조차 밟아보지 못하고 끝났습니다.");
               System.exit(0);
            }
         }

      
   }


   void stop(int interval) {
      try {
         Thread.sleep(interval);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   void move_in() {
     int input = 0;
     while(true){
            System.out.println("1.내정보 확인하기"+ " " + "2.펜트하우스 빼앗기" + " " + "0.포기하기");
            input = ScanUtil.nextInt();
            moveIn : switch(input){
               case 1:
                  c.showInfo();
                  break;

               case 2 :
                  hunt();
                  break moveIn;
               case 0 :
                  System.out.println("펜트하우스 빼앗기를 포기하였습니다.");
                  break;
                  
            }
        
     }
   
}
   
   void hunt() {

            
      for (int i = 0; i < names.length; i++) {
         if(c.floor == i+1){
            System.out.println(c.floor+"층에서 " + j.names[i] + "(을)를 만났습니다." + c.floor + "층을 빼앗을까요?");
         }
      }

         int input = 0;
         battle: while (true) {
            System.out.println("1.공격하기 \t 2.스킬사용하기 \t 3.포기하기");
            input = ScanUtil.nextInt();
            switch (input) {
            case 1:
               c.attack(j);
               if (j.hp <= 0) {
                  System.out.println("==============================");
                  for (int i = 0; i < names.length; i++) {
                     if(c.floor == i+1){
                        System.out.println(j.names[i] + "(을)를 처치하였습니다!" +c.floor + "층을 빼앗았습니다.");
                     }

                  }
                  if(c.floor <= 9){
                     c.getItem(j.itemDrop());
                     c.getExp(100);
                  }else if(c.floor == 10){
                     c.getExp(100);
                  }

                  
                  System.out.println("==============================");
                  break battle;
               }
               j.attack(c);
               if (c.hp <= 0) {
                  System.out.println("==============================");
                  for (int i = 0; i < names.length; i++) {
                     if(c.floor == i+1){
                        System.out.println(j.names[i] + "에게 공격당하여 펜트하우스에서 쫓겨났습니다.");
                        System.exit(0);
                     }
                  }
               }
               break;
            case 2 :
               skill();
               break;
            case 3:
                for (int i = 0; i < names.length; i++) {
                   if(c.floor == i+1){
                      System.out.println(j.names[i] + "이(가) 살고 있는 펜트하우스"+c.floor+"층 빼앗기를 포기하였습니다.");
                   }
                }
                break battle;
            }

         }

      

   }

   void skill() {
   
    System.out.println("1.깨물기 \t 2.꼬집기 \t 3.엎어치기");
    int input = ScanUtil.nextInt();

    if(c.mp >= 20){
       switch(input){
      case 1:
         System.out.println(c.name +"님이 깨물기 스킬을 사용하여 공격하였습니다.");
            for (int i = 0; i < j.names.length; i++) {
                if(c.floor == i+1){
                 c.mp -= 20;
                 int sk_damage = c.att - (j.def[i]-2);
                 sk_damage = sk_damage < 0 ? 1 : sk_damage;

                    j.hp = j.hp < sk_damage ? j.hp-j.hp : j.hp-sk_damage;
                    System.out.println("깨물기 스킬로 "+j.names[i] + "(을)를 공격하여 " + sk_damage +"만큼 데미지를 주었습니다.");
                    System.out.println("남은 마나 :" + c.mp +" "+ j.names[i]+"의 남은 체력 :" + j.hp );
                }else if(j.hp == 0){
                   break;
                }
                
            }
            if(j.hp == 0){
            for (int i = 0; i < j.names.length; i++) {
                if(c.floor == i+1){
            System.out.println(j.names[i]+"를 처치하였습니다.");
                }
            }
            }
         break;
      case 2 :
         System.out.println(c.name +"님이 꼬집기 스킬을 사용하여 공격하였습니다.");
            for (int i = 0; i < j.names.length; i++) {
                if(c.floor == i+1){
                 c.mp -= 20;
                 int sk_damage = c.att - (j.def[i]-2);
                 sk_damage = sk_damage < 0 ? 1 : sk_damage;

                    j.hp = j.hp < sk_damage ? j.hp-j.hp : j.hp-sk_damage;
                    System.out.println("꼬집기 스킬로 "+j.names[i] + "(을)를 공격하여 " + sk_damage +"만큼 데미지를 주었습니다.");
                    System.out.println("남은 마나 :" + c.mp +" "+ j.names[i]+"의 남은 체력 :" + j.hp );
                }else if(j.hp == 0){
                   break;
                }
                
            }
            if(j.hp == 0){
            for (int i = 0; i < j.names.length; i++) {
                if(c.floor == i+1){
            System.out.println(j.names[i]+"를 처치하였습니다.");
                }
            }
            }
         break;
      case 3 :
         System.out.println(c.name +"님이 엎어치기 스킬을 사용하여 공격하였습니다.");
            for (int i = 0; i < j.names.length; i++) {
                if(c.floor == i+1){
                 c.mp -= 20;
                 int sk_damage = c.att - (j.def[i]-2);
                 sk_damage = sk_damage < 0 ? 1 : sk_damage;
                    j.hp = j.hp < sk_damage ? j.hp-j.hp : j.hp-sk_damage;
                    System.out.println("깨물기 스킬로 "+j.names[i] + "(을)를 공격하여 " + sk_damage +"만큼 데미지를 주었습니다.");
                    System.out.println("남은 마나 :" + c.mp +" "+ j.names[i]+"의 남은 체력 :" + j.hp );
                }else if(j.hp == 0){
                   break;
                }
                
            }
            if(j.hp == 0){
            for (int i = 0; i < j.names.length; i++) {
                if(c.floor == i+1){
            System.out.println(j.names[i]+"를 처치하였습니다.");
                }
            }
            }
         break;
   
   }
 
    }else if(c.mp < 20){
       System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다.");
    }


   
}
   
   
}