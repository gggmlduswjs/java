package api02.System;



/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 전희연
 * @설명 : System 클래스 -currentTimeMillis() >> Data, SimpleDateFormat
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class BTime {

	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		System.out.println("현재 시간을 초단위:"+time);
		
		System.out.println("현재 시간을 나노 초단위:"+System.nanoTime());
		System.out.println();
		
		Date date=new Date(time);
		System.out.println(date);	// 2025-08-28 12;21;02
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ds=sdf.format(date);
		System.out.println(ds);

	}

}
