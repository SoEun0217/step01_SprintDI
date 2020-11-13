package sample11;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Scope("prototype")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDTO {
	@Value("Spring")
	private String subject;
	@Value("소은")
	private String writer;
	private int price;
	private String date;

	
}
