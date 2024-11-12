package complexPostRequest;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class RequestViaPOJOclass {
	@Test
	public void postRequest() {
		PojoClass p = new PojoClass("Professor", "Heist6", "Created", 0);
		
		given().contentType(ContentType.JSON).body(p)
		.when().post("http://49.249.28.218:8091/addProject")
		.then().assertThat().statusCode(201).log().all();
		
	}
}
