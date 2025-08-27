package ch07.interfaceA;



/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 전희연
 * @설명 : 멤버변수, 지역변수, 매개변수/리턴
 */
import java.util.Scanner;

class AA {
	public int x;
	
	public void disp() {
		int y=20;
	}
	
	public void aa(int su) {}
	
	public int bb() {
	 	int value=20;
		return value;
	}
}

class BB{
	public AA a;	//멤버 객체 x, disp(), aa(), bb()
	public String str;
	public Scanner sc;
	
	public void output() {
		a=new AA();
		a.disp();
		a.aa(10);
		a.bb();
	}
	
	public void apple() {
		//지역 객체
		AA a=new AA();
		Scanner sc=new Scanner(System.in);
		// 클래스 던지기 맨날 클래스 던지기 이 안에 static으로 선언한 변수가 잇을 것
	}
	
	public void banana(AA a) {
		
	}
	
	public AA melon() {
		AA a=new AA();
		return a;
	}
	
	
	
}

public class Exam95 {

	public static void main(String[] args) {
		AA a=new AA();
		
		BB b=new BB();
		b.banana(a);
		AA aa=b.melon();

	}

}
