package g_oop2;

public class Starcraft {

	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		SCV scv = new SCV();
		
//		scv.repair(m);  Marine은 repair를 상속받지 않았기 때문에 안됨
		scv.repair(t);
		scv.repair(d);

	}

}

class Unit {
	int hp; // 현재 체력
	final int MAX_HP; // 최대 체력

	Unit(int hp) {
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit {
	Marine() {
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	Tank() {
		super(150);
	}
}

class Dropship extends Unit implements Repairable {
	Dropship() {
		super(125);
	}
}

class SCV extends Unit {
	SCV() {
		super(60);
	}
	//기계만 수리해주는 메서드 (Tank, Dropship만 가능함)
	void repair(Repairable r){
		if(r instanceof Unit){ //Unit으로 형변환이 가능한지 확인
			Unit u =(Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
		
	}
}

interface Repairable{
	//관계를 만들어 줄 수 이씀
	
}