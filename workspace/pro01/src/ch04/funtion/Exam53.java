package ch04.funtion;



/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 전희연
 * @설명 : 함수-call by value ~return
 */
public class Exam53 {

	public static void main(String[] args) {
		int x=sub1();
		System.out.println(x);
		
		float y=sub2();
		System.out.println(y);
		
		String z=sub3();
		System.out.println(z);
		
		int hap=sub4(5,6);
		System.out.println(hap);

	}
	
	public static int sub1() {
		int x=10;
		++x;
		return x;
		
	}
	
	public static float sub2() {
		return 24.4f;
	}
	
	public static String sub3() {
		return "apple";
	}
	
	public static int sub4(int a, int b) {
		return a+b;
	}

}
