package ch05.object;



/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 전희연
 * @설명 : static 변수, static 함수
 */

class TestG {		// TestG a=new TestG(...)
	
	private String name;
	private int don;
	private static float iyul;
	
	public static void setIyul(float iyul) {
		TestG.iyul=iyul;
		System.out.println(TestG.iyul);
		
//		System.out.println(name);
//		
//		aa();
	}
	
//	public String name;
//	public int don;
//	public static float iyul;
	
	public TestG() {}
	
	public TestG(String name, int don, float iyul) {
		this.name=name;
		this.don=don;
		TestG.iyul=iyul;
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(don);
		System.out.println(iyul);
		
		aa();
	}
	
	public void aa() {}
	
}


public class Exam78 {

	public static void main(String[] args) {
		TestG.setIyul(0.07f);
		
		TestG a=new TestG("kim", 10000, 0.07f);
		a.disp();
		
//		a.name="홍길동";
//		a.don=20000;
//		TestG.iyul=22.5f;
		
		double x=Math.PI;
		System.out.println(x);
		
		double y=Math.abs(-22.5);
		System.out.println(y);
		
		String str=new String("apple");
		byte[] b=str.getBytes();
	}

}








