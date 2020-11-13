package sample10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//id는 기본적으로 class이름의 첫글자만 소문자로 만들어진다.
@Component //<bean class="BoardDTO" id="boardDTO"  />동일 첫글자 소문자로 같은 이름
@Scope("prototype")//필요할 때 생성해라..
public class BoardDTO {
	@Value("10")
	private int no;
	
	@Value("Spring")
	private String subject;
	
	@Value("재미있다!")
	private String content;
	
	public BoardDTO() {}

	public BoardDTO(int no, String subject, String content) {
		super();
		this.no = no;
		this.subject = subject;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
