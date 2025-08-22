package ch04.funtion;

import java.util.Scanner;



/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 전희연
 * @설명 : 함수-call by value
 */
public class Exam51 {

	public static void main(String[] args) {	// 시작함수
		input();
	}
	
	public static void input() {				// 데이터를 입력받는 함수
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name=sc.next();	// 펭수

		System.out.println("주민번호 : ");
		String jumin=sc.next();		// 123456-1234567

		System.out.println("주소 : ");
		String addr=sc.next();		// 경기도 고양시 일산 EBS
		
		output(name, jumin, addr);
		
		sc.close();
	}
	
	// n=name=펭수, j=jumin=123456-1234567 a=addr=경기도 고양시 일산 EBS
	public static void output(String n, String j, String a) {				// 출력함수
		
		System.out.println("이름 :"+n);
		System.out.println("주민번호 : "+j);
		System.out.println("주소 :"+a);
		
	}

}
