package ch02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor // 기본생성자 
@AllArgsConstructor
@ToString
public class Users {

	private int id;
	private String username;
	private String email;
	private Address address;
	private Geo geo;
	
	public class Address{
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	}
	public class Geo{
		private double lat;
		private double lng;
	}
	private String phone;
	
}
