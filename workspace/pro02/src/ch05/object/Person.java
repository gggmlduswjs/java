package ch05.object;

public class Person { // 구현 클래스
	public String name; // 멤버 변수
	public int age;
	public float ki;
	
	// a.name=홍, a.age=23, a.ki=182.2
	// b.name=김, b.age=33, b.ki=177.7
	
	public void disp() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(ki);
		System.out.println();
	}
}
