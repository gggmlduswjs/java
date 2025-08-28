package api03.String;



/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 전희연
 * @설명 : String 클래스-equals(), equalsIgnoreCase(), toLower() , toUpperCase()
 */
public class String02 {

	public static void main(String[] args) {
		
		String a="apple";
		String b="apple";
		System.out.println("주소값 비교 :"+(a==b));
		System.out.println("데이터 값 비교 :"+a.equals(b));
		
		String x=new String("hi");
		String y=new String("hi");
		System.out.println("주소값 비교:"+(x==y));
		System.out.println("데이터 값 비교"+x.equals(y));
		
		String s="banana";
		String t="BANANA";
		System.out.println("데이터 값 비교(대소문자구분) :"+s.equals(t));
		System.out.println("데이터 값 비교(대소문자구분안함) :"+s.equalsIgnoreCase(t));

	}

}




