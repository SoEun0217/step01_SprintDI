package sample03;

public class BookDAOImpl implements BookDAO {
	public BookDAOImpl() {
		System.out.println("BookDAOImpl이 호출..");
	}

	public void insert(BookVO book) {
		System.out.println("BookDAOImpl의 insert호출...");
		//System.out.println(book);
		System.out.println("과목 : "+book.getSubject());
		System.out.println("작성자 : "+book.getWriter());
		System.out.println("가격 : "+book.getPrice());
		System.out.println("날짜 : "+book.getDate());
		
	}

}
