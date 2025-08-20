package ch02.quiz;

public class Exam06 {

	public static void main(String[] args) {
		
		int balance=10;
		
		while(true) {
			if(balance < 5) break;
			balance = balance-9;
		}
		
		System.out.println("balance : "+balance);

	}

}
