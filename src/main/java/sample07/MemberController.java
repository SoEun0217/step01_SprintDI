package sample07;

public class MemberController {
	private MemberVO memberVO;
	private MemberVO member;
	
	public MemberController() {
		System.out.println("MemberController() call...");
	}

	public MemberController(MemberVO memberVO, MemberVO member) {
		System.out.println("MemberController(MemberVO memberVO, MemberVO member) call...");
		this.memberVO = memberVO;
		this.member = member;
		System.out.println(memberVO + " | " +memberVO.getName());
		System.out.println(member+" | " +member.getName());
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
		System.out.println("setMemberVO(MemberVO memberVO) call..."+memberVO);
	}

	public void setMember(MemberVO member) {
		this.member = member;
		System.out.println("setMember(MemberVO member) call..."+member);
	}
	
	
}
