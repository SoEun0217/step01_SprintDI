package sample01;

public class MessageBeanKoImpl implements MessageBean {
	
	public MessageBeanKoImpl() {
		System.out.println("MessageBeanKoImpl의 생성자입니다.");
	}
	
	
	public void sayHello(String name) {
		System.out.println(name+"반가워요");
	}


}
