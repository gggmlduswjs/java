package ch05.object;



/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 전희연
 * @설명 : 생성자
 */

class TestA {
	// 함수 : 접근제한자 지정예약어(static, final, 생략) 반환형 함수명(매개변수 목록)
	// 생성자 : 접근제한자 생성자명은 클래스명과 동일(매개변수 목록)
	public TestA() {	// 기본 생성자
		System.out.println("hi");
	}
}

class TestB{
	public TestB() {
		System.out.println("안녕하세요.");
	}
	
}

class TestC {
	private int x;		// this.x=0;
	private int y;		// this.y=0;
	private int z;		// this.z=0;
	
	public TestC(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void disp() {
		System.out.println(x+"\t"+y+"\t"+z);
	}
}

public class Exam70 {	// 실행 클래스만 public >> 하나의 자바 파일에 여러 개의 클래스 사용할 때 

	public static void main(String[] args) {
		TestA a=new TestA();	// a 객체 생성 되었다. 내부적으로 생성자 생김
		
		TestB b=new TestB();	// b 객체 생성 되었다. 내부적으로 생성자 생김
		
		// 멤버 함수 전달
		// 점 연산 전달 private
		// 생성자 전달
		TestC c=new TestC(10, 20, 30); 
		
		
		
		c.disp();
	}

}




