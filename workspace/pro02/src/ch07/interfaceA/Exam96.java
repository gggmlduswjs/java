package ch07.interfaceA;



/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 전희연
 * @설명 :  추상클래스(추상함수)
 * 		   함수재정의 >> 추상클래스 >> 인터페이스
 */

abstract class Animal {

	
	public abstract void sound();
}

class Dog extends Animal {

	public void aa() {}
	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
	
}

class Cat extends Animal{
	public void bb() {}
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	
}

public class Exam96 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat=new Cat();
		
		kind(dog);
		kind(cat);
	}
	
	public static void kind(Animal animal) {	// UpCasting
		
//		animal.sound();
		
		if(animal instanceof Dog) {
			Dog dog=(Dog) animal;	//DownCasting
			dog.aa();
			dog.sound();
		}else if(animal instanceof Cat) {
			Cat cat=(Cat) animal;
			cat.bb();
			cat.sound();
		}
		
	}
	

}
