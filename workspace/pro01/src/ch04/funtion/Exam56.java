package ch04.funtion;



/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 전희연
 * @설명 : 함수 - 배열
 */

import java.util.Scanner;

public class Exam56 {

	public static void main(String[] args) {	// 10 20 30 40 50
//		Scanner sc= null;
//		
//		for(int i=0; i<args.length;i++) {
//			sc=new Scanner(args[i]);
//			int value=sc.nextInt();
//			System.out.println(++value);
//		}
//		
//		sc.close();
		
		int hap=0;
		for(int i=0;i<args.length;i++) {
			int x=Integer.parseInt(args[i]);
			hap+=x;
		}
		
		System.out.println(hap);
		
	}

}
