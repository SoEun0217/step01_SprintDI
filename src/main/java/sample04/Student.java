package sample04;

public class Student {
	private String name;
	private int no;
	private String phone;
	private String addr;
	
	public Student() {
		System.out.println("Student의 기본생성자 call...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName(String name) call...");
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		System.out.println("setNo(int no) call...");
		this.no = no;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		System.out.println("setPhone(String phone) call...");
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		System.out.println("setAddr(String addr) call...");
		this.addr = addr;
	}
	
	
}
