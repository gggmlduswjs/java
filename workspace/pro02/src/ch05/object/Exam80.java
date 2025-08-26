package ch05.object;




 /**
 * @날짜 :2025. 8. 26.
 * @작성자 : 전희연
 * @설명 : final 변수, 함수
 */

class TestK {
	public final double PI=3.141592;
	public static final int VALUE=20;
	
	public double getPi() {
		return PI;
	}
	
	public void setPI(double PI) {
		// this.PI=PI; ERROR
		
	}
	
	public static void aa() {
//		System.out.println(PI); ERROR
		System.out.println(VALUE);
		
		dd();
	}
	
	public void bb() {
		System.out.println(PI);
		System.out.println(VALUE);
	}
	
	public final void cc() {}
	public static final void dd() {}
}

public class Exam80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
