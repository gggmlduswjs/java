package ch05.object;



/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 전희연
 * @설명 : 클래스 성적표 구하기
 */

import java.util.Scanner;


public class Exam64 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// 객체 생성
		Sung a=new Sung();
		
		// 변수 - 데이터 전달
		System.out.println("이름:"); 
		a.name=sc.next(); //펭수
		
		System.out.println("국어:");
		a.kor=sc.nextInt(); //70
		
		System.out.println("영어:");
		a.eng=sc.nextInt(); // 80
		
		System.out.println("수학:");
		a.mat=sc.nextInt(); //77
		
		// 함수 호출
		a.total();
		a.average();
		a.disp();
		
		sc.close();
		
	

	}
}