package ch05.object;

class TestH {
	public int x;
	public static int y;
	
	public void aa() {}
	public static void bb() {}
	
	public void disp() {
		System.out.println(x);
		System.out.println(y);
		
		aa();
		bb();
	}
	
	public static void print() {
//		System.out.println(x); ERROR
		System.out.println(y);
		
//		aa(); ERROR
		bb();
	}
}

public class Exam79 {

	public static void main(String[] args) {
		TestH a=new TestH();
		a.x=10;
		TestH.y=20;
		
		a.disp();
		TestH.print();
		
		final int VALUE=20;
//		VALUE=55;

	}
	
	public void aa() {}

}
