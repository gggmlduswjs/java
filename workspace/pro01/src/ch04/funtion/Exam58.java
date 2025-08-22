package ch04.funtion;



/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 전희연
 * @설명 : 함수 중복 - function Overload(Overloading)
 * 					함수 이름은 같지만, 매개변수 타입과 갯수가 다름
 */

public class Exam58 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=yonsan(a,b);
		
		float x=30.4f;
		float y=57.4f;
		float z=yonsan(x,y);

		System.out.println(c+"\t"+z);
	}
	
	
	public static int yonsan(int a, int b) {
		return a+b;
	}
	
	public static float yonsan(float x, float y) {
		return x+y;
	}

}
