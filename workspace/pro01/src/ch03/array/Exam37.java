package ch03.array;



/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 전희연
 * @설명 : 배열 
 * 				1차원, 2차원, 다차원
 * 				변수는 한개의 데이터만 저장하지만, 배열은 같은 타입의 데이터를 연속된 공간에 저장
 * 				각 데이터에 인덱스를 부여해 놓은 자료 구조
 * 규칙 : 변수명, 배열명, 함수명 >> 소문자로 시작한다. int a=10; int[] array=new int[] {...}
 * 							  단어가 두 단어 이상인 경우는 반드시 절 바꿀 때 대문자로 시작 int appleValue=10
 * 		 클래스명 >> 대문자로 시작한다. Exam37, Scanner, System
 * 				   두단어 이상인 경우는 반드시 절이 바뀔 때 대문자로 시작 AppleValue
 */
public class Exam37 {

	public static void main(String[] args) {
		
		char [] ch=new char[] {'A', 'B', 'C'};	//ch[0] A, ch[1] B, ch[2] C
		
		System.out.println("첫번째 배열 : "+ch[0]);
		System.out.println("두번째 배열 : "+ch[1]);
		System.out.println("세번째 배열 : "+ch[2]);
		
		for(int i=0;i<3;i++) {
			System.out.println(ch[i]);	// 0, 1, 2
		}
		
		System.out.println("배열개수 : "+ch.length);
		
		int [] array=new int[] {10,20,30,40,50};

		for(int i=0;i<array.length;i++) {	// i<5
			System.out.println(array[i]);
			
		}
		
		String[] str=new String[] {"apple", "hi","자바","펭수"};
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
