package basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PreKnowledge {
	
	@Test
	public void sampleGetReq() {
		// calling static method with Class Name
		Response resp= RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(resp);
		System.out.println(resp.prettyPrint());
		System.out.println("-=-=-=-=--=-=-=-=-=-=-=-=-=-");
		
		// calling static method with directly coz we imported static import
		get("https://reqres.in/api/users?page=2").then().log().all();
		
	}
}
