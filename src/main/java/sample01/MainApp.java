package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//1. 기존 방식
		/*
		 * MessageBean bean = new MessageBeanEnImpl(); bean.sayHello("soeun");
		 * 
		 * bean = new MessageBeanKoImpl(); bean.sayHello("소은");
		 */
		//Spring의 목적 - 결합도를 낮추는 것
		//외부의 container로 부터 객체를 생성해서 넣어준다.
		
		////////////////////////////////////////////////////////
		//2. Spring Container 이용(IoC 개념 적용)
		//container가 만들어졌다면 이미 객체들이 생성되있는것
		/**
		 * ApplicationContext
		 *  	: BeanFactory(객체 생성+소멸)의 확장개념(다국어지원,메시지처리)
		 *  	: 객체를 사전초기화(미리 메모리에 할당한다 scope="singleton"
		 *  	: 만약, 지연초기화(필요할 때마다 새롭게 생성)scope = "prototype"변경
		 *  	 scope="prototype"를 설정하면 getBean을 요청할때마다 새로운 객체를 생성해준다.
		 * */
		ApplicationContext context =
				//new ClassPathXmlApplicationContext("sample01/applicationContext.xml");
				new FileSystemXmlApplicationContext("src/main/java/sample01/applicationContext.xml");
					
		MessageBean bean = context.getBean("en" , MessageBean.class);
		//두번째 인수에 interface가 아니라 impl를 넣으면 의미가 없다.
		//interface를 넣어줘야한다.
		bean.sayHello("soeun");
		bean = context.getBean("ko",MessageBean.class);
		bean.sayHello("소은");
		
		System.out.println("==========================================");
		MessageBean bean2 = context.getBean("ko",MessageBean.class);
		System.out.println("bean : "+bean);
		System.out.println("bean2 : "+bean2);
		//두개의 주소값은 같다.
	}

}
