package sample02;

public class MemberDAO {
	public MemberDAO() {
		System.out.println("MemberDAO의 생성자 입니다....");
	}
	
	public void insert(Member member) {
		System.out.println("MemberDAO의 insert 호출됨");
		System.out.println(member);
	}
}
