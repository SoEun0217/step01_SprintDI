package sample02;

public class Member {
	private String id;
	private String pwd;
	private int age;
	private String addr;
	
	public Member() {
		System.out.println("Member의 기본 생성자....");
	}
	
	public Member(String id) {
		System.out.println("Member(String id)생성자 호출... id = "+id);
		this.id=id;
	}
	
	
	  public Member(String id,String pwd) {
	  System.out.println("Member(String pwd)생성자 호출 id : "+id+"   비밀번호 : "+pwd);
	  this.id = id; this.pwd = pwd; }
	 
	
	public Member(String id,int age) {
		System.out.println("Member(String pwd)생성자 호출 id : "+id+"   나이 : "+age);
		this.id = id;
		this.age =age;
	}

	public Member(String id,int age, String addr) {
		System.out.println("Member(String id, int age, String addr) 생성자..");
		this.id = id;
		this.age = age;
		this.addr = addr;
	}
	
	public Member(String id, String pwd, int age, String addr) {
		System.out.println("Member(String id, String pwd, int age, String addr) 생성자..");
		this.id = id;
		this.pwd = pwd;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return id+ " | "+ pwd +" | "+age+" | "+addr ;
	}
	
	
	
	
}
