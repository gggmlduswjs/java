package ch06.inheritance;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 전희연
 * @설명 : 상속
 * 		  
 * 		  - 함수 재정의 : 상속받아서 함수를 다시 재정의 >> 자식입장
 * 					   자식을 제어(컨드롤)할 수 있다 >> 부모입장
 * 		  - UpCasting/ DownCasting
 * 						
 */

class Person {
	protected String massage;	//부모입니다.
	
	public void setData(String massage) {
		this.massage=massage;
	}
	
	public String getData() {
		return massage;
	}
}

class Student extends Person { //massage, getData(), setData() 함수재정의
	public void setData(String message) {
		super.massage=message;
		
		System.out.println("Student setData Method ....");
		System.out.println(massage);
	}
}

public class Exam90 {

	public static void main(String[] args) {
		// 부모 클래스
		Person p=new Person();
		p.setData("부모입니다.");
		System.out.println(p.getData());
		
		// 자식 클래스 
		Student s=new Student();
		s.setData("자식입니다.");
		s.getData();
		
		
		//UpCasting : 자식클래스가 부모클래스 타입으로 변환 >> 자동변환
		Person stu=new Student();	// massage, getData(),자식 setData()
		stu.setData("UpCasting");
		
		// 부모클래스가 자식클래스 타입으로 변환 >> 명시적 변환
//		Student a=(Student) new Person(); ERROR 
//		Student b=(Student) new Person(); ERROR // byte c= (byte) a
		
		
		//DownCasting : 업캐스팅된 것을 다시 원래로 되돌리는 것 
		Student t=(Student)stu;
		t.setData("DownCasting");
		
		int x=10;
		int su=x;
		long y=x;	// 자동(묵시적) 형변환
		byte z=(byte)x;	// 명시적 형변환

	}

}
