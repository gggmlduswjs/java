package ch05.object;



/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 전희연
 * @설명 : 생성자 중복
 */

class AA {
	private int x;
	private int y;
	
	public AA() {
		x=0;
		y=0;
	}
	
//	public AA(int x, int y) {
//		this.x=x;
//		this.y=y;
//	}
	
	public void disp() {
		System.out.println(x+"\t"+y);
	}
}
public class Exam74 {

	public static void main(String[] args) {
		
		AA a = new AA();
		a.disp();
		
		AA b=new AA();
		b.disp();
		
		Test t=new Test();
		Test e=new Test(1, "홍길동", "123", 27, 159f);
		

	}

}
