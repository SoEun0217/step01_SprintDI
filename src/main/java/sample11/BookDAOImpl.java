package sample11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {
	@Autowired
	private DbUtil dbUtil;
	public BookDAOImpl() {}
	@Override
	public void save(EmailSender emailSender, MessageSender messageSender, BookDTO book1, BookDTO book2) {
		System.out.println("EmailSender  ="+emailSender);
		System.out.println("MessageSender = "+messageSender);
		System.out.println("book1 = "+book1);
		System.out.println("book2 = "+book2);
		System.out.println("dbUtil = "+dbUtil);
	}

}
