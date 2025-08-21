package ch03.array;



/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 전희연
 * @설명 : 
 */


import java.util.Scanner;

public class Exam39 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("배열수 입력 : ");
		int su=sc.nextInt();	// 10 
		
		
		// 배열 입력
		int[] array=new int[su]; 
		
		for(int i=0;i<array.length;i++) {
			System.out.println((i+1)+"번째  입력 : ");
			array[i]=sc.nextInt();
		}
		
		//배열 연산 또는 출력
		int sum=1;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
