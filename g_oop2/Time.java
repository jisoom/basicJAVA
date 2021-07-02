package g_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second; //옳지 못한 데이터 입력을 막기 위해 private를 만들어줌
	
	//private로 해주고 나서 메뉴 Source에서 Generate Getters and Setters 해줌
	public int getHour() { //get : 변수의 값 얻기위한 메서드
		return hour;
	}

	public void setHour(int hour) { //set : 변수의 값 저장하기 위한 메서드
		if(hour < 0){
			this.hour = 0;
		}else if(hour > 23){
//			this.hour = 23;
			this.hour = hour %24;
		}else{
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0){
			this.minute = 0;
		}else if(minute > 59){
//			this.minute = 59;
			this.minute = minute % 60;
			setHour(this.hour + minute/ 60);
		}else{
			this.minute = minute;
		}

	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0){
			this.second = 0;
		}else if(second > 59){
			this.second = 59;
			this.second = second % 60;
			setMinute(this.minute + second/60);
		}else{
			this.second = second;
		}			
//		if(second == 60){
//			this.second = 0;
//			this.minute = minute+1;
//		}
//		if(minute == 60){
//			this.minute = 0;
//			this.hour =hour + 1;
//		}
//		if(hour ==24){
//			this.hour = 0;
//		}
	}

	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second +1);
		}
	}
	private void stop(int interval){ //stop 메서드는 클래스 내부에서 사용하기 위해 만듦 , 외부에서 사용할 필요가 없기 때문에 private 붙여줌
		try {
			Thread.sleep(interval); //Thread.sleep(interval)써주고 ctrl + 1눌러줌
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
