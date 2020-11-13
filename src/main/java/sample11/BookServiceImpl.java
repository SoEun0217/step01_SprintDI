package sample11;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO bookDao;
	@Resource
	private EmailSender emailSender;
	@Autowired
	private MessageSender messageSender;

	public BookServiceImpl() {}
	
	@Override
	public void save(BookDTO book1, BookDTO book2) {
		bookDao.save(emailSender, messageSender, book1, book2);
	}

}
