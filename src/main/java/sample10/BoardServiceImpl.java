package sample10;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component //id="boardServiceImpl"이 된다.
@Service
public class BoardServiceImpl implements BoardService {
	
	@Resource(name = "boardDAOImpl")
	private BoardDAO boardDao;
	
	@Resource(name = "mybatisDao")
	private BoardDAO boardMyBatisDAOImpl;
	
	public BoardServiceImpl() {}
	
	@Override
	public void select() {
		System.out.println("BoardServiceImpl의 select() call....");
		boardDao.select();
		boardMyBatisDAOImpl.select();
	}

}
