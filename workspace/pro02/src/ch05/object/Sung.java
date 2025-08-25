package ch05.object;

public class Sung {	//재사용 + 확장(함수)
	// 속성 - 변수
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	public float avg;
	
	//동작 - 함수
	public void total() {
		tot=kor+eng+mat;
	}
	
	public void average() {
		avg=(float)tot/3;
	}
	
	public void disp() {
		System.out.println("이름 :"+name);
		System.out.println("국어 :"+kor);
		System.out.println("영어 :"+eng);
		System.out.println("수학 :"+mat);
		System.out.println("총점 :"+tot);
		System.out.println("평균 :"+avg);
	}
	
	// 학점, 등수 ...

}


//a.name=펭수
//a.kor=70
//a.eng=80
//a.mat=77
