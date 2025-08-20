package ch02.quiz;

public class Exam07 {

	public static void main(String[] args) {
		
		outer:for(int i=1;i<=10;i++) {
			for(int j=1;j<10;j++) {
				if(i*j>50) break outer;
				System.out.print(i*j+"\t");
			};
			System.out.println();
		}
	}

}
