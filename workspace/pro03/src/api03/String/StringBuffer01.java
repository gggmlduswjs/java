package api03.String;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 전희연
 * @설명 : 문자열 클래스
 * 		  - String
 * 		  - StringBuffer 
 * 		  - StringBuilder
 */

public class StringBuffer01 {

	public static void main(String[] args) {
		
		String s1="새천년";	// s1=0x100
		String s2="대한민국";
		String s3=s1;
		System.out.println("s1 hash code:"+s1.hashCode());
		System.out.println("s2 hash code:"+s2.hashCode());
		System.out.println("s3 hash code:"+s3.hashCode());
		
		s1 += s2;
		System.out.println(s1);
		System.out.println("s1 hash code:"+s1.hashCode());
		
		s1 += "좋은 나라";
		System.out.println(s1);
		System.out.println("s1 hash code:"+s1.hashCode());
		System.out.println();
		
		StringBuffer sb1=new StringBuffer("우리나라");
		StringBuffer sb2=new StringBuffer("대한민국");
		System.out.println("sb1 hash code:"+sb1.hashCode());
		System.out.println("sb2 hash code:"+sb2.hashCode());
		
		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println("sb1 hash code:"+sb1.hashCode());
		System.out.println();
		
		StringBuffer str=new StringBuffer("apple");
		System.out.println(str);
		System.out.println("문자열 길이:"+str.length());
		System.out.println("문자열 용량(byte):"+str.capacity());	// 문자열 길이 5 + 기본 버퍼 16 =21
		System.out.println();
		
		str.append("우리나라우리나라우리나라우리나라우리나라");		// 새로 넣은 글자 수 24
		System.out.println(str);
		System.out.println("문자열 길이:"+str.length());		// 5+24=29
		System.out.println("문자열 용량(byte):"+str.capacity());	// (기존 capacity*2) +2

	}

}
