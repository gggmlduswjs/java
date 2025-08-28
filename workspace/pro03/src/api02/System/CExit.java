package api02.System;



/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 전희연
 * @설명 : System 클래스 - exit
 */

import java.util.Scanner;

public class CExit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("수입력 :");
			int su=sc.nextInt();
			
			if(su==5) {
				System.out.println("프로그램을 종료");
				sc.close();
				System.exit(0); // break, return
			}
		}
		
	}
}
