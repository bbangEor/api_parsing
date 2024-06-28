package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.ToString;

public class MyHttpAlbumClient {

	public static void main(String[] args) {

		// 순수 자바 코드 -> Http 통신을 위한 준비물
		// 1. 서버 주소 경로
		// 2. URL 클래스
		// 3. url.openConnection() <- 스트림 I/O

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/albums/1");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 데이터 타입 다운캐스팅
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");

			// 응답코드 확인
			int responseCode = conn.getResponseCode();
			System.out.println("response code : " + responseCode);
			// 200 -> 성공 / 500 -> 서버 자체의 연산이 잘못됨 / 400 -> x

			// HTTP 응답 메세지에 데이터 추출 [] -- Stream -- []
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer buffer = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				buffer.append(inputLine);
			}
			in.close();

			System.out.println(buffer.toString());

			System.out.println("----------------------------");

			// gson lib 사용
			// Gson gson = new Gson();
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			Album albumDTO = gson.fromJson(buffer.toString(), Album.class);

			System.out.println(albumDTO.getId());
			System.out.println(albumDTO.getUserId());
			System.out.println(albumDTO.getTitle());

		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
