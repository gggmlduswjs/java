package ch05.object;



/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 전희연
 * @설명 : 생성자 중복
 */


class TestD{
	private int x;
	private int y;
	
	public TestD() {
		x=10;
		y=20;
	}
	
	public TestD(int x) {
		this.x=x;
		y=55;; // this 생략 가가능
	};
	
	public TestD(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println(x+"\t"+y);
	}
}

public class Exam73 {

	public static void main(String[] args) {
		
		TestD a=new TestD();
		a.disp();
		TestD b=new TestD(44);
		b.disp();
		TestD c=new TestD(1,2);
		c.disp();

	}

}
