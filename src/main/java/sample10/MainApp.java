package sample10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sample10/applicationContext.xml");
		
		BoardController controller = 
				context.getBean("boardController",BoardController.class);//변수명 잘 확인하자 Component명을 어떻게 줫는지
		controller.test();
	}

}
