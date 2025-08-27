package ch06.inheritance;



/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 전희연
 * @설명 : 상속-함수재정의(Overriding)
 */

class Airplane {
	public void fly() {
		System.out.println("일반비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public void land() {
		System.out.println("착륙합니다.");
	}
}

class SupersonicAirplan extends Airplane{	// fly(), takeOff(), land()
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	private int flayMode=NORMAL;
	
	public void setFlayModel(int flayMode) {
		this.flayMode=flayMode;
	}
	
	public void fly() {
		if(flayMode==SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();	//this.fly()
		}
	}
	
	
}

public class Exam88 {

	public static void main(String[] args) {
		SupersonicAirplan sa=new SupersonicAirplan();
		sa.takeOff();
		sa.fly();
		
		sa.setFlayModel(SupersonicAirplan.SUPERSONIC);
		sa.fly();
		
		sa.setFlayModel(SupersonicAirplan.NORMAL);
		sa.fly();

	}

}
