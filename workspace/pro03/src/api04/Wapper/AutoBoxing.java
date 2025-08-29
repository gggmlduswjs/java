package api04.Wapper;



/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 전희연
 * @설명 : Wrapper 클래스는
 * 		  - 기본 자료형(byte, char, short, int, long, float, double, boolean) 값을 포장하는 객체 통칭
 * 		  - 자동 Boxing, UnBoxing
 */
public class AutoBoxing {

	public static void main(String[] args) {
		
		// 자동 Boxing	정수자료형 >> Integer 클래스
		Integer obj=100;
		System.out.println(obj.toString());
		
		// 자동 UnBoxing Integer 클래스 >> 자료형
		int value=obj;
		System.out.println(value);
		
		// 연산 Boxing/UnBoxing
		int result=obj+100;
		System.out.println(result);

	}

}
