package sample09;

import javax.annotation.Resource;

public class ResourceBean {
	@Resource(name= "dto")//name의 값과 xml의 id의 이름을 일치하는 객체를 찾아서 주입한다.
	private EmpDTO emp1;
	@Resource(name="empDTO")
	private EmpDTO emp2;
	@Resource(name = "service")
	private EmpService service;
	@Resource(name = "controller")
	private EmpController empController;
	
	public void test() {
		System.out.println("emp1 : "+emp1);
		System.out.println("emp2 : "+emp2);
		System.out.println("service : "+service);
		System.out.println("empController : "+empController);
	}
	
}
