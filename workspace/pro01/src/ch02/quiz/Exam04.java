package ch02.quiz;

public class Exam04 {

	public static void main(String[] args) {
		
		int num=0;
		
		while(true) {
			num++;
			if(num>=10) break;
			if(num%3==0) continue;
			System.out.print(num+"\t");
		}

	}

}
