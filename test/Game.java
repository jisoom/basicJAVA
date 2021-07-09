package test;

import e_oop.ScanUtil;

public class Game {

	Character c;
	Item[]items;
	
	Game(){
		String name = ScanUtil.nextLine();
		c = new Character(name, 100, 50, 20, 10);
		items = new Item[10];
		items[0] = new Item("단태의 칼날", 0, 0, 10, 0);
		items[1] = new Item("애교의 방어", 0, 0, 0, 10);
		items[2] = new Item("윤희의 목소리", 0, 10, 0, 0);
		items[3] = new Item("은별의 목걸이", 10, 0, 0, 0);
		items[4] = new Item("서진의 청아그룹", 0, 10, 20, 10);
	}
	
	public static void main(String[] args) {
		System.out.println("캐릭터 이름을 설정해주세요");
		new Game().start(); //ctrl + 1 ==> start클래스 만들어줌
		

	}

	private void start() {
		System.out.println("당신은 펜트하우스에 입주하게 되었습니다.");
		stop(1000);
		int input = 0;
		while (true) {
			System.out.println("실행하고 싶은 번호를 입력하세요");
			System.out.println("1.내정보  확인하기" + " " + "2.싸우기" + " " + "0.종료");
			input = ScanUtil.nextInt();
			
			switch(input){
			case 1 : //정보보여주는 메서드
				c.showInfo();
				break;
			case 2 :  //사냥 메서드
				hunt();
				break;
			case 0 :
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
		
	}

	void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void hunt() {
		Monster m = new Monster("주단태", 20, 10, 15, 10, new Item[]{items[0],items[1]});
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true){
			System.out.println("1.공격 \t 2.도망");
			input = ScanUtil.nextInt();
			switch(input){
			case 1 :
				c.attack(m);
				if(m.hp <= 0){
					System.out.println(m.name + "를 처치하였습니다.");
					c.getExp(80);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				if(c.hp <= 0){
					System.out.println(m.name + "에게 공격당하였습니다.");
					c.getExp(-120);
					break battle;
				}
				break;
			case 2 :
				System.out.println(m.name + "으로부터 도망쳤습니다.");
				break battle;
			}
		}
	}

	
	
}
