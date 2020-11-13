package sample11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = 
				new  ClassPathXmlApplicationContext("sample11/applicationContext.xml");
		
		BookController controller = context.getBean("bookController",BookController.class);
		controller.invoker();
		///////////////////////////////////////
		BookDTO dto = new BookDTO("하이", "hello", 2500, "c");
		System.out.println(dto);
	}

}
