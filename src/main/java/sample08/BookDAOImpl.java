package sample08;

public class BookDAOImpl implements BookDAO {
	private DbUtil dbUtil;
	public BookDAOImpl(){}
	public BookDAOImpl (DbUtil dbUtil){
		this.dbUtil=dbUtil;
	}
	
	public void save(EmailSender eamilSender,MessageSender messageSender,BookDTO book1,BookDTO book2) {
		System.out.println("emailSender = "+eamilSender);
		System.out.println("messageSender = "+messageSender);
		System.out.println("book1 = "+ book1);
		System.out.println("book2 =" +book2);
		System.out.println("DbUtil = "+dbUtil);
	}
}
