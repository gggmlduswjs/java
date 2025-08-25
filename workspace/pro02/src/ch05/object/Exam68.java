package ch05.object;



/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 전희연
 * @설명 : 클래스 3대 특징
 * 		  은닉화(캡슐화), 중복성, 상속성(재정의)
 * 		  
 */
public class Exam68 {

	public static void main(String[] args) {
		
		Saram saram=new Saram();
		
		// ., 함수접근 -> 이렇게 안쓴다고 
		saram.name="홍길동";
		saram.address="서울시 강남구 역삼1동";
		saram.phoneNumber="010-123-1234";
//		saram.juminBunho="12345-1234567";
		saram.setJuminBunho("12345-1234567");
		
		saram.age=27;
		
		
		

	}

}
