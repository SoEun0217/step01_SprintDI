package sample08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public MainApp(){}
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sample08/springDIAutowire.xml");
		BookController controller = context.getBean("bookController",BookController.class);
		controller.invoker();
	}
}
