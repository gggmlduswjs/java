package ch05.object;



/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 전희연
 * @설명 :  생성자로 데이터 전달
 */


class BirthdayA {
	private int year;
	private int month;
	private int day;
	private String name;
	
	// 함수, 생성자
	public BirthdayA(int year, int month, int day, String name) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.name=name;
		
	}
	
	public void disp() {
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(name);
		System.out.println();
	}
}

public class Exam71 {

	public static void main(String[] args) {
		BirthdayA b=new BirthdayA(1990, 12, 25, "kim");
		b.disp();
		
		BirthdayA c=new BirthdayA(1995, 8, 25, "Lee");
		c.disp();
		
		BirthdayA d=new BirthdayA(2001, 7, 7, "차은우");
		d.disp();
	}

}




