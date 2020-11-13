package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component //id="boardController"
@Controller
public class BoardController {
	
	@Autowired //BoardDTO는 한번만 생성해서 두개다 같은 객체가 될 것이다.
	private BoardDTO boardDTO;
	@Autowired
	private BoardDTO boardDTO2;
	@Autowired
	private BoardService boardService;
	
	public BoardController () {}
	public void test() {
		System.out.println("BoardController의 test() call...");
		System.out.println("boardDTO : "+boardDTO);
		System.out.println("boardDTO2 : "+boardDTO2 );
		
		boardService.select();
	}
}
