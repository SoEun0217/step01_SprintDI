package sample04;

public class StudentDAOImpl implements StudentDAO {

	public void insert(Student student) {
		System.out.println("StudentDAOImpl의 insert가 호출");
		System.out.println("이름 : " +student.getName());
		System.out.println("번호 : "+student.getNo());
		System.out.println("전화번호  : "+student.getPhone());
		System.out.println("주소 : "+student.getAddr());
	}

}
