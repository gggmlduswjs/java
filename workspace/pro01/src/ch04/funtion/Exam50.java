package ch04.funtion;



/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 전희연
 * @설명 : 함수-call by value
 * 			  중복성을 없애고, 가독성 좋아야 한다(제 3자가 보더라도 프로그램이 간결하고 깔끔해야 함).
 */
public class Exam50 {

	public static void main(String[] args) {
		sub(2,5);
		System.out.println("hahaha");
		System.out.println();
		
		sub(3,3);
		System.out.println("hohoho");
		System.out.println();
		
		sub(2,10);
		System.out.println("end");
	}
	
	public static void sub(int x,int y) {	// 재사용 가능
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
