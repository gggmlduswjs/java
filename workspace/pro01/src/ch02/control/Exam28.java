package ch02.control;

/**
 * @날짜 :2025. 8. 20.
 * @작성자 : 전희연
 * @설명 : 제어문 - 반복문(do ~ while)
 */

public class Exam28 {
	public static void main(String[] args) {
		
		int x=1; // 초기값
		
		do {
			System.out.print(x+"\t");
			++x;		//증감값
		}while(x<=10);	//조건값
		
		System.out.println();	
		
		int sum=0;	// 누적합
		int y=1;	// 초기값
		do {
			sum+=y;
			++y;	// 증감값
		}while(y<=100);	//조건값
		
		System.out.println(sum);
	}
}
