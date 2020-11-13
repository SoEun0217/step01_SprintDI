package sample06;

public class Customer {
	private String id;
	private int age;
	private String addr;
	
	public Customer() {
		System.out.println("Customer 의 기본 생성자입니다.");
	}

	public Customer(String id) {
		System.out.println("Customer(String id)입니다."+id);
		this.id = id;
	}

	public void setId(String id) {
		System.out.println(" setId(String id)"+id);
		this.id = id;
	}

	public void setAge(int age) {
		System.out.println("setAge(int age)"+age);
		this.age = age;
	}

	public void setAddr(String addr) {
		System.out.println("setAddr(String addr)"+addr);
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return id+" | "+age+" | "+addr;
	}
	
	
}
