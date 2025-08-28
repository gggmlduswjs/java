package api01.Object;



/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 전희연
 * @설명 : String toString()
 */
public class CSmartPhoneMain {

	public static void main(String[] args) {
		
		CSmartPhone andriod=new CSmartPhone("구글","안드로이드");
		andriod.disp();
		System.out.println(andriod);
//		System.out.println(andriod.toString());
		
		Integer a=new Integer(10);
		System.out.println(a);	// 객체명 출력시 내부적으로 toString() 호출해준다.
//		System.out.println(a.toString());

	}

}
