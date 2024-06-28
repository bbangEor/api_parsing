package ch01;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {

	public static void main(String[] args) {

		
		Student student1 = new Student("고길동" , 40 , "둘리학과");
		Student student2 = new Student("둘리" , 40 , "공룡학과");
		
		Dog dog1 = new Dog("콩이", 9);
		Dog dog2 = new Dog("비쥬", 13);
		
		Student[] studentArr = {student1,student2};
		
		Dog[] dogArr = {dog1,dog2};
		
		
		// 특정 형식 (구조화) 되어있는 문자열로 변환하고 싶을땐? -> Json형태
		//Gson gson = new Gson(); 기본형
		Gson gson = new GsonBuilder().setPrettyPrinting().create();  // setPrettyPrinting() 예쁘게 출력하는 기능
		
		Gson gson3 = new Gson();
		String dog1Str = gson.toJson(dog1);
		System.out.println(dog1Str);
		
		Gson gson4 = new Gson();
		String dog2Str = gson.toJson(dog2);
		System.out.println(dog2Str);
		
		// 객체를 JSON 형식의 문자열로 변환시키자 -> toJson() 호출
		String student1Str = gson.toJson(student1); // return 타입 -> String
		System.out.println(student1Str);
		
		Gson gson2 = new Gson();
		String student2Str = gson2.toJson(student2);
		System.out.println(student2Str);
		
		// 객체에서 -> 문자열 형태 , 반대로 ?
		// 문자열에서 -> 클래스 형태 , 어떻게 ?
		
		 Student studentObject = gson.fromJson(student1Str, Student.class );
		System.out.println(studentObject.getName());
		
		System.out.println("----------------------------------");
		
		Dog dogObject = gson.fromJson(dog1Str, Dog.class);
		System.out.println(dogObject.getName());
		
	}

}
