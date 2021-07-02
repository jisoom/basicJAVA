package g_oop2;

public class Store {

	public static void main(String[] args) {
		//물건을 판매하는 가게
		//물건
		//공통적으로 가지고 있는 멤버 (이름, 가격)==> 부모클래스로 만들고 상속받아서 사용
		//손님 클래스 (손님이 물건 구매하게끔 만듦)
		
		Desktop d1 = new Desktop("삼성 컴퓨터", 100000);
		Desktop d2 = new Desktop("LG 컴퓨터", 100000);
		
		AirCon ac1 = new AirCon("삼성 에어컨", 200000);
		AirCon ac2 = new AirCon("LG 에어컨", 200000);
		
		TV tv1 = new TV("삼성 TV", 300000);
		TV tv2 = new TV("LG TV", 300000);
		
		Customer c = new Customer();
		
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d2); //파라미터를 Product에 있는 거로 받을 수 있음 ==> 다형성
		
		c.buy(ac2);
		
		c.buy((Product)tv1); //형변환 생략된 거임

	}
	
}


class Product{//부모 클래스
	String name; //이름
	int price; //가격
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	String getInfo(){
		return name + "(" + price + "원)";
	}
}



class Desktop extends Product{//데스크탑 자식 클래스
	Desktop(String name, int price){
		super(name, price); //부모클래스 생성자 호출 ==> 변수까지 초기화
	}
	
	void programming(){
		System.out.println("프로그램을 만듭니다.");
	}
}



class AirCon extends Product{ //에어컨 자식클래스
	AirCon(String name, int price){
		super(name, price);
	}
	void setTemperature(){
		System.out.println("온도를 설정합니다.");
	}
}



class TV extends Product{ //티비 자식클래스
	TV(String name, int price){
		super(name, price);
	}
	void setChannel(){
		System.out.println("채널을 변경합니다.");
	}
}



class Customer{
	int money = 100000000;
	
	Product[] item = new Product[100];
	
	void buy(Product p){
		//((TV)p).setChannel(); // 무조건 TV가 넘어오는 상황이면 p를 TV타입으로 형변환해 줄 수 있다
		if(money < p.price){
			System.out.println("잔돈이 부족하다.");
			return;
		}
		
		money -= p.price;
		for (int i = 0; i < item.length; i++) {
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo() + "를 구매했다.");
	}
	
	
	
}