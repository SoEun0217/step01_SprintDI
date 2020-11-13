package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("mybatisDao")  //id="mybatisDao" id 변경 가능
@Repository("mybatisDao")
public class BoardMyBatisDAOImpl implements BoardDAO {

	public BoardMyBatisDAOImpl() {}
	
	@Override
	public void select() {
		System.out.println("BoardMyBatisDAOImpl의 select() call....");
	}

}
