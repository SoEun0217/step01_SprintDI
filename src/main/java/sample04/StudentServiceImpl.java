package sample04;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO;
	
	public void setStudentDAO(StudentDAO studentDAO) {//<property name=""
		System.out.println("setStudentDAO(StudentDAO studentDAO) call...");
		this.studentDAO = studentDAO;
	}
	
	public void insert(Student student) {
		System.out.println("StudentServiceImpldml insert(Student student) call...");
		//dao의 insert를 호출한다.
		studentDAO.insert(student);
	}

}
