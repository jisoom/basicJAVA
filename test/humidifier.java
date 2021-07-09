package test;

import e_oop.ScanUtil;


public class humidifier {

	boolean power; //전원
	int mois; //습기 조절
	int timer; //시간 조절
	
	final int MIN_MOISTURE = 0; //습기 조절 최소 : 0
	final int MAX_MOISTURE = 10; //습기 조절 최대 : 10
	final int MIN_TIMER = 0; //시간 최소 : 0시간
	final int MAX_TIMER = 9; //시간 최대 : 9시간
	
	humidifier(){
		power = false; 
		mois = 3;
		timer = 1;
	}
	
	//전원 메서드
	void power(){
		power = !power;
		System.out.println(power? "가습기 on" : "가습기 off");
	}
	
	//습기 조절 입력받아서 변경
	void changeMois(int mois){
		if(power){
			if(MIN_MOISTURE <=mois && mois <= MAX_MOISTURE){
				this.mois = mois;
			}
			showMois();
		}
		
	}
	
	//습기 조절 메서드(습기up)
	void moisUp(){
		changeMois(mois+1);
	}
	
	//습기 조절 메서드(습기down)
	void moisDown(){
		changeMois(mois-1);
	}
	//타이머 메서드(up)
	void timerUP(){
		if(power){
			if(timer < MAX_TIMER){
				timer++;
			}
			showTimer();
		}
	}
	//타이머 메서드(down)
	void timerDown(){
		if(power){
			if(timer > MIN_TIMER){
				timer--;
			}
			showTimer();
		}
	}
	
	void showTimer(){
		System.out.println("타이머");
		for (int i = MIN_TIMER+1; i <= MAX_TIMER; i++) {
			if(i<= timer){
				System.out.print("●");
			}else{
				
			}
		}
		System.out.println(timer + "시간");
	}
	
	void showMois(){
		System.out.println("습기");
		for (int i = MIN_MOISTURE+1; i <= MAX_MOISTURE; i++) {
			if(i<= mois){
				System.out.print("●");
			}
		}
		System.out.println("습도 :" +mois);
	}
	
	public static void main(String[] args) {
		humidifier hum = new humidifier();
		
		while(true){
			System.out.println("--------------------");
			System.out.println("1.전원  2.습도변경 3.습도 up 4.습도 down");
			System.out.println("5.타이머 up 6.타이머 down 0.종료");
			System.out.println("--------------------");
			

			
			System.out.print("번호 입력 >");
			int input = ScanUtil.nextInt();
			
			switch(input){
			case 1 :
				hum.power();
				break;
			case 2 :
				System.out.println("변경할 습도 입력 >");
				int mois = ScanUtil.nextInt();
				hum.changeMois(mois);
				break;
			case 3 :
				hum.moisUp();
				break;
			case 4 :
				hum.moisDown();
				break;
			case 5 :
				hum.timerUP();
				break;
			case 6 :
				hum.timerDown();
				break;
			default :
				hum.power();
				System.exit(0);
				//break;문 없어도 exit때문에 끝나서 안써도 상관 없음
			}
		}
	}

	
}