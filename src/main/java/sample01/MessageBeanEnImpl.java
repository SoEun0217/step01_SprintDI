package sample01;

public class MessageBeanEnImpl implements MessageBean {
	
	public MessageBeanEnImpl() {
		System.out.println("MessageBeanEnImpl의 생성자 호출됨");
	}
	public void sayHello(String name) {
		System.out.println("Hello~"+name);
	}

}
