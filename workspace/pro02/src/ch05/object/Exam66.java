package ch05.object;



/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 전희연
 * @설명 : 클래스 변수 접근 방법 >> 데이터 전달
 * 		  .(점) 연산자 obj.name="홈길동"
 * 		  멤버 함수
 * 		  생성자
 */
public class Exam66 {

	public static void main(String[] args) {
		
		Pay a = new Pay();
		a.input("왕눈이", 20000000);
		a.yonsan();
		a.output();
		
		Pay b=new Pay();
		b.input("아로미", 10000000);
		b.yonsan();
		b.output();
		
		Pay c=new Pay();
		c.input("투투", 15000000);
		c.yonsan();
		c.output();
	}

}
