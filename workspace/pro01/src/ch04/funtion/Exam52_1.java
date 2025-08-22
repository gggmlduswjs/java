package ch04.funtion;



/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 전희연
 * @설명 : 함수 - call by value
 */

import java.util.Scanner;

public class Exam52_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("name:");
		String name=sc.next();
		
		System.out.println("kor :");
		int kor=sc.nextInt();
		
		System.out.println("eng :");
		int eng=sc.nextInt();
		
		System.out.println("mat :");
		int mat=sc.nextInt();
		
		System.out.println("이름:"+name);
		
		total(kor, eng, mat);
		average(kor, eng, mat);
		
		sc.close();
		
	}
	
	// 총점 함수
	public static void total(int kor, int eng, int mat) {
		int tot=kor+eng+mat;
		System.out.println("총점 :"+tot);
	}
	
	// 평균 함수
	public static void average (int kor, int eng, int mat) {
		float avg=(float)kor+eng+mat / 3;
		System.out.println("총점 :"+avg);
	}
	

}
