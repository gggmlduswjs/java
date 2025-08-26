package ch05.object;



/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 전희연
 * @설명 : 
 */

class TestF{
	private int x;		// 정수
	private float y;		// 실수
	private String z;		// 문자열(클래스) 객체
	private int[] a;
	
	public TestF() {}
	
	public TestF(int x, int y, String z, int[] a) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.a=a;
	}
	
}

public class Exam77 {

	public static void main(String[] args) {
		
		int[] su=new int[] {1, 2, 3, 4, 5};
		TestF f=new TestF(10, 20, "apple", su);

	}

}
