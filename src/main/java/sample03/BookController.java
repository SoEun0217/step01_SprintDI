package sample03;

public class BookController {
	private BookDAO dao;
	private BookVO book;
	public BookController() {}
	public BookController(BookDAO dao,BookVO book) {
		this.dao = dao;
		this.book = book;
	}
	public void bookinsert() {
		dao.insert(book);
	}
}
