package sample08;

public class BookServiceImpl implements BookService {
	private BookDAO bookDao;
	private EmailSender emailSender;
	private MessageSender messageSender;
	
	public BookServiceImpl() {}
	
	public BookServiceImpl(BookDAO bookDao) {
		this.bookDao = bookDao;
	}


	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}


	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	public void save(BookDTO book1, BookDTO book2) {
		bookDao.save(emailSender, messageSender, book1, book2);
	}
	
	
}
