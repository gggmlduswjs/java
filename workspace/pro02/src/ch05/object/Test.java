package ch05.object;

public class Test {
	private int id;
	private String name;
	private String phone;
	private int age;
	private float ki;
	
	// 기본 생성자 하나, 매개변수가 있는 생성자 하나
	public Test() {}
	
	
	public Test(int id, String name, String phone, int age, float ki) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.ki = ki;
	}

	// set/ get 함수
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public float getKi() {
		return ki;
	}


	public void setKi(float ki) {
		this.ki = ki;
	}
	
	
	
	
	
	
}
