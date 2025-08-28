package api02.System;



/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 전희연
 * @설명 : System 클래스 - in, out
 */

import java.io.PrintStream;
import java.io.InputStream ;
import java.io.IOException ;
import java.util.Scanner;

public class ASystem {

	public static void main(String[] args) throws IOException{
		
		System.out.println("hahaha");
		
		PrintStream ps=System.out;
		ps.println("API 시작입니다.");
		ps.println(10);
		ps.println(24.5f);
		System.out.println();
		
		InputStream is=System.in;
		
		
		// 바이트 방식, 문자 방식
		System.out.println("문자입력1");	// A
		char value = (char)is.read();
		
		
		// \r + \n
		// 쓸일 없으니 읽고 버림
//		char a=(char) 
				is.read(); //\r
//		char b=(char) 
				is.read(); //\n
		
		System.out.println("문자 입력2:");
		char imsi=(char) is.read();
		is.read(); //\r
		is.read(); //\n
		
		System.out.println("문자 입력3:");
		char temp=(char) is.read();
		is.read(); //\r
		is.read(); //\n
		
		System.out.println(value);
		System.out.println(imsi);
		System.out.println(temp);
		
		System.out.println();
		
		Scanner sc=new Scanner(is);	// (InputStream is)
		
		System.out.println("문자열 입력 :");
		String str=sc.next();
		System.out.println(str);
		
		System.out.println("문자 입력:");
		String strCh=sc.next();
		char ch=strCh.charAt(0);	// 바이트 방식처럼 활용 >> 문자열 읽어온다. 결론
		System.out.println(ch);
		
		sc.close();
		
	}

}
