package ch04.funtion;



/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 전희연
 * @설명 : static 변수
 */


public class Exam60 {
	public static int count=0;

	public static void main(String[] args) {
		
		sub(10);
		sub(20);
		sub(30);

	}
	
	public static void sub(int x) {		// x=30
//		int count=0;
		System.out.println(++count);	// 1
		System.out.println(x);			// 30
		System.out.println();
	}

}
