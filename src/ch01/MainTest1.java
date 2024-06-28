package ch01;

import com.google.gson.Gson;

public class MainTest1 {

	public static void main(String[] args) {

		// Gson <-- 현재 사용불가
		// lib 폴더에 Gson 라이브러리 추가
		// 우리 소스 코드상에서 사용하기 위한 설정이 필요함

		// 프로젝트 속성에서 buildpath -> classpath -> add jars 등록
		Gson gson = new Gson();
		gson.fieldNamingStrategy();

		Student student1 = new Student();
		Student student2 = new Student("햄", 20, "개발");
		
	} //

} //
