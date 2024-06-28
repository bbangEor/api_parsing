package ch01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // 생성자
@AllArgsConstructor // 위에 전부다 만들기
@Builder 
public class Student extends Object {

	private String name;
	private int age;
	private String major;
	
	
}
