package ch05.object;



/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 전희연
 * @설명 : 생성자 호출
 * 
 */

class TestY {
	private int x, y, z;
	private int a;
	
	public TestY() {
		x=100;
		y=200;
		z=300;
		a=400;
	}
	
	public TestY(int x) {	// 1
//		this.x=x;
//		y=200;
//		z=300;
//		a=400;
		
		this(); // x, y, z, a
		this.x=x;	// 1
	}
	
	public TestY(int x, int y) {	// 1, 2
//		this.x=x;
//		this.y=y;
//		z=300;
//		a=400;
		
//		this();
//		this.x=x;
//		this.y=y;
		
		this(x);	// 1
		this.y=y;
	}
}
public class Exam75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
