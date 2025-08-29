package api03.String;



/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 전희연
 * @설명 : StringBuffer 클래스
 */

public class StringBuffer02 {

	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("** JAVA");
		System.out.println(str);
		
		str.insert(3, "Good");
		System.out.println("문자열 삽입 :"+str); // toString()은 생략 가능 ** GoodJAVA
		
		str.setCharAt(1, '#');
		System.out.println("문자 치환 :"+str);	// *# GoodJAVA
		
		str.replace(3, 7, "Love"); 		
		System.out.println("문자열 치환 :"+str); 	// *# LoveJAVA
		
		str.delete(7, 11);
		System.out.println("문자열 삭제 :"+str);	// *# Love
		
		str.deleteCharAt(1);
		System.out.println("문자 삭제 :"+str);		// * Love
		
		str.reverse();
		System.out.println("역순출력 :"+str);
		
		

	}

}
