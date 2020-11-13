package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository //id = "boardDAOImpl"
public class BoardDAOImpl implements BoardDAO {
	
	public BoardDAOImpl() {}
	
	@Override
	public void select() {
		System.out.println("BoardDAOImpl의 select() call...");
	}

}
