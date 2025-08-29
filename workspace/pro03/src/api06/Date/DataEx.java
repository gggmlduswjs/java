package api06.Date;



/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 전희연
 * @설명 : 
 */

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataEx {

	public static void main(String[] args) throws ParseException {
		long time = System.currentTimeMillis();		// 현재 시스템 날짜 시간(초) 출력
		System.out.println(time);
		
		Date date=new Date();
		System.out.println(date);		// 현재 시스템 날짜를 가져온다
		
		System.out.println(date.getYear()+"년도");
		System.out.println(date.getMonth()+1+"월");
		System.out.println(date.getDate()+"일");
		System.out.println(date.getHours()+"시");
		System.out.println(date.getMinutes()+"분");
		System.out.println(date.getSeconds()+"초");
		System.out.println("\n");
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yy년 MM월 dd일 E요일 a");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4=new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf4.format(date));
		System.out.println();
		
		// 문자 >> 날짜
		String str="1990-12-25";	//View
		Date strDate= sdf1.parse(str);
		System.out.println(strDate);
		System.out.println(sdf1.format(strDate));
		
		// 날짜 >> 문자
		String b=strDate.toString();
		
	}

}









