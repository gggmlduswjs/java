package aa;

public class BB {
	
	public static void main(String[] args) {
	
		AA a=new AA();
		
		// System.out.println(a.x); //ERROR
		System.out.println(a.y); //동일패키지에선 가능
		System.out.println(a.z); //어느 곳에든 사용 가능
		System.out.println(a.su); // 동일패키지에선 가능
		
	}
}
