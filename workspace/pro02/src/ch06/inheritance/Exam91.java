package ch06.inheritance;



/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 전희연
 * @설명 : 함수 재정의 >> 추상클래스, 추상함수 >> interface
 */

abstract class IParents { //추상함수를 하나라도 가지고 있는 클래스를 추상 클래스
	protected int x, y;
	// 재정의 하던가 말던가
	public void msg() {
		System.out.println("어서 가을이 와라~~~");
	}
	// 재정의 필수
	public abstract void disp(); //추상함수
}

class ISon extends IParents{	// x, y, msg(), disp()

	@Override
	public void disp() {
		System.out.println("Son disp");
		
	}
	
	
}

class IDaughter extends IParents {	// x,y,msg(),disp()

	@Override
	public void disp() {
		System.out.println("Daughter disp");
		
	}
	
}


public class Exam91 {

	public static void main(String[] args) {
//		IParents a=new IParents(); ERROR 추상클래스 자신의 객체를 못 만듦
		
		// 근데 자식은 담아줄 수 있음 
		ISon s=new ISon();
		s.disp();
		
		IDaughter d=new IDaughter();
		d.disp();
		
		System.out.println();
		
		IParents x=new ISon();
		x.disp();
		
		IParents y=new IDaughter();
		y.disp();
	}

}
