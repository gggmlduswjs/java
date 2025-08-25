package ch05.object;

public class Pay {
	public String name;
	public int bonbong;		// 왕눈이
	public int tex;			// 20000000
	public int silsu;
	
	// name=n=왕눈이, bonbong=b=20000000
	public void input(String n, int b) {
		name=n;
		bonbong=b;
	}
	
	public void yonsan() {
		tex=(int)(bonbong*0.045+0.5);
		silsu=bonbong-tex;
	}
	
	public void output() {
		System.out.println("name:"+name);
		System.out.println("bonbong:"+bonbong);
		System.out.println("tex:"+tex);
		System.out.println("silsu:"+silsu+"\t");
	}

}

// a.name, a.bonbong, a.tex, a.silsu
// a.input()
