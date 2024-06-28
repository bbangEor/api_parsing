package ch02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// DTO - 데이터 트랜스퍼 오브젝드
// private --> gson lib --> 변수에 접근하여 json 값을 대입해줌 -> setter 필요
@Setter
@Getter
@NoArgsConstructor // 기본생성자 
@AllArgsConstructor
@ToString
public class Album {

	private int userId;
	private int id;
	private String title;
}