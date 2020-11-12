package sample04;

public class StudentController {
	private StudentService studentService;
	private Student student;
	
	
	public void setStudentService(StudentService studentService) {
		System.out.println("setStudentService(StudentService studentService)  call...");
		this.studentService = studentService;
	}


	public void setStudent(Student student) {
		System.out.println("setStudent(Student student) call...");
		this.student = student;
	}


	public void isnert() {
		//service의 insert를 호출..
		studentService.insert(student);
	}
}
