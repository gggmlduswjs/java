package ch04.funtion;



/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 전희연
 * @설명 : final 상수 / 지역, static
 */

public class Exam61 {
	public static final int VALUE=99;

	public static void main(String[] args) {
		final int SU=77;
//		SU=80; ERROR
		// VALUE=99;
		System.out.println(SU);
		System.out.println(VALUE);

	}
	
	public final void aa() {}
	public static final void bb() {}
	public void cc() {}

}
