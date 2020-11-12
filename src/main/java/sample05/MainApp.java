package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sample05/MessageDIConstructor.xml");
		OrderMessage message = context.getBean("message",OrderMessage.class);//impl을 호출하면 안된다....
		message.getOrderMessage();
	}
}
