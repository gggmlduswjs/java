package ch05.object;

public class MyData { 	// this=myData / this=m

	private int x;	//  this.x == myData.x m.x
	private int y;	// this.y == myData.x m.y
	
	// this.setData(int x, int y) == myData.setData()
	public void setData(int x, int y) {	// x=10, y=5
		this.x=x;
		this.y=y;
		// 다 내거임 나 중심 내 블락 안이 우선이고 그 다음 블락 밖
		System.out.println(x+"\t"+y);
		System.out.println(this.x+"\t"+this.y);
	}
	
	public void disp() {
		
		// this x, y -> this는 생략이 가능함
		System.out.println(this.x+"\t"+this.y); // 생략 가능
	}
	
	public void aa() {
		this.disp();
	} // x,y
	public void bb() {} // x,y
	public void cc() {} // x,y
	
}
