package api03.String;



/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 전희연
 * @설명 : String 클래스
 */

public class String04 {

	public static void main(String[] args) {
		
		
		String str="홍길동, 이수홍, 박연수, 김자바, 최명호";
		String[] strArr=str.split(",");
		
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		System.out.println();
		
		//View JavaScript >> Java >> DB
		String[] a=new String[] {"홍길동", "이수홍", "박연수", "김자바", "최명호"};
		String ab="";
		for(int i=0;i<a.length;i++) {
			ab += a[i] +",";
		}
		System.out.print(ab);
		System.out.println();
		
		String text="홍길동&이수홍,박연수,김자바-최명호";
		String[] textArr= text.split("&|,|-");
		for(int i=0;i<textArr.length;i++) {
			System.out.println(textArr[i]);
		}
		
 
	}

}
