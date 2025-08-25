package ch05.object;



/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 전희연
 * @설명 :  생성자로 데이터 전달
 */

import java.util.Scanner;

class BirthdayB {
	private int year;
	private int month;
	private int day;
	private String name;
	private Scanner sc;
	
	// 함수, 생성자
	public BirthdayB() {
		sc=new Scanner(System.in);
		
		System.out.println("이름 :");
		this.name=sc.next();
		
		System.out.println("년도 :");
		this.year=sc.nextInt();
		
		System.out.println("월 :");
		this.month=sc.nextInt();
		
		System.out.println("일 :");
		this.day=sc.nextInt();
		
	}
	
	public void disp() {
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(name);
		System.out.println();
	}
}

public class Exam72 {

	public static void main(String[] args) {
		BirthdayB b=new BirthdayB();
		b.disp();
	}

}




