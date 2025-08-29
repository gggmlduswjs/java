package api05.Math;



/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 전희연
 * @설명 : Math 클래스 - 반올림, 내림, 올림
 */

public class ARoundEx {

	public static void main(String[] args) {
		
		double x=123.5672;
		double y=456.4572;
		
		long a = Math.round(x);
		System.out.println("반올림 : "+a); //124
		
		int b=(int)Math.ceil(y);
		System.out.println("무조건 올림 : "+b); //457
		
		int c=(int)Math.floor(a);
		System.out.println("무조건 내림 : "+c);	//123
		
		// 소수 둘째 자리에서 반올림 첫째 출력	123.6
		
		double o=Math.round(x*10)/10.0;
		System.out.println("둘째자리 반올림, 첫째 자리 출력 :"+o);
		
		double i=Math.round(x*100)/100.0;
		System.out.println("셋째자리 반올림, 둘째 자리 출력 :"+i);
		
		double j=Math.ceil(x*1000)/1000.0;
		System.out.println("넷째자리 반올림, 셋째 자리 출력 :"+j);
		
	}

}
